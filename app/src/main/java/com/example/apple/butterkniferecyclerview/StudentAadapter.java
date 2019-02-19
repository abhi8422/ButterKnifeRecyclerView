package com.example.apple.butterkniferecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudentAadapter extends RecyclerView.Adapter<StudentViewHolder> {
    List<Student> studentList;
    Context context;

    public StudentAadapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_list,null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        Student student=studentList.get(i);
        studentViewHolder.name.setText(student.getName());
        studentViewHolder.add.setText(student.getAdd());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
