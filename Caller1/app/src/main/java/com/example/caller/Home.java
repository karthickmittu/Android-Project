package com.example.caller;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
    View v;
    RecyclerView recyclerView;
    private List<Contact> list;


    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView=(RecyclerView) v.findViewById(R.id.recycler);

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list= new ArrayList<>();
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));
        list.add(new Contact("Karthick","mittu",R.drawable.sh2));





    }
}
