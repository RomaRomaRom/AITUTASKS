package service;

import domain.*;
import repository.WorkoutRepository;

import java.time.LocalDate;
import java.util.List;

public class WorkoutService {

    private final WorkoutRepository workoutRepository;
    private final MembershipService membershipService;
    private final NotificationService notificationService;

    public WorkoutService( WorkoutRepository workoutRepository,MembershipService membershipService,NotificationService notificationService) {
        this.workoutRepository = workoutRepository;
        this.membershipService = membershipService;
        this.notificationService = notificationService;
    }

    public boolean registerClientForWorkout(Client client, Workout workout) {

        if (!membershipService.canClientAccess(client)) {
            notificationService.notify(
                client,
                "Access denied: membership inactive"
            );
            return false;
        }

        List<Client> participants = workout.getParticipants();

        if (participants.size() >= workout.getMaxParticipants()) {
            notificationService.notify(
                client,
                "Workout is full"
            );
            return false;
        }

        participants.add(client);

        AttendanceRecord record = new AttendanceRecord(
                client,
                workout,
                AttendanceStatus.REGISTERED,
                LocalDate.now()
        );

        client.getAttendanceRecords().add(record);

        notificationService.notify(
            client,
            "Successfully registered for workout: " + workout.getTitle()
        );

        return true;
    }

    public void addWorkout(Workout workout) {
        workoutRepository.add(workout);
    }
}
