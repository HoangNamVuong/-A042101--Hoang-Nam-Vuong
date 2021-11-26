package model.service.imp;

import model.bean.DanhMuc;
import model.repository.DanhMucRepository;
import model.repository.impl.DanhMucRepositoryImpl;

import java.util.List;

public class DanhMucServiceImpl implements model.service.DanhMucService {
    DanhMucRepository danhMucRepository = new DanhMucRepositoryImpl();
    @Override
    public List<DanhMuc> findByAll() {
        return danhMucRepository.findByAll();
    }
}
