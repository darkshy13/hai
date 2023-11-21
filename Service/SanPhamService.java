/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
import Model.interface_IMPL;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LAPTOP
 */
public class SanPhamService implements interface_IMPL<SanPham, Long> {

    Connection con = DBConnect.getConnection();

    @Override
    public ArrayList<SanPham> getAll(int pageNumber, int pageSize) {
        ArrayList<SanPham> list = new ArrayList<>();
        int offset = (pageNumber - 1) * pageSize;
        String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY idSanPham) AS RowNum, * FROM idSanPham) AS UsersWithRowNumbers WHERE RowNum > ? AND RowNum <= ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, offset);
            ps.setInt(2, offset + pageSize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idSanPham");
                String ten = rs.getString("tenSanPham");
                float giaBan = rs.getFloat("giaSP");
                String moTa = rs.getString("moTa");
                
                int idKhuyenMai = rs.getInt("idKhuyenMai");

                SanPham sp = new SanPham(id, ten, giaBan, moTa, idKhuyenMai);
                list.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean add(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean sua(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean xoa(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SanPham> Tim(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}