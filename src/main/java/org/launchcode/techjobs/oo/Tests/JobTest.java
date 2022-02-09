package org.launchcode.techjobs.oo.Tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1.getId() + 1, job2.getId());
        assertFalse(job1.getId() == job2.getId());
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job.getName(), "Product tester");
        assertTrue(job.getName() instanceof String);
        assertEquals(job.getEmployer().getValue(), "ACME");
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals(job.getLocation().getValue(), "Desert");
        assertTrue(job.getLocation() instanceof Location);
        assertEquals(job.getPositionType().getValue(), "Quality control");
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringReturnsUnderscoresWhenNoValuesGiven() {
        Job job = new Job();
        String output = job.toString();

        assertEquals(
                "ID: " + job.getId() + "\n" +
                "Name: _______\n" +
                "Employer: _______\n" +
                "Location: _______\n" +
                "Position Type: _______\n" +
                "Core Competency: _______\n", output);
    }


    @Test
    public void testToStringReturnsUnderscoresWhenValuesGiven() {
        Job job = new Job("Jason Todd", new Employer("Wayne Enterprises"), new Location("Gotham City"), new PositionType("Intern"), new CoreCompetency("Batarangs"));
        String output = job.toString();

        assertEquals(
                "ID: " + job.getId() + "\n" +
                        "Name: Jason Todd\n" +
                        "Employer: Wayne Enterprises\n" +
                        "Location: Gotham City\n" +
                        "Position Type: Intern\n" +
                        "Core Competency: Batarangs\n", output);
    }

}




