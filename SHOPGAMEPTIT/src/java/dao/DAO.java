/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import control.EditAccountControl;
import entity.Account;
import entity.History;
import entity.Image;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
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
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Image getImagebyID(String id) {
        String query = "select image.* from image,product_item\n"
                + "where image.id=product_item.id\n"
                + "And product_item.id=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Image(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account getAccountbyUID(String uid) {
        String query = "select * from account where uID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<History> getHistorybyUID(int uID) {
        String query = "select * from history where uID = ?";
        List<History> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, uID);
            rs = ps.executeQuery();
            while (rs.next()) {
                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String dateStr = rs.getString(1);
                Date date = inputFormat.parse(dateStr);
                String formattedDateStr = outputFormat.format(date);
                list.add(new History(formattedDateStr,
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addProduct(String image, String id, String descripsion, String rank, String ngoc, String tuong, String trang_phuc, String loai_nick, String price, String taikhoan, String matkhau) {
        String query = "insert into product_item (image,id,descripsion,rank,ngoc,tuong,trang_phuc,loai_nick,price,taikhoan,matkhau)\n"
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(10, taikhoan);
            ps.setString(11, matkhau);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addHistory(String date, int uID, int id, String taikhoan, String matkhau, int price) {
        String query = "INSERT INTO [dbo].[history]\n"
                + "           ([date]\n"
                + "           ,[uID]\n"
                + "           ,[id]\n"
                + "           ,[taikhoan]\n"
                + "           ,[matkhau]\n"
                + "           ,[price])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            ps.setInt(2, uID);
            ps.setInt(3, id);
            ps.setString(4, taikhoan);
            ps.setString(5, matkhau);
            ps.setInt(6, price);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String image, String id, String descripsion, String rank, String ngoc, String tuong, String trang_phuc, String loai_nick, String price, String taikhoan, String matkhau) {
        String query = "UPDATE [dbo].[product_item]\n"
                + "   SET [image] = ?\n"
                + "      ,[descripsion] = ?\n"
                + "      ,[rank] = ?\n"
                + "      ,[ngoc] = ?\n"
                + "      ,[tuong] = ?\n"
                + "      ,[trang_phuc] = ?\n"
                + "      ,[loai_nick] = ?\n"
                + "      ,[price] = ?\n"
                + "      ,[taikhoan] = ?\n"
                + "      ,[matkhau] = ?\n"
                + " WHERE id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, image);
            ps.setString(2, descripsion);
            ps.setString(3, rank);
            ps.setString(4, ngoc);
            ps.setString(5, tuong);
            ps.setString(6, trang_phuc);
            ps.setString(7, loai_nick);
            ps.setString(8, price);
            ps.setString(9, taikhoan);
            ps.setString(10, matkhau);
            ps.setString(11, id);

            ps.executeUpdate();
        } catch (Exception e) {
        }
        System.out.println(query);
    }

    public void editAccount(String uID, String username, String pass, String email, String isAdmin) {
        String query = "UPDATE [dbo].[account]\n"
                + "   SET [username] = ?\n"
                + "      ,[pass] = ?\n"
                + "      ,[isAdmin] = ?\n"
                + "      ,[email] = ?\n"
                + " WHERE uID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            ps.setString(3, isAdmin);
            ps.setString(4, email);
            ps.setString(5, uID);

            ps.executeUpdate();
        } catch (Exception e) {
        }
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

    public void deleteAccount(String uid) {
        String query = "delete from account where uid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, uid);
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

    public void resetPass(String email, String newpass) {
//        String s = RandomStringUtils.randomAlphanumeric(11);

        String query = "UPDATE account \n"
                + "SET pass = ? \n"
                + "WHERE email = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, newpass);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getTotalProduct() {
        String query = "select count(*) from product_item";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pageProduct(int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product_item\n"
                + "order by id\n"
                + "offset ? row fetch next ? rows only;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * cnt);
            ps.setInt(2, cnt);
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
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int getTotalAccount() {
        String query = "select count(*) from account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Account> pageAccount(int index, int cnt) {
        List<Account> list = new ArrayList<>();
        String query = "select * from account\n"
                + "order by uid\n"
                + "offset ? row fetch next ? rows only;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * cnt);
            ps.setInt(2, cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int countSearch(String txt) {
        String query = "select count(*) from product_item \n"
                + "where id like ?\n"
                + "or tuong like ?\n"
                + "or [rank] like ?\n"
                + "or descripsion like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            ps.setString(3, "%" + txt + "%");
            ps.setString(4, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
//        dao.addHistory("20230609204430", 3,2, "qwet", "matqekhau", 8888);
        System.out.println(dao.getHistorybyUID(18));
    }

    public Product getProductbyID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
