package repository;

import domain.Client;
import java.util.List;

public interface ClientRepository {

    void add(Client client);

    Client findById(int id);

    List<Client> findAll();

    void remove(int id);
}

