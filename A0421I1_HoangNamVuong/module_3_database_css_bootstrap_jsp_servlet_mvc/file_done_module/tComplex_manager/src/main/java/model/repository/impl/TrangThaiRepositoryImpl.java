package model.repository.impl;

import model.bean.TrangThai;
import model.repository.TrangThaiRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiRepositoryImpl implements TrangThaiRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<TrangThai> findByAll() {
        List<TrangThai> trangThaiList =new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM trang_thai;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idTrangThai = resultSet.getInt("id_trang_thai");
                String kieuTrangThai = resultSet.getString("kieu_trang_thai");
                TrangThai trangThai = new TrangThai(idTrangThai,kieuTrangThai);
                trangThaiList.add(trangThai);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return trangThaiList;
    }
}
