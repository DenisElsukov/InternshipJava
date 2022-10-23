package com.internship.game.characters;

import com.internship.game.characters.Environment.TimesDay;
import com.internship.game.characters.Сompanion.Companion;


public class MyHeroTest {

    private String name;
    private int speed ;
    private double energy ;
    private double intelligence ;
    private String race;
    private String gender;
    private double agility;
    private String classHero;


    protected MyHeroTest(String name, int speed, double energy, double intelligence, String race, String gender, double agility, String classHero) {
        this.name = name;
        this.speed = speed;
        this.energy = energy;
        this.intelligence = intelligence;
        this.race = race;
        this.gender = gender;
        this.agility = agility;
        this.classHero = classHero;
    }

    public String getClassHero() {
        return classHero;
    }

    public void setClassHero(String classHero) {
        this.classHero = classHero;
    }

    public void companionGivePower(Companion companion) {

        switch (companion.name()) {
            case "EAGLE" -> {
                energy = energy + 2;
                speed = speed + 1;
                System.out.println("Now energy: " + energy);
                System.out.println("Now speed: " + speed);
            }
            case "SNAKE" -> {
                agility = agility + 2;
                intelligence = intelligence + 1;
                System.out.println("Now agility: " + agility);
                System.out.println("Now intelligence: " + intelligence);
            }
            case "BEAR" -> {
                energy = energy + 2;
                intelligence = intelligence + 1;
                System.out.println("Now energy: " + energy);
                System.out.println("Now intelligence: " + intelligence);
            }
            case "TIGER" -> {
                energy = energy + 2;
                intelligence = intelligence + 1;
                System.out.println("Now speed: " + speed);
                System.out.println("Now intelligence: " + intelligence);
            }
            case "RAVEN" -> {
                intelligence = intelligence + 2;
                speed = speed + 1;
                System.out.println("Now intelligence: " + intelligence);
                System.out.println("Now energy: " + energy);
            }
        }
    }

    public void influenceDay(TimesDay timesDay) {

        switch (timesDay.name()) {
            case "SUNRISE" -> {
                if(race.equals("Elf")) {
                    intelligence = intelligence + 1;
                }
            }
            case "MORNING" -> {
                if(classHero.equals("Warrior")) {
                    energy = energy + 1;
                }
            }
            case "NOON" -> {
                if(race.equals("Gnome")) {
                    speed = speed + 1;
                }
            }
            case "EVENING" -> {
                if(classHero.equals("Wizard")) {
                    agility = agility + 1;
                };
            }
            case "SUNSET" -> {
                if (race.equals("Human")) {
                    energy = energy + 1;
                }
            }
            case "NIGHT" -> {
                if (race.equals("Orc")) {
                    speed = speed + 1;
                }
            }

            case "FULL_MOON" -> {
                if (classHero.equals("Rogue")) {
                    speed = speed + 1;
                }
            }
        }
    }


    public static void main(String[] args) {

        MyHeroTest myHeroTest = new MyHeroTest("Arven", 10, 10.0,10, "Elf", "female",  10, "Warrior");
        MyHeroTest myHeroTest2 = new MyHeroTest("Garry", 10, 10.0,10, "Human", "male",  10, "Wizard");

        Companion companion = Companion.RAVEN;
        Companion companion2 = Companion.TIGER;

        TimesDay timesDay = TimesDay.SUNRISE;
        TimesDay timesDay2 = TimesDay.EVENING;

        System.out.println("\n" + companion.getGreeting());
        myHeroTest.companionGivePower(companion);
        System.out.println("intelligence: " + myHeroTest.intelligence);

        System.out.println("\n" + companion2.getGreeting());
        myHeroTest2.companionGivePower(companion2);
        System.out.println("intelligence: " + myHeroTest2.intelligence);

        System.out.println("\n" + timesDay.getAtmosphereAround());
        myHeroTest.influenceDay(timesDay);
        System.out.println("intelligence: " + myHeroTest.intelligence);

        System.out.println("\n" + timesDay2.getAtmosphereAround());
        myHeroTest2.influenceDay(timesDay2);
        System.out.println("agility: " + myHeroTest2.agility);



//        Можно изменить через сеттер знание enum?

//        companion.setEnergy(12);
//        System.out.println(companion.getEnergy());


        /*Эксперименты с воином*/
//        Warrior warrior = new Warrior("Aragorn", "human", "male");
//
//        warrior.attack();
//        System.out.println(warrior.getRace());
//        System.out.println(warrior.getAgility());
//        System.out.println(warrior.getEnergy());
    }
}
