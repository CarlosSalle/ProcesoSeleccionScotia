package pruebas.tecnicas.service;

import pruebas.tecnicas.model.Employee;
import pruebas.tecnicas.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
	 @Autowired
	    private EmployeeRepository employeeRepository;

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Optional<Employee> getEmployeeById(Long id) {
	        return employeeRepository.findById(id);
	    }

	    public Employee saveEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    public Employee updateEmployee(Long id, Employee employeeDetails) {
	        Employee employee = employeeRepository.findById(id).orElseThrow();
	        employee.setFirstName(employeeDetails.getFirstName());

	        return employeeRepository.save(employee);
	    }
	
}
