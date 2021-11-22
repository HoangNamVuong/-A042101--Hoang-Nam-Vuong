package model.repository.impl;

import model.bean.LoaiMatBang;
import model.bean.SoTang;
import model.repository.LoaiMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiMatBangRepositoryImpl implements LoaiMatBangRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<LoaiMatBang> findByAll() {
        List<LoaiMatBang> loaiMatBangList =new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM loai_mat_bang;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idLoaiMatBang = resultSet.getInt("id_loai_mat_bang");
                String kieuMatBang = resultSet.getString("kieu_mat_bang");
                LoaiMatBang loaiMatBang = new LoaiMatBang(idLoaiMatBang,kieuMatBang);
                loaiMatBangList.add(loaiMatBang);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return loaiMatBangList;
    }
}
