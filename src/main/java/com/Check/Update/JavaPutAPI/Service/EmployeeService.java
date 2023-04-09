package com.Check.Update.JavaPutAPI.Service;

import com.Check.Update.JavaPutAPI.Entity.Employee;
import org.springframework.stereotype.Service;

public interface EmployeeService {

    void updateEmpById(int eid , Employee employee);
}
