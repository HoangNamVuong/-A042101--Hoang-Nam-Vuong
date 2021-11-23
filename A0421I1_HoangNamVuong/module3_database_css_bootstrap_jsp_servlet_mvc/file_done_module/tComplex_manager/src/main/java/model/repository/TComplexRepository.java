package model.repository;

import model.bean.TComplex;

import java.util.List;

public interface TComplexRepository {
    List<TComplex> findAll();
    TComplex findById(int id);
    boolean save(TComplex tComplex);
    boolean delete(int id);
    boolean update(int id, TComplex tComplex);
    List<TComplex> search(String loaiMatBang,String giaTien,String soTang);
}
