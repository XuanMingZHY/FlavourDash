package com.flavorDash.service;

import com.flavorDash.dto.EmployeeLoginDTO;
import com.flavorDash.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
