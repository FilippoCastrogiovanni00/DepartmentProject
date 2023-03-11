package org.generation.italy.departmentProject.model.services;

import java.util.Set;

public class Department {
    protected long id;
    protected String name;
    protected String address;
    protected long max_capacity;
    protected Set<Employees> employeesSet;
}
