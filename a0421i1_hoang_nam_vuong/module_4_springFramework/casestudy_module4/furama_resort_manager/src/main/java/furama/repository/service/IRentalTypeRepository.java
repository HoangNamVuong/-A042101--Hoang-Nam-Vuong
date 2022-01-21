package furama.repository.service;

import furama.model.service.RentalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalTypeRepository extends JpaRepository<RentalType, Integer> {
}
