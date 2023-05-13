/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class Product {
    private String image;
    private  int id;
    private String descripsion;
    private String rank;
    private String ngoc;
    private String tuong;
    private String trang_phuc;
    private String loai_nick;
    private int  price; 

    public Product() {
    }

    public Product(String image, int id, String descripsion, String rank, String ngoc, String tuong, String trang_phuc, String loai_nick, int price) {
        this.image = image;
        this.id = id;
        this.descripsion = descripsion;
        this.rank = rank;
        this.ngoc = ngoc;
        this.tuong = tuong;
        this.trang_phuc = trang_phuc;
        this.loai_nick = loai_nick;
        this.price = price;
    }

    public Product(int aInt, String string, String string0, double aDouble, String string1, String string2, int aInt0, int aInt1, int aInt2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNgoc() {
        return ngoc;
    }

    public void setNgoc(String ngoc) {
        this.ngoc = ngoc;
    }

    public String getTuong() {
        return tuong;
    }

    public void setTuong(String tuong) {
        this.tuong = tuong;
    }

    public String getTrang_phuc() {
        return trang_phuc;
    }

    public void setTrang_phuc(String trang_phuc) {
        this.trang_phuc = trang_phuc;
    }

    public String getLoai_nick() {
        return loai_nick;
    }

    public void setLoai_nick(String loai_nick) {
        this.loai_nick = loai_nick;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "image=" + image + ", id=" + id + ", descripsion=" + descripsion + ", rank=" + rank + ", ngoc=" + ngoc + ", tuong=" + tuong + ", trang_phuc=" + trang_phuc + ", loai_nick=" + loai_nick + ", price=" + price + '}';
    }
    
    
}
