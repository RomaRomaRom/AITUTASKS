package domain;

public class FrozenState implements MembershipState {

    @Override
    public boolean canAccess() {
        return false;
    }

    @Override
    public void freeze(Membership membership) {

    }

    @Override
    public void activate(Membership membership) {
        membership.setState(new ActiveState());
    }

    @Override
    public void expire(Membership membership) {
        membership.setState(new ExpiredState());
    }
}
