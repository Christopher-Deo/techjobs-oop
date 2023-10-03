package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;


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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // Create a Job object with some data
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Get the result of toString() method
        String jobString = job.toString();

        // Define the expected newline character
        String newline = System.lineSeparator();

        // Verify that the string starts and ends with a newline character
        assertEquals(newline + "ID: " + job.getId() + newline +
                "Name: Product tester" + newline +
                "Employer: ACME" + newline +
                "Location: Desert" + newline +
                "Position Type: Quality control" + newline +
                "Core Competency: Persistence" + newline, jobString);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Create a Job object with some data
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Get the result of toString() method
        String jobString = job.toString();

        // Define the expected newline character
        String newline = System.lineSeparator();

        // Verify that the string contains correct labels and data for each field
        assertEquals(newline +
                "ID: " + job.getId() + newline +
                "Name: Product tester" + newline +
                "Employer: ACME" + newline +
                "Location: Desert" + newline +
                "Position Type: Quality control" + newline +
                "Core Competency: Persistence" + newline, jobString);
    }

    @Test
    public void testToStringHandlesEmptyFields() {
        // Create a Job object with empty fields
        Job job = new Job("", null, null, null, null);

        // Get the result of toString() method
        String jobString = job.toString();

        // Define the expected newline character
        String newline = System.lineSeparator();

        // Verify that the string contains "Data not available" for empty fields
        assertEquals(newline +
                "ID: " + job.getId() + newline +
                "Name: Data not available" + newline +
                "Employer: Data not available" + newline +
                "Location: Data not available" + newline +
                "Position Type: Data not available" + newline +
                "Core Competency: Data not available" + newline, jobString);
    }

    @Test
    public void testToStringHandlesOnlyIdField() {
        // Create a Job object with only the id field set
        Job job = new Job();

        // Get the result of toString() method
        String jobString = job.toString();

        // Define the expected newline character
        String newline = System.lineSeparator();

        // Verify that the string contains the message for only the id field being set
        assertEquals(newline +
                "ID: " + job.getId() + newline +
                "OOPS! This job does not seem to exist." + newline, jobString);
    }
}