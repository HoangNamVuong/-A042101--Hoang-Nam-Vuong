package model.repository;

import model.bean.TrangThai;

import java.util.List;

public interface TrangThaiRepository {
    List<TrangThai> findByAll();
}
