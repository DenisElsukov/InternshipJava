package com.internship.game.characters.Environment;

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

}
