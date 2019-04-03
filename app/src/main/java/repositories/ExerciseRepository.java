package repositories;

import java.util.HashMap;

import models.Exercise;

public class ExerciseRepository {

    private String exercises[];
    private HashMap<String, Exercise> exerciseDetails;
    public String[] getExercises(){
        if(exercises == null){
            exercises = new String[6];
            exercises[0] = "Legs";
            exercises[1] = "Biceps";
            exercises[2] = "Triceps";
            exercises[3] = "Chest";
            exercises[4] = "Stomach";
            exercises[5] = "Glutes";
        }
        return exercises;
    }

    public Exercise getExerciseDetails(String name){
        if(exerciseDetails == null){
            createExerciseDetailsMap();
        }
        return exerciseDetails.get(name);
    }

    public void createExerciseDetailsMap(){
        exerciseDetails = new HashMap<>();

        Exercise exercise = new Exercise();
        exercise.setName("Legs");
        exercise.setWorkout("Banded lateral walk");
        exercise.setReps(2);
        exercise.setDescription("Walk back and forth with band around lower legs. Take slow steps ");
        exercise.setAlternate("Crab Walk");

        exerciseDetails.put("Legs", exercise);

        exercise = new Exercise();

        exercise.setName("Biceps");
        exercise.setWorkout("Bicep Curls");
        exercise.setReps(16);
        exercise.setDescription("Stand up straight, keep elbows close to side ");
        exercise.setAlternate("Behind the back cable curl");

        exerciseDetails.put("Biceps", exercise);

        exercise = new Exercise();

        exercise.setName("Triceps");
        exercise.setWorkout("Standing Dumbell");
        exercise.setReps(16);
        exercise.setDescription("Have weights in each hand with palms forward and slowly lower ");
        exercise.setAlternate("TRX tricep extensions");

        exerciseDetails.put("Triceps", exercise);

        exercise = new Exercise();

        exercise.setName("Chest");
        exercise.setWorkout("Dumbell Press");
        exercise.setReps(12);
        exercise.setDescription("Lie down flat on a bench with dumbbell in each hand");
        exercise.setAlternate("Push-ups");

        exerciseDetails.put("Chest", exercise);

        exercise = new Exercise();

        exercise.setName("Stomach");
        exercise.setWorkout("Bicycle exercises");
        exercise.setReps(12);
        exercise.setDescription("Get on back and cycle your legs");
        exercise.setAlternate("Flutter Kicks");

        exerciseDetails.put("Stomach", exercise);

        exercise = new Exercise();

        exercise.setName("Glutes");
        exercise.setWorkout("squats");
        exercise.setReps(12);
        exercise.setDescription("Keep feet slightly wider than hip-width and hands by side");
        exercise.setAlternate("Goblet Squats");

        exerciseDetails.put("Glutes", exercise);

    }
}
