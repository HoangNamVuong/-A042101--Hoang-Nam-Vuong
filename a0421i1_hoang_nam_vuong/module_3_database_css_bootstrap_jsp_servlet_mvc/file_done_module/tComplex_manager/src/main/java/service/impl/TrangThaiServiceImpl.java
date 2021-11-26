package service.impl;

import model.bean.TrangThai;
import model.repository.TComplexRepository;
import model.repository.TrangThaiRepository;
import model.repository.impl.TComplexRepositoryImpl;
import model.repository.impl.TrangThaiRepositoryImpl;
import service.TrangThaiService;

import java.util.List;

public class TrangThaiServiceImpl implements TrangThaiService {
    TrangThaiRepository trangThaiRepository = new TrangThaiRepositoryImpl();
    @Override
    public List<TrangThai> findByAll() {
        return trangThaiRepository.findByAll();
    }
}
