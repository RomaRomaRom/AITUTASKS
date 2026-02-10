package repository;

import domain.Client;
import java.util.*;

public class InMemoryClientRepository implements ClientRepository {

    private final Map<Integer, Client> clients = new HashMap<>();

    @Override
    public void add(Client client) {
        clients.put(client.getId(), client);
    }

    @Override
    public Client findById(int id) {
        return clients.get(id);
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(clients.values());
    }

    @Override
    public void remove(int id) {
        clients.remove(id);
    }
}
