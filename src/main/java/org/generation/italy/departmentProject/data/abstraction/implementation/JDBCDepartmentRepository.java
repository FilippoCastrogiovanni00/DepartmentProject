package org.generation.italy.departmentProject.data.abstraction.implementation;

import org.generation.italy.departmentProject.data.abstraction.DepartmentRepository;
import org.generation.italy.departmentProject.model.services.Department;

public interface JDBCDepartmentRepository implements DepartmentRepository {
    @Override
    public void addDepartment (Department department){
        return;

    }
    @Override
    public void deleteDepartment (Department department){
        return;

    }
    @Override
    public Department findByNameDepartment (String departmentNamePart){
        return null;

    }


}
