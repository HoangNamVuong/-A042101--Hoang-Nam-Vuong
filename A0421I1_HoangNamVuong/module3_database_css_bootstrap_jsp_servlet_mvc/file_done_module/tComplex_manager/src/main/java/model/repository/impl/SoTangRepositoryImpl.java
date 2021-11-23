package model.repository.impl;

import model.bean.SoTang;
import model.bean.TrangThai;
import model.repository.SoTangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SoTangRepositoryImpl implements SoTangRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<SoTang> findByAll() {
        List<SoTang> soTangList =new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM so_tang;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idSoTang = resultSet.getInt("id_so_tang");
                String tenTang = resultSet.getString("ten_tang");
                SoTang soTang = new SoTang(idSoTang,tenTang);
                soTangList.add(soTang);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return soTangList;
    }
}
