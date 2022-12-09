package generics.igra;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("ivan", 13);
        Schoolar schoolar2 = new Schoolar("Petr", 15);

        Students Students1 = new Students("Genya", 20);
        Students Students2 = new Students("kirill", 25);

        Employee Employee1 = new Employee("Pasha", 30);
        Employee Employee2 = new Employee("Anton", 35);

        Team <Schoolar> schoolarTeam = new Team <>("Drakoni12");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team <Students> studentsTeam = new Team <>("Students");
        studentsTeam.addNewParticipant(Students1);
        studentsTeam.addNewParticipant(Students2);

        Team <Employee> workTeam = new Team <>("Rabotyagi");
        workTeam.addNewParticipant(Employee1);
        workTeam.addNewParticipant(Employee2);

        Team <Schoolar> schoolarTeam2 = new Team<>("Mudrecy");
        Schoolar schoolar3 = new Schoolar("Saha", 14);
        Schoolar schoolar4 = new Schoolar("Gena", 12);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam2.playWith(schoolarTeam);
        // schoolarTeam2.playWith(workTeam); При playwith <T> только тот же тип участников может играть с другим.


    }
}
