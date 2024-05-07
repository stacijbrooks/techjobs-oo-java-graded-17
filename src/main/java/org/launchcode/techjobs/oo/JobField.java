package org.launchcode.techjobs.oo;


import java.util.Objects;

public abstract class JobField {

    // Common fields for all subclasses
    protected int id;
    protected static int nextId = 1;
    protected String value;

    // Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Custom method to check if value is empty or not
    public boolean isEmpty() {
        return value == null || value.isBlank();
    }

    // Custom toString method

    @Override
    public String toString() {
        return value;
    }
}

