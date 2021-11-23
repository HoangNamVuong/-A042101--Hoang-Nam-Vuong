package service;

import model.bean.TComplex;

import java.util.List;
import java.util.Map;

public interface TComplexService {
    List<TComplex> findAll();
    TComplex findById(int idMatBang);
    boolean save(TComplex tComplex);
    Map<String,String> save1(TComplex tComplex);
    boolean delete(int id);
    boolean update(int id, TComplex tComplex);
    List<TComplex> search(String loaiMatBang,String giaTien,String soTang);
}
