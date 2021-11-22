package service.impl;

import model.bean.SoTang;
import model.repository.SoTangRepository;
import model.repository.impl.SoTangRepositoryImpl;
import service.SoTangService;

import java.util.List;

public class SoTangServiceImpl implements SoTangService {
    SoTangRepository soTangRepository = new SoTangRepositoryImpl();
    @Override
    public List<SoTang> findByAll() {
        return soTangRepository.findByAll();
    }
}
