package procedure.service;

import org.springframework.stereotype.Service;
import procedure.entity.Customer;

@Service
public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
