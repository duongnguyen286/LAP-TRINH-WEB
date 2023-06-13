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
 * @author VXH
 */
public class SEARCH {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int countSearchAll(String txt) {
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

    public List<Product> searchProductAll(String txt, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where id like ?\n"
                + "or tuong like ?\n"
                + "or [rank] like ?\n"
                + "or descripsion like ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            ps.setString(3, "%" + txt + "%");
            ps.setString(4, "%" + txt + "%");
            ps.setInt(5, (index * cnt) - cnt + 1);
            ps.setInt(6, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchAllId(String txt, String maso) {
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item\n"
                + "where id like ?\n"
                + "or tuong like ?\n"
                + "or [rank] like ?\n"
                + "or descripsion like ?)\n"
                + "select count(*) from x where id like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            ps.setString(3, "%" + txt + "%");
            ps.setString(4, "%" + txt + "%");
            ps.setString(5, "%" + maso + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> searchProductAllId(String txt, String maso, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item\n"
                + "where id like ?\n"
                + "or tuong like ?\n"
                + "or [rank] like ?\n"
                + "or descripsion like ?)\n"
                + "select * from x where id like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            ps.setString(3, "%" + txt + "%");
            ps.setString(4, "%" + txt + "%");
            ps.setInt(5, (index * cnt) - 7);
            ps.setInt(6, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchId(String txt) {
        String query = "select count(*) from product_item \n"
                + "where id like ?\n";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> searchProductId(String maso, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where id like ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + maso + "%");
            ps.setInt(2, (index * cnt) - cnt + 1);
            ps.setInt(3, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchAccount(String txt) {
        String query = "select count(*) from account \n"
                + "where [uID] like ?\n"
                + "or username like ?\n";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Account> searchAccount(String txt, int index, int cnt) {
        List<Account> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by [uid] asc) as r,* from account \n"
                + "where [uID] like ?\n"
                + "or username like ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            ps.setInt(3, (index * cnt) - cnt + 1);
            ps.setInt(4, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> searchProductPrice1(String price, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where price < ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price);
            ps.setInt(2, (index * cnt) - cnt + 1);
            ps.setInt(3, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchPrice1(String price) {
        String query = "select count(*) from product_item\n"
                + "where price < ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> searchProductPrice2(String price1, String price2, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where price>=?\n"
                + "and price<?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price1);
            ps.setString(2, price2);
            ps.setInt(3, (index * cnt) - cnt + 1);
            ps.setInt(4, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchPrice2(String price1, String price2) {
        String query = "select count(*) from product_item\n"
                + "where price>=?\n"
                + "and price <?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price1);
            ps.setString(2, price2);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> searchProductPrice3(String price, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where price >= ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price);
            ps.setInt(2, (index * cnt) - cnt + 1);
            ps.setInt(3, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchPrice3(String price) {
        String query = "select count(*) from product_item\n"
                + "where price >= ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }
    public List<Product> searchProductNgoc(String ngoc, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where ngoc = ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngoc);
            ps.setInt(2, (index * cnt) - cnt + 1);
            ps.setInt(3, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchNgoc(String ngoc) {
        String query = "select count(*) from product_item\n"
                + "where ngoc = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngoc);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }
    public List<Product> searchProductTT(String tt, int index, int cnt) {
        List<Product> list = new ArrayList<>();
        String query = "with x as(select ROW_NUMBER() over (order by id asc) as r,* from product_item \n"
                + "where loai_nick = ?)\n"
                + "select * from x where r between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tt);
            ps.setInt(2, (index * cnt) - cnt + 1);
            ps.setInt(3, index * cnt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public int countSearchTT(String tt) {
        String query = "select count(*) from product_item\n"
                + "where loai_nick = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return 0;
    }

    public static void main(String[] args) {
        SEARCH s = new SEARCH();
//        System.out.println(s.countSearchAllId("100", "1"));
        List<Product> list = new ArrayList<>();
        list = s.searchProductTT("NICK TRẮNG THÔNG TIN", 1, 8);
//        list = s.searchAccount("1", 2, 7);
        for (Product i : list) {
            System.out.println(i);
        }
    }

}
