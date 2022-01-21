package furama.service.employee;

import furama.model.employee.Employee;
import furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService extends IGeneralService<Employee> {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> searchByName(String name, Pageable pageable);
}
