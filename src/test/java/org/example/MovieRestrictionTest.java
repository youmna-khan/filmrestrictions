package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieRestrictionTest {

    MovieRestriction movieRestriction = new MovieRestriction();

    @Test
    public void under12(){
        String actualResult = movieRestriction.getRestrictions(11);

        Assertions.assertEquals("U, PG & 12 films are available.", actualResult);
    }

    @Test
    public void equals12(){
        String actualResult = movieRestriction.getRestrictions(12);

        Assertions.assertEquals("U, PG, 12 & 15 films are available.", actualResult);
    }

    @Test
    public void under15(){
        String actualResult = movieRestriction.getRestrictions(14);

        Assertions.assertEquals("U, PG, 12 & 15 films are available.", actualResult);
    }

    @Test
    public void equals15(){
        String actualResult = movieRestriction.getRestrictions(15);

        Assertions.assertEquals("All films are available.", actualResult);
    }

    @Test
    public void above15(){
        String actualResult = movieRestriction.getRestrictions(16);

        Assertions.assertEquals("All films are available.", actualResult);
    }
}