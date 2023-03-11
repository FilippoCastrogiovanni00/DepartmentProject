package org.generation.italy.departmentProject.data;
import org.generation.italy.departmentProject.model.exception.DataException;
import org.generation.italy.departmentProject.model.exception.EntityNotFoundException;
import org.generation.italy.departmentProject.model.services.Department;

public interface DepartmentRepository {
    void addDepartment (Department department) throws DataException;
    void deleteDepartment (Department department) throws DataException, EntityNotFoundException;
    Department findByNameDepartment (String departmentNamePart) throws DataException;
}
