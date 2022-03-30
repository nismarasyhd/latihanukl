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
public class karyawan implements Usser {
    private ArrayList<String> namaKaryawan= new ArrayList<String>();
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    karyawan(){
        this.namaKaryawan.add("ara cantik sekali");
        this.alamat.add("malang");
        this.telepon.add("0895");
        this.jabatan.add(0);
    }
    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan (int idMember){
        return this.jabatan.get(idMember);
    }

    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
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
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}
