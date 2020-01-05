package com.example.login;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ClassFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerView;
    private List<Class> classList;
    private RecyclerView.Adapter adapter;

    public ClassFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_class, container, false);
        myrecyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        myrecyclerView.setHasFixedSize(true);
        adapter = new ClassListAdapter(getContext(),classList);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(adapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        classList = new ArrayList<>();
        classList.add(new Class("JAVA", R.drawable.profile));
        classList.add(new Class("C", R.drawable.profile8));
        classList.add(new Class("Discrete Math", R.drawable.profile4));
        classList.add(new Class("Data Base", R.drawable.profile6));
        classList.add(new Class("OS", R.drawable.profile9));
        classList.add(new Class("Android", R.drawable.profile10));
        classList.add(new Class("NoSQL", R.drawable.profile3));
        classList.add(new Class("UI", R.drawable.profile1));
        classList.add(new Class("C++", R.drawable.profile5));
        classList.add(new Class("A.I", R.drawable.profile11));
        classList.add(new Class("Algorithm", R.drawable.profile7));
        classList.add(new Class("Data Structure", R.drawable.profile2));

    }
}

