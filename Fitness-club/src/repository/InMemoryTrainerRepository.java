package repository;

import domain.Trainer;
import java.util.*;

public class InMemoryTrainerRepository implements TrainerRepository {

    private final Map<Integer, Trainer> trainers = new HashMap<>();

    @Override
    public void add(Trainer trainer) {
        trainers.put(trainer.getId(), trainer);
    }

    @Override
    public Trainer findById(int id) {
        return trainers.get(id);
    }

    @Override
    public List<Trainer> findAll() {
        return new ArrayList<>(trainers.values());
    }

    @Override
    public void remove(int id) {
        trainers.remove(id);
    }
}
