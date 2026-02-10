package domain;


public interface MembershipState {

    boolean canAccess();

    void freeze(Membership membership);

    void activate(Membership membership);

    void expire(Membership membership);
}
