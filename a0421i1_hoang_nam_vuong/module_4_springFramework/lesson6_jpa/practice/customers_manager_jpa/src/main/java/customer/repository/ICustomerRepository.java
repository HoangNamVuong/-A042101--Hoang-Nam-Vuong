package customer.repository;

import customer.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends IGeneralRepository<Customer>{
}
