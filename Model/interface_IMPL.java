/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author LAPTOP
 */
public interface interface_IMPL <T,t>{
    public ArrayList<T> getAll(int pageNumber,int pageSize);
    public boolean add(T t);
    public boolean sua(T t);
    public boolean xoa(T t);
    public ArrayList<T> Tim(String t);
    
    
}
