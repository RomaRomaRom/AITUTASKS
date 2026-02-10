package service;

import domain.Client;
import domain.Membership;
import repository.MembershipRepository;

public class MembershipService {

    private final MembershipRepository membershipRepository;

    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public void assignMembership(Client client, Membership membership) {
        client.setMembership(membership);
        membershipRepository.add(client.getId(), membership);
    }

    public boolean canClientAccess(Client client) {
        Membership membership = client.getMembership();
        return membership != null && membership.canAccess() && membership.hasVisits();
    }

    public void freezeMembership(Client client) {
        Membership membership = client.getMembership();
        if (membership != null) {
            membership.freeze();
        }
    }

    public void activateMembership(Client client) {
        Membership membership = client.getMembership();
        if (membership != null) {
            membership.activate();
        }
    }

    public void expireMembership(Client client) {
        Membership membership = client.getMembership();
        if (membership != null) {
            membership.expire();
        }
    }
}
