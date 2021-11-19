package service.impl;

import model.bean.TComplex;
import model.repository.TComplexRepository;
import model.repository.impl.TComplexRepositoryImpl;
import service.TComplexService;

import java.util.List;
import java.util.Map;

public class TComplexServiceImpl implements TComplexService {
    private TComplexRepository tComplexRepository = new TComplexRepositoryImpl();
    @Override
    public List<TComplex> findAll() {
        return tComplexRepository.findAll();
    }

    @Override
    public TComplex findById(int id) {
        return tComplexRepository.findById(id);
    }

    @Override
    public boolean save(TComplex tComplex) {
        return tComplexRepository.save(tComplex);
    }

    @Override
    public Map<String, String> save1(TComplex tComplex) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return tComplexRepository.delete(id);
    }

    @Override
    public boolean update(int id, TComplex tComplex) {
        return tComplexRepository.update(id, tComplex);
    }

    @Override
    public List<TComplex> search(String loaiMatBang, String giaTien, String soTang) {
        return tComplexRepository.search(loaiMatBang,giaTien,soTang);
    }
}
