package repository;

import domain.Membership;
import java.util.List;

public interface MembershipRepository {

    void add(int clientId, Membership membership);

    Membership findByClientId(int clientId);

    List<Membership> findAll();

    void removeByClientId(int clientId);
}
