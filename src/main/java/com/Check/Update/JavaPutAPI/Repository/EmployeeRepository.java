package com.Check.Update.JavaPutAPI.Repository;

import com.Check.Update.JavaPutAPI.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findById(int eid);
}
