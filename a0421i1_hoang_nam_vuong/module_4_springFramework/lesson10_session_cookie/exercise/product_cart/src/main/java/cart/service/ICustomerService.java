package cart.service;

import cart.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    Customer save(Customer customer);
}
