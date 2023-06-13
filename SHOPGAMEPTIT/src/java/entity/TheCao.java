/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author VXH
 */
public class TheCao {
    private int id;
    private String loaithe;
    private String menhgia;
    private String mathe;
    private String seri;

    public TheCao() {
    }

    public TheCao(int id, String loaithe, String menhgia, String mathe, String seri) {
        this.id = id;
        this.loaithe = loaithe;
        this.menhgia = menhgia;
        this.mathe = mathe;
        this.seri = seri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaithe() {
        return loaithe;
    }

    public void setLoaithe(String loaithe) {
        this.loaithe = loaithe;
    }

    public String getMenhgia() {
        return menhgia;
    }

    public void setMenhgia(String menhgia) {
        this.menhgia = menhgia;
    }

    public String getMathe() {
        return mathe;
    }

    public void setMathe(String mathe) {
        this.mathe = mathe;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    @Override
    public String toString() {
        return "TheCao{" + "id=" + id + ", loaithe=" + loaithe + ", menhgia=" + menhgia + ", mathe=" + mathe + ", seri=" + seri + '}';
    }
    
    
}
