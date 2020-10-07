package com.example.qlsach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.qlsach.List.ListBook;
import com.example.qlsach.List.ListUser;
import com.example.qlsach.SQlite.SQLNguoiDung;
import com.example.qlsach.SQlite.SQLSach;
import com.example.qlsach.model.NguoiDung;
import com.example.qlsach.model.Sach;

import java.util.ArrayList;

public class SachActivity extends AppCompatActivity {
    Button btAdd, btShow, btCancel;
    Spinner spn;
    EditText id, name, tacgia, nhaxuatban, price, amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sach);
        btAdd = findViewById(R.id.btnAdd);
        btShow = findViewById(R.id.btnShow);
        id = findViewById(R.id.edtIDBook);
        name = findViewById(R.id.edtNameBook);
        tacgia = findViewById(R.id.edtTacGia);
        nhaxuatban = findViewById(R.id.edtNhaXuatBan);
        price = findViewById(R.id.edtPrice);
        amount = findViewById(R.id.edtAmount);
        btCancel = findViewById(R.id.btnCancel);
        spn = findViewById(R.id.spinner);
        final ArrayList<String> thel= new ArrayList<String>();
        thel.add("IT");
        thel.add("Math");
        thel.add("English");
        thel.add("Literature");
       ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,thel);
       spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SachActivity.this,spn.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SachActivity.this, TrangChuActivity.class);
                startActivity(i);
            }
        });
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (id.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Không được để trống ID Sách ", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (name.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Không được để trống tên Sách", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (tacgia.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Không được để trống tên Tác Gỉa", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (nhaxuatban.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Không được để trống nhà xuất bản", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (price.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Không được để trống số tiền", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (amount.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Không được để trống số lượng", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    SQLSach sqlSach = new SQLSach(SachActivity.this);
                    Sach sach = new Sach(id.getText().toString(),null, name.getText().toString(), tacgia.getText().toString(), nhaxuatban.getText().toString(),price.getText().toString(),amount.getText().toString());
                    sqlSach.addSach(sach);
                    Toast.makeText(getApplicationContext(), "Thêm thành công", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(SachActivity.this, ListBook.class);
                    startActivity(i);

                }
            }
        });
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SachActivity.this, ListBook.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Hiển thị thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
