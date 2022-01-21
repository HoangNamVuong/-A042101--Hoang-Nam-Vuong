package furama.service.contract;

import furama.model.contract.Contract;
import furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService extends IGeneralService<Contract> {
    public Page<Contract> findAll(Pageable pageable);
}
