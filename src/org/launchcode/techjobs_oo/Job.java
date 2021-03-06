package org.launchcode.techjobs_oo;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        if (name == null || name == "") {
            this.setName("Data not available");
        }

        if (this.employer.toString() == null || this.employer.toString() == "") {
            employer.setValue("Data not available");
        }

        if (this.location.toString() == null || this.location.toString() == "") {
            location.setValue("Data not available");
        }

        if (this.positionType.toString() == null || this.positionType.toString() == "") {
        positionType.setValue("Data not available");
        }

        if(this.coreCompetency.toString() == null || this.coreCompetency.toString() == "") {
        coreCompetency.setValue("Data not available");
        }

        if (this.name == "" && this.employer.toString() == "" && this.location.toString() == ""
                && this.positionType.toString() == "" && this.coreCompetency.toString() == "") {
            return "\nID: " + id + "\nOOPS! This job does not seem to exist.";

        } else

        return
                "\nID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency +
                '\n';
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

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //employer
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    //location
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    //position type
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    //core competency
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //id
    public int getId() {
        return id;
    }
}
