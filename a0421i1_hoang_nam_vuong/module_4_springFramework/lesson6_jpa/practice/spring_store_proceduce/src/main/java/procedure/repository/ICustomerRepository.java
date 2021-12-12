package procedure.repository;

import org.springframework.stereotype.Repository;
import procedure.entity.Customer;

@Repository
public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
