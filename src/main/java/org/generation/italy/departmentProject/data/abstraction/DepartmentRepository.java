package org.generation.italy.departmentProject.data.abstraction;

import org.generation.italy.departmentProject.model.services.Department;

public interface DepartmentRepository {
    void addDepartment (Department department);
    void deleteDepartment (Department department);
    Department findByNameDepartment (String departmentNamePart);
}
