/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAlProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product_item";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public Product getProductbyID(String id) {
        String query = "select * from product_item\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public void addProduct(String image, String id, String descripsion, String rank, String ngoc, String tuong, String trang_phuc, String loai_nick, String price) {
        String query = "insert into product_item (image,id,descripsion,rank,ngoc,tuong,trang_phuc,loai_nick,price)\n"
                + "values (?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, image);
            ps.setString(2, id);
            ps.setString(3, descripsion);
            ps.setString(4, rank);
            ps.setString(5, ngoc);
            ps.setString(6, tuong);
            ps.setString(7, trang_phuc);
            ps.setString(8, loai_nick);
            ps.setString(9, price);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        System.out.println(query);
    }

    public void deleteProduct(String pid) {
        String query = "delete from product_item\n"
                + "where id= ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Account sinUpAccount(String user, String pass, String email) {
        String query = "insert into account \n"
                + "values (?,?,0,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String username) {
        String query = "select * from account\n"
                + "where username = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkLogin(String username, String pass) {
        String query = "select * from account\n"
                + "where username = ? and pass= ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Product> list = dao.getAlProduct();

        for (Product o : list) {
//            System.out.println(o);
        }
        String testString = "2";
        Product a = dao.getProductbyID(testString);
        System.out.println(a);
        Account z = dao.checkLogin("duong", "12");
        System.out.println(z);
//        dao.addProduct("test", "test", "test", "test", "test", "test", "test", "test", "test");
//        dao.deleteProduct("1");
    }

    public Product getProductbyID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
