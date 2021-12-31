package phone_manager.repository;

import org.springframework.data.repository.CrudRepository;
import phone_manager.model.Smartphone;

public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}
