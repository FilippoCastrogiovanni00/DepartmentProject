package org.generation.italy.departmentProject.model.services;

import java.util.Set;

public class Department {
    protected long id;
    protected String name;
    protected String address;
    protected long max_capacity;
    protected Set<Employees> employeesSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(long max_capacity) {
        this.max_capacity = max_capacity;
    }
}
