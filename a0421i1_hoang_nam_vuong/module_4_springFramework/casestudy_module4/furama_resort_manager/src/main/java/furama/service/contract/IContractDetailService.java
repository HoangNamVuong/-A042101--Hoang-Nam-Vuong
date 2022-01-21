package furama.service.contract;

import furama.model.contract.ContractDetail;
import furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractDetailService extends IGeneralService<ContractDetail> {
    Page<ContractDetail> findAll(Pageable pageable);
}
