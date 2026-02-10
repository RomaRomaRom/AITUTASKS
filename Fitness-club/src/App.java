

import domain.*;
import repository.*;
import service.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // repositories
        ClientRepository clientRepository = new InMemoryClientRepository();
        TrainerRepository trainerRepository = new InMemoryTrainerRepository();
        WorkoutRepository workoutRepository = new InMemoryWorkoutRepository();
        MembershipRepository membershipRepository = new InMemoryMembershipRepository();

        // services
        ClientService clientService = new ClientService(clientRepository);
        MembershipService membershipService = new MembershipService(membershipRepository);
        TrainerService trainerService = new TrainerService(trainerRepository);
        NotificationService notificationService = new NotificationService();

        WorkoutService workoutService = new WorkoutService(
                workoutRepository,
                membershipService,
                notificationService
        );

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n=== FITNESS CLUB SYSTEM ===");
                System.out.println("1. Register client");
                System.out.println("2. Create membership");
                System.out.println("3. Register trainer");
                System.out.println("4. Create workout");
                System.out.println("5. Register client for workout");
                System.out.println("6. Freeze membership");
                System.out.println("7. Show clients");
                System.out.println("0. Exit");
                System.out.print("Choose option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1 -> {
                        System.out.print("Client id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Client name: ");
                        String name = scanner.nextLine();

                        Client client = new Client(id, name);
                        clientService.registerClient(client);
                    }

                    case 2 -> {
                        System.out.print("Client id: ");
                        int clientId = scanner.nextInt();

                        Client client = clientService.getClientById(clientId);
                        if (client == null) {
                            System.out.println("Client not found");
                            break;
                        }

                        System.out.println("1. Unlimited");
                        System.out.println("2. Limited");
                        int type = scanner.nextInt();

                        Membership membership;

                        if (type == 1) {
                            membership = new UnlimitedMembership(
                                    LocalDate.now(),
                                    LocalDate.now().plusMonths(1)
                            );
                        } else {
                            System.out.print("Visits count: ");
                            int visits = scanner.nextInt();
                            membership = new LimitedMembership(
                                    LocalDate.now(),
                                    LocalDate.now().plusMonths(1),
                                    visits
                            );
                        }

                        membershipService.assignMembership(client, membership);
                    }

                    case 3 -> {
                        System.out.print("Trainer id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Trainer name: ");
                        String name = scanner.nextLine();

                        System.out.print("Specialization: ");
                        String spec = scanner.nextLine();

                        Trainer trainer = new Trainer(id, name, spec);
                        trainerService.registerTrainer(trainer);
                    }

                    case 4 -> {
                        System.out.print("Workout id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Workout title: ");
                        String title = scanner.nextLine();

                        System.out.print("Trainer id: ");
                        int trainerId = scanner.nextInt();

                        Trainer trainer = trainerRepository.findById(trainerId);
                        if (trainer == null) {
                            System.out.println("Trainer not found");
                            break;
                        }

                        Workout workout = new Workout(
                                id,
                                title,
                                LocalDateTime.now().plusDays(1),
                                60,
                                5,
                                trainer
                        );

                        workoutService.addWorkout(workout);
                    }

                    case 5 -> {
                        System.out.print("Client id: ");
                        int clientId = scanner.nextInt();

                        System.out.print("Workout id: ");
                        int workoutId = scanner.nextInt();

                        Client client = clientService.getClientById(clientId);
                        Workout workout = workoutRepository.findById(workoutId);

                        if (client == null || workout == null) {
                            System.out.println("Client or workout not found");
                            break;
                        }

                        workoutService.registerClientForWorkout(client, workout);
                    }

                    case 6 -> {
                        System.out.print("Client id: ");
                        int clientId = scanner.nextInt();

                        Client client = clientService.getClientById(clientId);
                        if (client != null) {
                            membershipService.freezeMembership(client);
                        }
                    }

                    case 7 -> {
                        for (Client c : clientRepository.findAll()) {
                            System.out.println(
                                    c.getId() + " - " + c.getName()
                            );
                        }
                    }

                    case 0 -> running = false;

                    default -> System.out.println("Unknown option");
                }
            }
        }
    }
}
