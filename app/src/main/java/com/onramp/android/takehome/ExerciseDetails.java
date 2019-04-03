package com.onramp.android.takehome;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import models.Exercise;
import viewmodels.ExerciseViewModel;


public class ExerciseDetails extends Fragment {
    private ExerciseViewModel viewModel;

    private TextView name;
    private TextView workout;
    private TextView reps;
    private TextView description;
    private TextView alternate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this.getActivity()).get(ExerciseViewModel.class);

        viewModel.getSelectedExercise().observe(this, item -> {
            displayDetails(viewModel.getExerciseDetails(item));
        });
    }


 public void displayDetails(Exercise exercise){
        name.setText(exercise.getName());
        workout.setText(exercise.getWorkout());
        reps.setText( exercise.getReps());
        description.setText(exercise.getDescription());
        alternate.setText(exercise.getAlternate());
 }

    public ExerciseDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_exercise_details, container, false);


       name = view.findViewById(R.id.name);
       workout = view.findViewById(R.id.workout);
       reps = view.findViewById(R.id.reps);
       description = view.findViewById(R.id.description);
       alternate = view.findViewById(R.id.alternate);

        return view;
    }

}
