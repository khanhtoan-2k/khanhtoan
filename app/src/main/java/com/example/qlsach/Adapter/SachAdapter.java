package com.example.qlsach.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.qlsach.R;
import com.example.qlsach.model.Sach;

import java.util.List;

public class SachAdapter extends BaseAdapter {
    List<Sach> sachList;
    public SachAdapter(List<Sach> sachList){
        this.sachList = sachList;
    }
    @Override
    public int getCount() {
        return sachList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hienthisach,viewGroup,false);
        TextView idSach = view.findViewById(R.id.idbook);
        TextView tl = view.findViewById(R.id.theloai);
        TextView nameSach = view.findViewById(R.id.tensach);
        TextView tacgia = view.findViewById(R.id.tacgia);
        TextView nhaxuatban = view.findViewById(R.id.nhaxuatban);
        TextView dongia = view.findViewById(R.id.dongia);
        TextView soluong = view.findViewById(R.id.amount);
        Sach sach = sachList.get(i);
        idSach.setText(sach.id);
        tl.setText(sach.theloai);
        nameSach.setText(sach.ten);
        tacgia.setText(sach.tacgia);
        nhaxuatban.setText(sach.nhaxuatban);
        dongia.setText(sach.dongia);
        soluong.setText(sach.soluong);
        return view;
    }
}
