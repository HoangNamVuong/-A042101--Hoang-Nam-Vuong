package customer.service;

import customer.entity.Customer;
import customer.service.Impl.CustomerService;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IGeneralService<Customer>{
}
