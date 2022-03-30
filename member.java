/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.online;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class member implements Usser{
    
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public member(){
        this.namaMember.add("ara cantik sekali");
        this.alamat.add("malang");
        this.telepon.add("0895809092050");
        this.saldo.add(150000000);
        
        this.namaMember.add("rutok cakep");
        this.alamat.add("jepang");
        this.telepon.add("0123");
        this.saldo.add(300000000);
        
        this.namaMember.add("jihoon juga cakep");
        this.alamat.add("busan");
        this.telepon.add("0456");
        this.saldo.add(25000000);
    }

    public void setSaldo (int saldo){
        this.saldo.add(saldo);
        }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo(int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    //untuk mengetahui jumlah data arraylist nama member
    public int getJmlmember(){
        return this.namaMember.size();
    }
    
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }
        
    @Override
    public void setAlamat(String alamat) {
       this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }
    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    
    }
    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    
    
    }}
