package domain;

import java.time.LocalDate;

public class UnlimitedMembership extends Membership {

    public UnlimitedMembership(LocalDate startDate, LocalDate endDate) {
        super(startDate, endDate);
    }

    @Override
    public boolean hasVisits() {
        return true;
    }
}
