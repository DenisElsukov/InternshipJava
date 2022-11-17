package com.internship.game.characters.builder_by_evgen;

import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

public class CreateStandartWarrior extends CharactersBuilder {

    @Override
    protected void buildName() {
        character.setName("John");
    }

    @Override
    protected void buildGender() {
        character.setGender("male");
    }

    @Override
    protected void buildRace() {
        character.setRace("human");
    }

    @Override
    protected void buildCompanion() {
        character.setCompanion(Companion.BEAR);
    }

    @Override
    protected void buildWeapon() {
        character.setWeapon(Weapon.SWORD);
    }

    @Override
    protected void buildEquipment() {
        character.setEquipment(Equipment.SKIN_ARMOR);
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
}
