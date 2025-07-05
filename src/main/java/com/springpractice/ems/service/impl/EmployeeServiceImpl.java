package com.springpractice.ems.service.impl;

import com.springpractice.ems.dto.EmployeeDto;
import com.springpractice.ems.entity.Employee;
import com.springpractice.ems.mapper.EmployeeMapper;
import com.springpractice.ems.repository.EmployeeRepository;
import com.springpractice.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
