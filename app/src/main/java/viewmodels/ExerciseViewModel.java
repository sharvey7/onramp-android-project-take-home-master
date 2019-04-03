package viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import models.Exercise;
import repositories.ExerciseRepository;

public class ExerciseViewModel extends ViewModel {
    private final MutableLiveData<String> selectedExercise = new MutableLiveData<>();

    private ExerciseRepository repository = new ExerciseRepository();

    public void selectExercise(String exerciseName){
        selectedExercise.setValue(exerciseName);
    }

    public MutableLiveData<String> getSelectedExercise(){
        return selectedExercise;
    }

    public String[] getExerciseList(){
        return repository.getExercises();
    }

    public Exercise getExerciseDetails(String name){
        return repository.getExerciseDetails(name);
    }
}
