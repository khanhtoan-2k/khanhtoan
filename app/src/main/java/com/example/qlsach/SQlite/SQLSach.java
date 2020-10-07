package com.example.qlsach.SQlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.qlsach.model.NguoiDung;
import com.example.qlsach.model.Sach;

import java.util.ArrayList;
import java.util.List;

public class SQLSach extends SQLiteOpenHelper {

    public SQLSach(@Nullable Context context) {
        super(context, "SQLiteBook.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_Sach = "Create table Sach(ID text primary key , TheLoai Text, Ten Nvarchar(50), TacGia Nvarchar(50), NhaXuatBan text, DonGia varchar(50), SoLuong varchar(50))";
        db.execSQL(create_Sach);
    }
    public void addSach(Sach sach){
        SQLiteDatabase db = getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID",sach.getId());
        contentValues.put("TheLoai",sach.getTheloai());
        contentValues.put("Name",sach.getTen());
        contentValues.put("TacGia",sach.getTacgia());
        contentValues.put("NhaXuatBan",sach.getNhaxuatban());
        contentValues.put("DonGia",sach.getDongia());
        contentValues.put("SoLuong",sach.getSoluong());
        db.insert("Sach",null,contentValues);
    }
    public List<Sach> getall(){
        List<Sach> sachList = new ArrayList<>();
        String get_all = "SELECT * FROM Sach";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String id,theloai,name,tacgia,nhaxuatban,dongia,soluong;
            id = cursor.getString(0);
            theloai = cursor.getString(1);
             name = cursor.getString(2);
            tacgia = cursor.getString(3);
            nhaxuatban = cursor.getString(4);
            dongia = cursor.getString(5);
            soluong = cursor.getString(6);
            Sach sach = new Sach(id,name,theloai,tacgia,nhaxuatban,dongia,soluong);
            sachList.add(sach);
            cursor.moveToNext();
        }
        cursor.close();
        return sachList;
    }
    public void xoaSach(String id) {
        SQLiteDatabase db =getWritableDatabase();
        db.delete("Sach","ID = ?",new String[]{id});
    }
    public void suaSach(Sach sach) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", sach.id);
        contentValues.put("TheLoai", sach.theloai);
        contentValues.put("Name", sach.ten);
        contentValues.put("TacGia", sach.tacgia);
        contentValues.put("NhaXuatBan", sach.nhaxuatban);
        contentValues.put("DonGia", sach.dongia);
        contentValues.put("SoLuong", sach.soluong);

        db.update("Sach", contentValues,
                "ID=?", new String[]{sach.getId()});
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
