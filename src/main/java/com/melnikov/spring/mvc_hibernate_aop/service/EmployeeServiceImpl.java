package com.melnikov.spring.mvc_hibernate_aop.service;

import com.melnikov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.melnikov.spring.mvc_hibernate_aop.dao.EmployeeDAOImpl;
import com.melnikov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {

        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id) {
        employeeDAO.deleteEmployeeById(id);
    }
}
