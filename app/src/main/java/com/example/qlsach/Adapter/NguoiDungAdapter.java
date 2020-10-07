package com.example.qlsach.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsach.R;
import com.example.qlsach.model.NguoiDung;

import java.util.List;

public class NguoiDungAdapter extends BaseAdapter {
    List<NguoiDung> nguoiDungList;
    public NguoiDungAdapter(List<NguoiDung> nguoiDungList){
        this.nguoiDungList = nguoiDungList;
    }
    @Override
    public int getCount() {
        return nguoiDungList.size();
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
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hienthiuser,viewGroup,false);
        TextView idUser = view.findViewById(R.id.id);
        TextView nameUser = view.findViewById(R.id.name);
        TextView phoneUser = view.findViewById(R.id.phone);
        TextView gmailUser = view.findViewById(R.id.gmail);
        NguoiDung nguoiDung = nguoiDungList.get(i);
        idUser.setText(nguoiDung.id);
        nameUser.setText(nguoiDung.ten);
        phoneUser.setText(nguoiDung.sdt);
        gmailUser.setText(nguoiDung.gmail);
        return view;
    }
}
