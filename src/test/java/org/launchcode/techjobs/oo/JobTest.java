package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        // Create two Job objects using the empty constructor
        Job job1 = new Job();
        Job job2 = new Job();

        // Use assertNotEquals to verify that the IDs of the two objects are distinct
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // Declare and initialize a new Job object with data
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Use assertTrue and assertEquals to test the constructor assignments

        // Check if the name field is assigned correctly
        assertTrue(job.getName().equals("Product tester"));
        // Check if the employer field is assigned correctly
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        // Check if the location field is assigned correctly
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        // Check if the positionType field is assigned correctly
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());
        // Check if the coreCompetency field is assigned correctly
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Generate two Job objects with identical field values except for id
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Test that equals returns false
        assertFalse(job1.equals(job2));
    }
}