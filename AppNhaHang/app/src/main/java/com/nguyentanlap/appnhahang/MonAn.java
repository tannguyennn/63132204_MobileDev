package com.nguyentanlap.appnhahang;

public class MonAn {
    private String tenMonAn;
    private double donGia;
    private String moTa;
    private int idAnh;

    public MonAn(String tenMonAn, double donGia, String moTa, int idAnh) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.idAnh = idAnh;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }
}
