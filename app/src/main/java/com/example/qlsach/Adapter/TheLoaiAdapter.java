package com.example.qlsach.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsach.R;
import com.example.qlsach.model.TheLoai;

import java.util.List;

public class TheLoaiAdapter extends BaseAdapter {
    List<TheLoai> theLoaiList;
    public TheLoaiAdapter(List<TheLoai> theLoaiList){
        this.theLoaiList = theLoaiList;
    }
    @Override
    public int getCount() {
        return theLoaiList.size();
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
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hienthitheloai,viewGroup,false);
        TextView idTheLoai = view.findViewById(R.id.idtheloai);
        TextView nameTheLoai = view.findViewById(R.id.tentheloai);
        TextView vitri = view.findViewById(R.id.vitri);
        TextView mota = view.findViewById(R.id.mota);
        TheLoai theLoai = theLoaiList.get(i);
        idTheLoai.setText(theLoai.id);
        nameTheLoai.setText(theLoai.ten);
        vitri.setText(theLoai.vitri);
        mota.setText(theLoai.mota);
        return view;
    }
}
