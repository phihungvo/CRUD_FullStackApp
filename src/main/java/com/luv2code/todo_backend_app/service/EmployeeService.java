package com.luv2code.todo_backend_app.service;

import com.luv2code.todo_backend_app.dto.EmployeeDto;
import com.luv2code.todo_backend_app.entity.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long id);
}
