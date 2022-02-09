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

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.coreCompetency = coreCompetency;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String sName;
        if (name == null || name == "" ) {
            sName = "Data not available";
        } else {
            sName = name;
        }
        String sEmployer;
        if (employer == null || employer.equals(new Employer(""))) {
            sEmployer = "Data not available";
        } else {
            sEmployer = employer.toString();
        }
        String sLocation;
        if (location == null || location.equals(new Location(""))) {
            sLocation = "Data not available";
        } else {
            sLocation = location.toString();
        }
        String sPositionType;
        if (positionType == null || positionType.equals(new PositionType(""))) {
            sPositionType = "Data not available";
        } else {
            sPositionType = positionType.toString();
        }
        String sCoreCompetency;
        if (coreCompetency == null || coreCompetency.equals(new CoreCompetency(""))) {
            sCoreCompetency = "Data not available";
        } else {
            sCoreCompetency = coreCompetency.toString();
        }
        if(name == null && employer == null && location == null && positionType == null && coreCompetency == null){
            return "OOPS! This job does not seem to exist.\n";
        }

        return "ID: " + id + "\n" +
                "Name: " + sName + "\n" +
                "Employer: " + sEmployer + "\n" +
                "Location: " + sLocation + "\n" +
                "Position Type: " + sPositionType + "\n" +
                "Core Competency: " + sCoreCompetency + "\n";

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
}
