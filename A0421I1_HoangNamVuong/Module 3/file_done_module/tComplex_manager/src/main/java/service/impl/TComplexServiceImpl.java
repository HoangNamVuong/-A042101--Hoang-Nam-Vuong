package service.impl;

import model.bean.TComplex;
import model.repository.TComplexRepository;
import model.repository.impl.TComplexRepositoryImpl;
import service.TComplexService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TComplexServiceImpl implements TComplexService {
    private static final String MMB_REGEX = "^[A-Z0-9]{3}-[A-Z0-9]{2}-[A-Z0-9]{2}$";
    private static final String NBD_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
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
        Map<String,String> map = new HashMap<>();
        boolean check = true;
        if("".equals(tComplex.getMaMatBang())) {
            check = false;
            map.put("messMaMatBang","Ma mat bang khong duoc de trong");
        }else if (!validateMaMatBang(tComplex.getMaMatBang())) {
            check = false;
            map.put("messMaMatBang","Ma mat bang sai dinh dang");
        }
//        else if (!validateNgayBatDau(tComplex.getNgayBatDau())) {
//            check = false;
//            map.put("messRegex","Ngay bat dau sai dinh dang");
//        }
        if (check) {
            tComplexRepository.save(tComplex);
        }
        return map;
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
    
    public boolean validateMaMatBang(String maMatBang) {
        return maMatBang.matches(MMB_REGEX);
    }

    public boolean validateNgayBatDau(String ngayBatDau) {
        return ngayBatDau.matches(NBD_REGEX);
    }
}
