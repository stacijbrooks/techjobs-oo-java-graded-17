package org.launchcode.techjobs.oo;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here

    private Job testJob1;
    private Job testJob2;

    @Test
    public void testSettingJobId() {
        // Create two Job objects using the empty constructor
        testJob1 = new Job();
        testJob2 = new Job();
        // Verify that the IDs of the two objects are not equal
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // Create a new Job object with specific field values using the full constructor
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Verify that the object is an instance of Job
        assertTrue(testJob instanceof Job);
        // Verify that each field of the object has been correctly initialized
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Create two Job objects with identical field values except for ID
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Verify that the IDs of the two objects are not equal
        assertNotEquals(testJob1.getId(), testJob2.getId());
        // Verify that the two objects are not considered equal
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // Create a Job object with only ID
        Job testJob = new Job();
        String expected = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();
        assertEquals(expected, testJob.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String actual = testJob.toString();
        assertTrue(actual.contains("ID: " + testJob.getId()));
        assertTrue(actual.contains("Name: Product tester"));
        assertTrue(actual.contains("Employer: ACME"));
        assertTrue(actual.contains("Location: Desert"));
        assertTrue(actual.contains("Position Type: Quality control"));
        assertTrue(actual.contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job();
        String actual = testJob.toString();
        assertTrue(actual.contains("Name: Data not available"));
        assertTrue(actual.contains("Employer: Data not available"));
        assertTrue(actual.contains("Location: Data not available"));
        assertTrue(actual.contains("Position Type: Data not available"));
        assertTrue(actual.contains("Core Competency: Data not available"));
    }


}