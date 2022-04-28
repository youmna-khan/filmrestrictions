package org.example;

import java.util.List;

public class MovieRestriction {

    public String getRestrictions(int age){
        if(age < 12) {
            return "U, PG & 12 films are available.";
//            return List.of("U", "PG");
        } else if(age < 15) {
            return "U, PG, 12 & 15 films are available.";
        } else {
            return "All films are available.";
        }
    }
}


