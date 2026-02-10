package domain;

public class ActiveState implements MembershipState {

    @Override
    public boolean canAccess() {
        return true;
    }

    @Override
    public void freeze(Membership membership) {
        membership.setState(new FrozenState());
    }

    @Override
    public void activate(Membership membership) {
        // already active
    }

    @Override
    public void expire(Membership membership) {
        membership.setState(new ExpiredState());
    }
}
