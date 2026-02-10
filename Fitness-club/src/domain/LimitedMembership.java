package domain;

import java.time.LocalDate;

public class LimitedMembership extends Membership {

    private int remainingVisits;

    public LimitedMembership(LocalDate startDate, LocalDate endDate, int visits) {
        super(startDate, endDate);
        this.remainingVisits = visits;
    }

    @Override
    public boolean hasVisits() {
        return remainingVisits > 0;
    }

    public void useVisit() {
        if (remainingVisits > 0) {
            remainingVisits--;
        }
    }

    public int getRemainingVisits() {
        return remainingVisits;
    }
}
