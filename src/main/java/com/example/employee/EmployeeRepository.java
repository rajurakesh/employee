// Write your code here
package com.example.employee;

import java.util.*;

public interface EmployeeRepository {

    ArrayList<Employee> getEmployeeList();

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(int employeeId);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
