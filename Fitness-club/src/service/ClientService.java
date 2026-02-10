package service;

import domain.Client;
import repository.ClientRepository;

public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void registerClient(Client client) {
        clientRepository.add(client);
    }

    public Client getClientById(int id) {
        return clientRepository.findById(id);
    }
}
