package com.nguyentanlap.n63132204_thigiuaky;

public class DongVat {
    private String ten;
    private String tapTinh;
    private int soLuong;
    private int idAnh;

    public DongVat(String ten, String tapTinh, int soLuong, int idAnh) {
        this.ten = ten;
        this.tapTinh = tapTinh;
        this.soLuong = soLuong;
        this.idAnh = idAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTapTinh() {
        return tapTinh;
    }

    public void setTapTinh(String tapTinh) {
        this.tapTinh = tapTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }
}
