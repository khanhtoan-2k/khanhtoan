package com.example.qlsach.model;

public class Sach {
    public String id, theloai, ten, tacgia, nhaxuatban, dongia, soluong;

    public Sach(String id, String theloai, String ten, String tacgia, String nhaxuatban, String dongia, String soluong) {
        this.id = id;
        this.theloai = theloai;
        this.ten = ten;
        this.tacgia = tacgia;
        this.nhaxuatban = nhaxuatban;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
}
