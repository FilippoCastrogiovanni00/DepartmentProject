package org.generation.italy.departmentProject.data.implementation;

import org.generation.italy.departmentProject.data.DepartmentRepository;
import org.generation.italy.departmentProject.model.exception.DataException;
import org.generation.italy.departmentProject.model.exception.EntityNotFoundException;
import org.generation.italy.departmentProject.model.services.Department;

import java.sql.*;

public class JDBCDepartmentRepository implements DepartmentRepository {
    private Connection con;
    public JDBCDepartmentRepository (Connection con){
        this.con = con;
    }

    @Override
    public Department addDepartment(Department department) throws DataException {
            try (
                PreparedStatement st = con.prepareStatement("ADD_DEPARTMENT_RETURNING_ID", Statement.RETURN_GENERATED_KEYS);
                ){
                 st.setString(1, department.getName());
                 st.setLong(2, department.getId());
                 st.setInt(3, (int) department.getMax_capacity());
                try (ResultSet key = st.getGeneratedKeys()){
                    st.executeUpdate();
                    key.next();
                    department.setId(key.getLong(2));
                }
                return department;
            }catch (SQLException e){
                System.out.println(e.getMessage());
                throw new DataException("Errore durante il salvataggio del Department", e);
            }
    }

    @Override
    public void deleteDepartment(Department department) throws DataException, EntityNotFoundException {
        try(
                PreparedStatement st = con.prepareStatement("Delete_Department")
        ){
            st.setLong(1,id);
            int rs = st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Department findByNameDepartment(String departmentNamePart) throws DataException {
        return null;
    }
}
