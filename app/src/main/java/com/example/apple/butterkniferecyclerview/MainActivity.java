package com.example.apple.butterkniferecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edt_name)
    EditText edtName;
    @BindView(R.id.edt_add)
    EditText edtAdd;
    @BindView(R.id.btn_show)
    Button btnShow;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    StudentAadapter studentAadapter;
    List<Student>  students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_show)
    public void onViewClicked() {
        String name = edtName.getText().toString().trim();
        String add = edtAdd.getText().toString().trim();
        Student student = new Student(name, add);
        students = new ArrayList<>();
        students.add(student);
        studentAadapter=new StudentAadapter(students,this);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(studentAadapter);
        Toast.makeText(this, "data passed", Toast.LENGTH_LONG).show();
    }
}
