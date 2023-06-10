/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Duong Nguyen
 */
public class History {
    private String date;
    private int uID;
    private int id;
    private String taikhoan;
    private String matkhau;
    private int price;

    public History() {
    }

    public History(String date, int uID, int id, String taikhoan, String matkhau, int price) {
        this.date = date;
        this.uID = uID;
        this.id = id;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "History{" + "date=" + date + ", uID=" + uID + ", id=" + id + ", taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", price=" + price + '}';
    }
    
    
}
