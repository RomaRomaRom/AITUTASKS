package service;

import domain.Client;
import domain.Trainer;
import repository.TrainerRepository;

public class TrainerService {

    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public void registerTrainer(Trainer trainer) {
        trainerRepository.add(trainer);
    }

    public void assignClientToTrainer(Trainer trainer, Client client) {
        trainer.getClients().add(client);
    }
}
