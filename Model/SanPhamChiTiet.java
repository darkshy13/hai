/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author LAPTOP
 */
public class SanPhamChiTiet {

    private int id;
    private String tenSp;
    private float giaSP;
    private int soLuong;
    private String khuyenMai;
    private Date namBH;
    private String moTa;
    private int mau;
    private int size;
    private int hang;
    private int chatLieu;
    private int kieu;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int id, String tenSp, float giaSP, int soLuong, String khuyenMai, Date namBH, String moTa, int mau, int size, int hang, int chatLieu, int kieu) {
        this.id = id;
        this.tenSp = tenSp;
        this.giaSP = giaSP;
        this.soLuong = soLuong;
        this.khuyenMai = khuyenMai;
        this.namBH = namBH;
        this.moTa = moTa;
        this.mau = mau;
        this.size = size;
        this.hang = hang;
        this.chatLieu = chatLieu;
        this.kieu = kieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(String khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public Date getNamBH() {
        return namBH;
    }

    public void setNamBH(Date namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHang() {
        return hang;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public int getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(int chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getKieu() {
        return kieu;
    }

    public void setKieu(int kieu) {
        this.kieu = kieu;
    }

}
