package model.repository.impl;

import model.bean.DanhMuc;
import model.repository.DanhMucRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhMucRepositoryImpl implements DanhMucRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<DanhMuc> findByAll() {
        List<DanhMuc> danhMucList =new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM danh_muc;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idDanhMuc = resultSet.getInt("id_danh_muc");
                String tenDanhMuc = resultSet.getString("ten_danh_muc");
                DanhMuc danhMuc = new DanhMuc(idDanhMuc,tenDanhMuc);
                danhMucList.add(danhMuc);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return danhMucList;
    }
}
