package model.repository.impl;

import model.bean.TComplex;
import model.repository.TComplexRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TComplexRepositoryImpl implements TComplexRepository {
    BaseRepository baseRepository = new BaseRepository();

    final String SELECT_ALL_TCOMPLEX = "SELECT * FROM tComplex;";
    final String INSERT_INTO_TCOMPLEX = "INSERT INTO tComplex(ma_mat_bang,dien_tich,id_trang_thai,id_so_tang,id_loai_mat_bang,gia_tien,ngay_bat_dau,ngay_ket_thuc)" + " values(?,?,?,?,?,?,?,?);";
    final String SELECT_BY_ID = "SELECT * FROM tComplex WHERE id_mat_bang =?;";
    final String DELETE_BY_ID = "DELETE FROM tComplex WHERE id_mat_bang =?;";
    final String UPDATE_TCOMPLEX = "call edit_tComplex_by_id(?,?,?,?,?,?,?,?);";
    final String SEARCH = "SELECT * FROM tComplex WHERE id_loai_mat_bang like ? and gia_tien like ? and id_so_tang like ?;";

    @Override
    public List<TComplex> findAll() {
        List<TComplex> tComplexList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TCOMPLEX);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idMatBang = resultSet.getInt("id_mat_bang");
                String maMatBang = resultSet.getString("ma_mat_bang");
                String dienTich = resultSet.getString("dien_tich");
                int idTrangThai = resultSet.getInt("id_trang_thai");
                int idSoTang = resultSet.getInt("id_so_tang");
                int idLoaiMatBang = resultSet.getInt("id_loai_mat_bang");
                String giaTien = resultSet.getString("gia_tien");
                String ngayBatDau = String.valueOf(resultSet.getDate("ngay_bat_dau"));
                String ngayKetThuc = String.valueOf(resultSet.getDate("ngay_ket_thuc"));
                TComplex tComplex = new TComplex(idMatBang, maMatBang, dienTich, idTrangThai, idSoTang, idLoaiMatBang, giaTien, ngayBatDau, ngayKetThuc);
                tComplexList.add(tComplex);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tComplexList;
    }

    @Override
    public TComplex findById(int id) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        TComplex tComplex=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idMatBang = resultSet.getInt("id_mat_bang");
                String maMatBang = resultSet.getString("ma_mat_bang");
                String dienTich = resultSet.getString("dien_tich");
                int idTrangThai = resultSet.getInt("id_trang_thai");
                int idSoTang = resultSet.getInt("id_so_tang");
                int idLoaiMatBang = resultSet.getInt("id_loai_mat_bang");
                String giaTien = resultSet.getString("gia_tien");
                String ngayBatDau = String.valueOf(resultSet.getDate("ngay_bat_dau"));
                String ngayKetThuc = String.valueOf(resultSet.getDate("ngay_ket_thuc"));
                tComplex = new TComplex(idMatBang, maMatBang, dienTich, idTrangThai, idSoTang, idLoaiMatBang, giaTien, ngayBatDau, ngayKetThuc);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tComplex;
    }

    @Override
    public boolean save(TComplex tComplex) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check =false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_TCOMPLEX);
            preparedStatement.setString(1,tComplex.getMaMatBang());
            preparedStatement.setString(2,tComplex.getDienTich());
            preparedStatement.setInt(3, tComplex.getIdTrangThai());
            preparedStatement.setInt(4, tComplex.getIdSoTang());
            preparedStatement.setInt(5, tComplex.getIdLoaiMatBang());
            preparedStatement.setString(6,tComplex.getGiaTien());
            preparedStatement.setDate(7, java.sql.Date.valueOf(tComplex.getNgayBatDau()));
            preparedStatement.setDate(8, java.sql.Date.valueOf(tComplex.getNgayKetThuc()));
            check = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check =false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            check = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean update(int id, TComplex tComplex) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_TCOMPLEX);

            callableStatement.setString(1,tComplex.getMaMatBang());
            callableStatement.setString(2,tComplex.getDienTich());
            callableStatement.setInt(3, tComplex.getIdTrangThai());
            callableStatement.setInt(4, tComplex.getIdSoTang());
            callableStatement.setInt(5, tComplex.getIdLoaiMatBang());
            callableStatement.setString(6,tComplex.getGiaTien());
            callableStatement.setDate(7, java.sql.Date.valueOf(tComplex.getNgayBatDau()));
            callableStatement.setDate(8, java.sql.Date.valueOf(tComplex.getNgayKetThuc()));
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public List<TComplex> search(String searchLoaiMatBang, String searchGiaTien, String searchSoTang) {
        List<TComplex> tComplexList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            String string1 ="%"+searchLoaiMatBang+"%";
            String string2 ="%"+searchGiaTien+"%";
            String string3 ="%"+searchSoTang+"%";
            preparedStatement.setString(1,string1);
            preparedStatement.setString(2,string2);
            preparedStatement.setString(3,string3);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idMatBang = resultSet.getInt("id_mat_bang");
                String maMatBang = resultSet.getString("ma_mat_bang");
                String dienTich = resultSet.getString("dien_tich");
                int idTrangThai = resultSet.getInt("id_trang_thai");
                int idSoTang = resultSet.getInt("id_so_tang");
                int idLoaiMatBang = resultSet.getInt("id_loai_mat_bang");
                String giaTien = resultSet.getString("gia_tien");
                String ngayBatDau = String.valueOf(resultSet.getDate("ngay_bat_dau"));
                String ngayKetThuc = String.valueOf(resultSet.getDate("ngay_ket_thuc"));
                TComplex tComplex = new TComplex(idMatBang, maMatBang, dienTich, idTrangThai, idSoTang, idLoaiMatBang, giaTien, ngayBatDau, ngayKetThuc);
                tComplexList.add(tComplex);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tComplexList;
    }
}
