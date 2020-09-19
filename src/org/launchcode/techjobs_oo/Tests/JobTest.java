package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job testJobOne;
    Job testJobTwo;
    Job testJobThree;
    Job testJobFour;
    Job testJobEmployer;


    @Before
    public void createJob() {
        testJobOne = new Job();
        testJobTwo = new Job();
        testJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobEmployer = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
     public void testSettingJobId(){
        assertEquals(testJobOne.getId() + 1, testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals(true, testJobThree.getName() instanceof String);
        assertEquals(true, testJobThree.getEmployer() instanceof Employer);
        assertEquals(true, testJobThree.getLocation() instanceof Location);
        assertEquals(true, testJobThree.getPositionType() instanceof PositionType);
        assertEquals(true, testJobThree.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        assertEquals(false, testJobFour.equals(testJobThree));

    }

    @Test
    public void testToStringContainsBlankLineBeforeAfterJob(){
        Assert.assertTrue(testJobThree.toString(testJobThree).contains("\nID"));
        Assert.assertTrue(testJobThree.toString(testJobThree).contains(testJobThree.getCoreCompetency() + "\n"));
    }

    @Test
    public void testToStringHasFieldsLabelsAndData(){
        assertEquals("\nID: " + testJobThree.getId() + "\nName: " + testJobThree.getName() + "\nEmployer: " +
                "" + testJobThree.getEmployer() + "\nLocation: " + testJobThree.getLocation() + "\nPosition Type: " +
            "" + testJobThree.getPositionType() + "\nCore Competency: " + testJobThree.getCoreCompetency() + "\n" +
                "", testJobThree.toString(testJobThree));

    }

    @Test
    public void testToStringEmptyEmployer(){
        assertEquals("\nID: " + testJobEmployer.getId() + "\nName: " + testJobEmployer.getName() + "\nEmployer: " +
                "Data not available" + "\nLocation: " + testJobEmployer.getLocation() + "\nPosition Type: " +
                "" + testJobEmployer.getPositionType() + "\nCore Competency: " + testJobEmployer.getCoreCompetency() + "\n" +
                "", testJobEmployer.toString(testJobEmployer));
    }


}
