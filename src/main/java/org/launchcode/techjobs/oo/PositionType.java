package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

    public PositionType() {
        super(); // Calls the constructor of the superclass (JobField)
    }

    public PositionType(String value) {
        super(value); // Calls the constructor of the superclass (JobField) with the provided value
        // You can initialize any additional fields specific to the CoreCompetency class here.
    }
}