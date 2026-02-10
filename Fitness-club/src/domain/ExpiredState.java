package domain;


public class ExpiredState implements MembershipState {

    @Override
    public boolean canAccess() {
        return false;
    }

    @Override
    public void freeze(Membership membership) {
 
    }

    @Override
    public void activate(Membership membership) {
 
    }

    @Override
    public void expire(Membership membership) {

    }
}
