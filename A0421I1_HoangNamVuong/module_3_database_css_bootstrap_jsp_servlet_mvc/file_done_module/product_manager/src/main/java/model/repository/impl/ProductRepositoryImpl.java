package model.repository.impl;

import model.bean.Product;
import model.repository.ProductRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    BaseRepository baseRepository = new BaseRepository();

    final String SELECT_ALL_PRODUCT = "SELECT * FROM product;";
    final String INSERT_INTO_PRODUCT = "INSERT INTO product(ten,gia,so_luong,mau_sac,mo_ta,id_danh_muc)" + " values(?,?,?,?,?,?);";
    final String SELECT_BY_ID = "SELECT * FROM product WHERE idSanPham =?;";
    final String DELETE_BY_ID = "DELETE FROM product WHERE idSanPham =?;";
    final String UPDATE_PRODUCT = "UPDATE product SET ten = ?,gia= ?, so_luong =?,mau_sac = ?,mo_ta= ?, id_danh_muc =? WHERE idSanPham = ?;";
    final String SEARCH = "SELECT * FROM product WHERE ten like ? and id_danh_muc like ? ;";
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idSanPham = resultSet.getInt("id_san_pham");
                String ten = resultSet.getString("ten");
                String gia = resultSet.getString("gia");
                String soLuong = resultSet.getString("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String moTa = resultSet.getString("mo_ta");
                int idDanhMuc = resultSet.getInt("id_danh_muc");
                Product product = new Product(idSanPham, ten, gia, soLuong, mauSac, moTa, idDanhMuc);
                productList.add(product);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        Product product = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idSanPham = resultSet.getInt("id_san_pham");
                String ten = resultSet.getString("ten");
                String gia = resultSet.getString("gia");
                String soLuong = resultSet.getString("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String moTa = resultSet.getString("mo_ta");
                int idDanhMuc = resultSet.getInt("id_danh_muc");
                product = new Product(idSanPham, ten, gia, soLuong, mauSac, moTa, idDanhMuc);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean save(Product product) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check =false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_PRODUCT);
            preparedStatement.setString(1,product.getTen());
            preparedStatement.setString(2,product.getGia());
            preparedStatement.setString(3,product.getSoLuong());
            preparedStatement.setString(4,product.getMauSac());
            preparedStatement.setString(5,product.getMoTa());
            preparedStatement.setInt(6, product.getIdDanhMuc());
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
    public boolean update(int id, Product product) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_PRODUCT);
            callableStatement.setString(1,product.getTen());
            callableStatement.setString(2,product.getGia());
            callableStatement.setString(3,product.getSoLuong());
            callableStatement.setString(4,product.getMauSac());
            callableStatement.setString(5,product.getMoTa());
            callableStatement.setInt(6, product.getIdDanhMuc());
            callableStatement.setInt(7, id);
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public List<Product> search(String searchTen, String searchDanhMuc) {
        List<Product> productList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            String string1 ="%"+searchTen+"%";
            String string2 ="%"+searchDanhMuc+"%";
            preparedStatement.setString(1,string1);
            preparedStatement.setString(2,string2);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idSanPham = resultSet.getInt("id_san_pham");
                String ten = resultSet.getString("ten");
                String gia = resultSet.getString("gia");
                String soLuong = resultSet.getString("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String moTa = resultSet.getString("mo_ta");
                int idDanhMuc = resultSet.getInt("id_danh_muc");
                Product product = new Product(idSanPham, ten, gia, soLuong, mauSac, moTa, idDanhMuc);
                productList.add(product);
            }
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }
}
