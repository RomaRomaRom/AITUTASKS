package repository;

import domain.Workout;
import java.util.List;

public interface WorkoutRepository {

    void add(Workout workout);

    Workout findById(int id);

    List<Workout> findAll();

    void remove(int id);
}
