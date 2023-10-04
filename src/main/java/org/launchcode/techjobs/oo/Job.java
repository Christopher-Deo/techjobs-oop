package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Constructor to initialize the id field with a unique value.
    public Job() {
        id = nextId;
        nextId++;
    }

    // Second constructor to initialize all fields and call the first constructor to set id.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Custom equals method to compare Job objects based on their id fields.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    // Custom hashCode method that generates a hash code based on the id field.
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and setters for fields (excluding nextId and id).

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // Getter for the id field.
    public int getId() {
        return id;
    }

    // toString method to pass the first test
    @Override
    public String toString() {
        String newline = System.lineSeparator();

        // Check if all fields are empty except for the id field
        if (name == null || name.isEmpty() &&
                employer.getValue() == null || employer.getValue().isEmpty()  &&
                location.getValue() == null || location.getValue().isEmpty()&&
                positionType.getValue() == null || positionType.getValue().isEmpty()&&
                coreCompetency.getValue() == null || coreCompetency.getValue().isEmpty()) {
            return newline +
                    "ID: " + id + newline +
                    "OOPS! This job does not seem to exist." + newline;
        }

        // For other cases, return the regular representation
        if (name.isEmpty()){
            name = "Data not available";
        }
        if (employer.getValue() == null || employer.getValue().isEmpty() ){
            employer.setValue("Data not available");
        }
        if (location.getValue()== null  || location.getValue().isEmpty()) {
            location.setValue("Data not available");
        }
        if (positionType.getValue() == null || positionType.getValue().isEmpty()) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == null  || coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue("Data not available");
        }

        return newline +
                "ID: " + id + newline +
                "Name: " + name + newline +
                "Employer: " + employer + newline +
                "Location: " + location + newline +
                "Position Type: " + positionType + newline +
                "Core Competency: " + coreCompetency + newline;
    }

}