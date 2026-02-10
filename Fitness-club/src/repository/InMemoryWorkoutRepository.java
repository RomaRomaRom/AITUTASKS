package repository;

import domain.Workout;
import java.util.*;

public class InMemoryWorkoutRepository implements WorkoutRepository {

    private final Map<Integer, Workout> workouts = new HashMap<>();

    @Override
    public void add(Workout workout) {
        workouts.put(workout.getId(), workout);
    }

    @Override
    public Workout findById(int id) {
        return workouts.get(id);
    }

    @Override
    public List<Workout> findAll() {
        return new ArrayList<>(workouts.values());
    }

    @Override
    public void remove(int id) {
        workouts.remove(id);
    }
}
