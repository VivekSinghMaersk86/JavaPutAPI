package com.Check.Update.JavaPutAPI.ServiceImpl;

import com.Check.Update.JavaPutAPI.Entity.Employee;
import com.Check.Update.JavaPutAPI.Repository.EmployeeRepository;
import com.Check.Update.JavaPutAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

  @Transactional(propagation = Propagation.REQUIRED )
     public void updateEmpById(int eid, Employee employee) {
        Employee EmpResponse =employeeRepository.findById(eid);

         EmpResponse.setName(employee.getName());
         EmpResponse.setSalary(employee.getSalary());
         EmpResponse.setDesignation(employee.getDesignation());
         EmpResponse.setEmpEmail(employee.getEmpEmail());
         EmpResponse.setAddress(employee.getAddress());

        employeeRepository.save(EmpResponse);
    }
}
