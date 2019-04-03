package models;

public class Exercise {

    private String name;   //for which body part it targets
    private String workout;     //how many times you do it
    private int reps;
    private String description;
    private String alternate;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getWorkout(){
        return workout;
    }

    public void setWorkout(String workout){
        this.workout = workout;
    }

    public int getReps(){
        return reps;
    }

    public void setReps(int reps){
        this.reps = reps;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getAlternate(){
        return alternate;
    }
    public void setAlternate(String alternate){
        this.alternate = alternate;
    }
}
