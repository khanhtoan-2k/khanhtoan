package com.example.qlsach.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsach.R;
import com.example.qlsach.model.HoaDon;

import java.util.List;

public class HoaDonAdapter extends BaseAdapter {
    List<HoaDon> hoaDonList;
    public HoaDonAdapter(List<HoaDon> hoaDonList){
        this.hoaDonList = hoaDonList;
    }
    @Override
    public int getCount() {
        return hoaDonList.size();
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
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hienthihoadon,viewGroup,false);
        TextView idHoaDon = view.findViewById(R.id.idhd);
        TextView date = view.findViewById(R.id.date);
        HoaDon hoaDon = hoaDonList.get(i);
        idHoaDon.setText(hoaDon.id);
        date.setText(hoaDon.ngay);
        return view;
    }
}
