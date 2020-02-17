package com.example.foster.data;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.caller.R;

import java.util.ArrayList;
import java.util.List;

public class FosterFragment extends Fragment {

private RecyclerView rvList;

    private ListAdapter adapter;

    private static String ARG_DATA="ARG_DATA";


    public static FosterFragment newInstance(ArrayList<Data> data) {
        FosterFragment fragment = new FosterFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList(ARG_DATA, data);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.foster_tab_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvList=view.findViewById(R.id.recyclerView);
        rvList.setLayoutManager(new LinearLayoutManager(this.getContext()));

        setData();
    }

    private void setData() {
        ArrayList<Data> dataList=getArguments().getParcelableArrayList(ARG_DATA);

        adapter=new ListAdapter(dataList);
        rvList.setAdapter(adapter);

    }
}
