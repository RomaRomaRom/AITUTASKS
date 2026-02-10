package repository;

import domain.Membership;
import java.util.*;

public class InMemoryMembershipRepository implements MembershipRepository {

    private final Map<Integer, Membership> memberships = new HashMap<>();

    @Override
    public void add(int clientId, Membership membership) {
        memberships.put(clientId, membership);
    }

    @Override
    public Membership findByClientId(int clientId) {
        return memberships.get(clientId);
    }

    @Override
    public List<Membership> findAll() {
        return new ArrayList<>(memberships.values());
    }

    @Override
    public void removeByClientId(int clientId) {
        memberships.remove(clientId);
    }
}
