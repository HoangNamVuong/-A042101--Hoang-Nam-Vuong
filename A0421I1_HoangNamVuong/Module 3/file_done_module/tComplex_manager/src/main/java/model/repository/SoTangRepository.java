package model.repository;

import model.bean.SoTang;

import java.util.List;

public interface SoTangRepository {
    List<SoTang> findByAll();
}
