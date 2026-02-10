package repository;

import domain.Trainer;
import java.util.List;

public interface TrainerRepository {

    void add(Trainer trainer);

    Trainer findById(int id);

    List<Trainer> findAll();

    void remove(int id);
}
