package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public int getId() {
        return id;
    }
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    //1st constructor to initialize id
    public Job() {
        id = nextId;
        nextId++;
        name = "";
        employer = new Employer("");
        location = new Location("");
        positionType = new PositionType("");
        coreCompetency = new CoreCompetency("");
    }

    //2nd constructor with 5 parameters
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); //Call constructor to initialize id field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // toString method
    @Override
    public String toString() {
        // Start with a blank line to separate from previous text (if any)
        String result = System.lineSeparator();
        // Append ID field label and value followed by a new line
        result += "ID: " + this.getId() + System.lineSeparator();
        // Append Name field label and value (or "Data not available" if empty) followed by a new line
        result += "Name: " + (this.getName().isEmpty() ? "Data not available" : this.getName()) + System.lineSeparator();
        // Append Employer field label and value (or "Data not available" if empty) followed by a new line
        result += "Employer: " + (this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer().getValue()) + System.lineSeparator();
        // Append Location field label and value (or "Data not available" if empty) followed by a new line
        result += "Location: " + (this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation().getValue()) + System.lineSeparator();
        // Append Position Type field label and value (or "Data not available" if empty) followed by a new line
        result += "Position Type: " + (this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType().getValue()) + System.lineSeparator();
        // Append Core Competency field label and value (or "Data not available" if empty) followed by a new line
        result += "Core Competency: " + (this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency().getValue()) + System.lineSeparator();
        // Add a blank line at the end to separate from following text (if any)
       // result += System.lineSeparator();

        return result;
    }

//    public String toString() {
//        return System.lineSeparator() +
//                "ID: " + this.getId() + System.lineSeparator() +
//                "Name: Data not available" + System.lineSeparator() +
//                "Employer: Data not available" + System.lineSeparator() +
//                "Location: Data not available" + System.lineSeparator() +
//                "Position Type: Data not available" + System.lineSeparator() +
//                "Core Competency: Data not available" + System.lineSeparator();
//    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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

}
