package com.internship.game.characters.enviroment;

public enum TimesDay {

    SUNRISE("The sun rises! Soon there will be no hiding."),
    MORNING("A new day has begun! Go hero!"),
    NOON("The sun is high! Hurry up!"),
    EVENING("And now it's getting dark! Are you looking for shelter?"),
    SUNSET("This is the most beautiful and insidious time! Be careful!"),
    NIGHT("Darkness around...Time to rest or go forward!"),
    FULL_MOON("The beautiful moon lights the way!");

    private final String atmosphereAround;

    TimesDay(String atmosphereAround) {
        this.atmosphereAround = atmosphereAround;
    }

    public String getAtmosphereAround() {
        return atmosphereAround;
    }


    //    public static void influenceDay(TimesDay timesDay, Character character) {
//
//        System.out.println(timesDay.getAtmosphereAround());
//
//        switch (timesDay) {
//            case SUNRISE -> {
//                if (character.getRace().equals("Elf")) {
//                    character.setIntelligence(character.getIntelligence() + 1);
//                    System.out.println("Intelligence +1");
//                }
//            }
//            case MORNING -> {
//                if (character instanceof WarriorBuilder) {
//                    character.setEnergy(character.getEnergy() + 1);
//                    System.out.println("Energy +1");
//                }
//            }
//            case NOON -> {
//                if (character.getRace().equals("Gnome")) {
//                    character.setSpeed(character.getSpeed() + 1);
//                    System.out.println("Speed +1");
//                }
//            }
//            case EVENING -> {
//                if (character instanceof Wizard) {
//                    character.setAgility(character.getAgility() + 1);
//                    System.out.println("Agility +1");
//                }
//                ;
//            }
//            case SUNSET -> {
//                if (character.getRace().equals("Human")) {
//                    character.setEnergy(character.getEnergy() + 1);
//                    System.out.println("Energy +1");
//                }
//            }
//            case NIGHT -> {
//                if (character.getRace().equals("Orc")) {
//                    character.setSpeed(character.getSpeed() + 1);
//                    System.out.println("Speed +1");
//                }
//            }
//
//            case FULL_MOON -> {
//                if (character instanceof RogueBuilder) {
//                    character.setSpeed(character.getSpeed() + 1);
//                    System.out.println("Speed +1");
//                }
//            }
//        }
//    }

}
