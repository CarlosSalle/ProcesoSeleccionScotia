package pruebas.tecnicas.repository;

import pruebas.tecnicas.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  EmployeeRepository extends JpaRepository<Employee, Long>{

}
