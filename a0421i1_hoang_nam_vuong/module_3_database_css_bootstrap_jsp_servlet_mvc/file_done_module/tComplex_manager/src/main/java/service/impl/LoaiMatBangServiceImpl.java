package service.impl;

import model.bean.LoaiMatBang;
import model.repository.LoaiMatBangRepository;
import model.repository.impl.LoaiMatBangRepositoryImpl;
import service.LoaiMatBangService;

import java.util.List;

public class LoaiMatBangServiceImpl implements LoaiMatBangService {
    LoaiMatBangRepository loaiMatBangRepository = new LoaiMatBangRepositoryImpl();
    @Override
    public List<LoaiMatBang> findByAll() {
        return loaiMatBangRepository.findByAll();
    }
}
