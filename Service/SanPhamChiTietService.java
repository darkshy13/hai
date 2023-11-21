/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPhamChiTiet;
import Model.interface_IMPL;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LAPTOP
 */
public class SanPhamChiTietService implements interface_IMPL<SanPhamChiTiet, Long> {

    Connection con = DBConnect.getConnection();

    @Override
    public ArrayList<SanPhamChiTiet> getAll(int pageNumber, int pageSize) {
        ArrayList<SanPhamChiTiet> list = new ArrayList<>();
        int offset = (pageNumber - 1) * pageSize;
        String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY idSanPhamChiTiet) AS RowNum, * FROM sanPhamChiTiet) AS UsersWithRowNumbers WHERE RowNum > ? AND RowNum <= ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, offset);
            ps.setInt(2, offset + pageSize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idSanPhamChiTiet");
                String ten = rs.getString("tenSanPham");
                float giaBan = rs.getFloat("giaSP");
                int soLuong = rs.getInt("soLuong");
                String khuyenMai = rs.getString("khuyenMai");
                Date namBH = rs.getDate("namBH");
                String moTa = rs.getString("moTa");
                int mau = rs.getInt("idMau");
                int size = rs.getInt("idSize");
                int hang = rs.getInt("idHang");
                int chatLieu = rs.getInt("idChatLieu");
                int kieu = rs.getInt("idKieu");

                SanPhamChiTiet spct = new SanPhamChiTiet(id, ten, giaBan, soLuong, khuyenMai, namBH, moTa, mau, size, hang, chatLieu, kieu);
                list.add(spct);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean add(SanPhamChiTiet t) {
          String sql = "INSERT INTO sanPhamChiTiet(idSanPhamChiTiet,tenSanPham,giaSP ,soLuong,khuyenMai,namBH,moTa,idMau,idSize,idHang,idChatLieu,idKieu) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, t.getId());
            ps.setObject(2, t.getTenSp());
            ps.setFloat(3, (t.getGiaSP()));
            ps.setObject(4, t.getSoLuong());
            ps.setObject(5, t.getKhuyenMai());
            ps.setDate(6, new java.sql.Date(t.getNamBH().getTime()));
            ps.setObject(7, t.getMoTa());
            ps.setObject(8, t.getMau());
            ps.setObject(9, t.getSize());
            ps.setObject(10, t.getHang());
            ps.setObject(11, t.getChatLieu());
            ps.setObject(12, t.getKieu());
         
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) {
                System.out.println("Thêm bị trùng");
            } else {
                e.printStackTrace();
            }
        }
        return false; 
    }

    @Override
    public boolean sua(SanPhamChiTiet t) {
       int count = 0;
        String sql = "UPDATE sanPhamChiTiet SET idSanPhamChiTiet=?,tenSanPham=?,giaSP=?,soLuong=?,khuyenMai=?,namBH=?,moTa=?,idSanPham=?,idMau=?,idSize=?,idHang=?,chatLieu=?,idKieu=? WHERE idSanPhamChiTiet LIKE ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, t.getId());
            ps.setObject(2, t.getTenSp());
            ps.setObject(3, t.getGiaSP());
            ps.setObject(4, t.getSoLuong());
            ps.setObject(5, t.getKhuyenMai());
            ps.setObject(6, t.getNamBH());
            ps.setObject(7, t.getMoTa());
            ps.setObject(8, t.getMau());
            ps.setObject(9, t.getSize());
            ps.setObject(10, t.getHang());
            ps.setObject(11, t.getChatLieu());
            ps.setObject(12, t.getKieu());
           
            count = ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean xoa(SanPhamChiTiet t) {
         int count = 0;

        String sql = "DELETE FROM sanPhamChiTiet WHERE idSanPhamChiTiet=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, t.getId());
            count = ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    
    }

    @Override
    public ArrayList<SanPhamChiTiet> Tim(String t) {
       ArrayList<SanPhamChiTiet> list = new ArrayList<>();
        String sql = "SELECT * FROM sanphamChieTiet WHERE tenSP LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, "%" + Tim(t) + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idSanPhamChiTiet");
                String ten = rs.getString("TenSP");
                float giaSP = rs.getFloat("giaSP");
                int soLuong = rs.getInt("soLuong");
                String khuyenMai = rs.getString("khuyenMai");
                Date namBH = rs.getDate("namBH");
                String moTa = rs.getString("moTa");
                int mau = rs.getInt("idMau");
                int size = rs.getInt("idSize");
                int hang = rs.getInt("idHang");
                int chatLieu = rs.getInt("idChatLieu");
                int kieu = rs.getInt("idKieu");
                
                SanPhamChiTiet spct = new SanPhamChiTiet(id, ten, giaSP, soLuong, khuyenMai, namBH, moTa, mau, size, hang, chatLieu, kieu);
                        list.add(spct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
