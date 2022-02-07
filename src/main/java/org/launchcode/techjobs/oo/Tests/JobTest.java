package org.launchcode.techjobs.oo.Tests;

import org.junit.Test;

public class JobTest {

    @Test
    public void testSettingJobId(){

    }

    private int id;
    private static int nextId = 1;
    private String value;

    public JobTest() {
        id = nextId;
        nextId++;
    }

    public JobTest(String value) {
        this();
        this.value = value;
    }

}
