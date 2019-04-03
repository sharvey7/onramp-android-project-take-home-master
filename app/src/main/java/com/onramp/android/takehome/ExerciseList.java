package com.onramp.android.takehome;


import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Objects;

import viewmodels.ExerciseViewModel;



public class ExerciseList extends Fragment {

    private ExerciseViewModel  viewModel;
    private ListView lv;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //setContentView(R.layout.fragment_exercise_list);
         viewModel = ViewModelProviders.of(Objects.requireNonNull(this.getActivity())).get(ExerciseViewModel.class);

        lv.setAdapter(new ArrayAdapter<>(this.getActivity(),
                android.R.layout.simple_list_item_1, viewModel.getExerciseList()));

        lv.setOnItemClickListener((adapter, itemView, pos, id) -> {


            TextView tv = (TextView)itemView;
            Toast.makeText(this.getContext(), tv.getText().toString(), Toast.LENGTH_SHORT).show();
                    viewModel.selectExercise(tv.getText().toString());
        });
    }



    public ExerciseList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercise_list,
                container, false);
        lv = (ListView)view.findViewById(R.id.exercises_l);

        return view;
    }

}
