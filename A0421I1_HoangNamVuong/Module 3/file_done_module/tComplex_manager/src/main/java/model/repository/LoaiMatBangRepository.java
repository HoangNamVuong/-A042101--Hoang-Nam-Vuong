package model.repository;

import model.bean.LoaiMatBang;

import java.util.List;

public interface LoaiMatBangRepository {
    List<LoaiMatBang> findByAll();
}
