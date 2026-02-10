package domain;

import java.time.LocalDate;

public abstract class Membership {

    protected LocalDate startDate;
    protected LocalDate endDate;
    protected MembershipState state;

    public Membership(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = new ActiveState();
    }

    public boolean canAccess() {
        return state.canAccess();
    }

    public void freeze() {
        state.freeze(this);
    }

    public void activate() {
        state.activate(this);
    }

    public void expire() {
        state.expire(this);
    }

    protected void setState(MembershipState state) {
        this.state = state;
    }

    public abstract boolean hasVisits();
}
