package com.Check.Update.JavaPutAPI.Controller;

import com.Check.Update.JavaPutAPI.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.Check.Update.JavaPutAPI.Service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService EmployeeService;

    @GetMapping("/test")
    public String testMethod() {
        return "testCheckController";
    }

    @RequestMapping(value ="/UpdateEmp/{eid}", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json" )
    public void updateYardById(@PathVariable("eid") int eid, @RequestBody Employee employee){
        System.out.println("Updating Employee By  eid"+ eid);
        System.out.println("Employee Object By  eid"+ employee);
        EmployeeService.updateEmpById(eid ,employee);
    }
}
