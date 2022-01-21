package furama.service.service;

import furama.model.service.Services;
import furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IServiceService extends IGeneralService<Services> {
    Optional<Services> findById(String id);
    Page<Services> findAll(Pageable pageable);

    Page<Services> searchByName(String name, Pageable pageable);
}
