package com.internship.game.characters.builder_by_evgen;

import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateCustomHero extends CharactersBuilder{
    @Override
    void buildName() {
        System.out.println("Enter your name:");
        try {
            character.setName(enterString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void buildGender() {
        try {
            System.out.println("Enter your gender:");
            character.setGender(enterString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void buildRace() {
        System.out.println("Enter your race:");
        try {
            character.setRace(enterString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void buildCompanion() {
        System.out.println("Choose your companion");
        System.out.println("1.Snake  2.Tiger  3.Bear  4.Dog  5.Eagle  6.Raven");

        try {
            character.setCompanion(chooseCompanion());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void buildWeapon() {
        System.out.println("Choose your weapon");
        System.out.println("1.Sword  2.Bow  3.Axe  4.Staff");

        try {
            character.setWeapon(chooseWeapon());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void buildEquipment() {
        System.out.println("Choose your equipment");
        System.out.println("1.Skin armor  2.Chain armor  3.Armor");

        try {
            character.setEquipment(chooseEquipment());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void buildAgility() {
        character.setAgility(sumAgility(character.getWeapon(), character.getEquipment()));
    }

    @Override
    void buildEnergy() {
        character.setEnergy(sumEnergy(character.getWeapon(), character.getEquipment(), character.getCompanion()));
    }

    @Override
    void buildIntelligence() {
        character.setIntelligence(sumIntelligence(character.getWeapon(), character.getEquipment()));
    }

    @Override
    void buildSpeed() {
        character.setSpeed(sumSpeed(character.getWeapon(), character.getEquipment()));

    }

    double sumAgility(Weapon weapon, Equipment equipment){
        return character.getAgility() + weapon.getAgilityDifference() + equipment.getAgilityDifference();
    }
    double sumEnergy(Weapon weapon, Equipment equipment, Companion companion){
        return character.getEnergy() + weapon.getEnergyDifference() + equipment.getEnergyDifference()+ companion.getEnergy();
    }
    double sumIntelligence(Weapon weapon, Equipment equipment){
        return character.getIntelligence() + weapon.getIntelligenceDifference() + equipment.getIntelligenceDifference();
    }
    double sumSpeed(Weapon weapon, Equipment equipment){
        return character.getSpeed() + weapon.getSpeedDifference() + equipment.getSpeedDifference();
    }

    String enterString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    Companion chooseCompanion() throws IOException {
        Companion companion = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch(reader.readLine()){

            case "1": companion = Companion.SNAKE;
                break;
            case "2": companion = Companion.TIGER;
                break;
            case "3": companion = Companion.BEAR;
                break;
            case "4": companion = Companion.DOG;
                break;
            case "5": companion = Companion.EAGLE;
                break;
            case "6": companion = Companion.RAVEN;
                break;
        }
        return companion;
    }

    Weapon chooseWeapon() throws IOException {
        Weapon weapon = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch(reader.readLine()){

            case "1": weapon = Weapon.SWORD;
                break;
            case "2": weapon = Weapon.BOW;
                break;
            case "3": weapon = Weapon.AXE;
                break;
            case "4": weapon = Weapon.STAFF;
                break;
        }
        return weapon;
    }

    Equipment chooseEquipment() throws IOException {
        Equipment equipment = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch(reader.readLine()){

            case "1": equipment = Equipment.SKIN_ARMOR;
                break;
            case "2": equipment = Equipment.CHAIN_ARMOR;
                break;
            case "3": equipment = Equipment.ARMOR;
                break;
        }
        return equipment;
    }
}

