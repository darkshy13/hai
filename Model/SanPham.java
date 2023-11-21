/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LAPTOP
 */
public class SanPham {

    private int iSanPham;
    private String tenSP;
    private Float giaSP;
    private String moTaSp;

    private int idKhuyenMai;

    public SanPham() {
    }

    public SanPham(int iSanPham, String tenSP, Float giaSP, String moTaSp, int idKhuyenMai) {
        this.iSanPham = iSanPham;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.moTaSp = moTaSp;
        this.idKhuyenMai = idKhuyenMai;
    }

    public int getiSanPham() {
        return iSanPham;
    }

    public void setiSanPham(int iSanPham) {
        this.iSanPham = iSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Float giaSP) {
        this.giaSP = giaSP;
    }

    public String getMoTaSp() {
        return moTaSp;
    }

    public void setMoTaSp(String moTaSp) {
        this.moTaSp = moTaSp;
    }

    public int getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public void setIdKhuyenMai(int idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

}