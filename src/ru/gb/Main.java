package ru.gb;

import obstacles.ObstaclesI;
import obstacles.Track;
import obstacles.Wall;
import participants.Cat;
import participants.Human;
import participants.ParticipantI;
import participants.Robot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ParticipantI> participants = new ArrayList<>();
        List<ObstaclesI> obstacles = new ArrayList<>();
        toFillArrays(participants, obstacles);
        toStartCompetition(participants, obstacles);
        toShowResults(participants);
    }

    private static void toShowResults(List<ParticipantI> participants) {
        System.out.println();
        for (ParticipantI participant : participants) {
            if (participant.toShowResult()) {
                System.out.println(participant.getName() + " прошёл соровнование!");
            } else {
                System.out.println(participant.getName() + " сошёл с дистанции, соревнование не прошёл");
            }

        }
    }

    public static void toStartCompetition(List<ParticipantI> participants, List<ObstaclesI> obstacles) {
        for (ParticipantI participant : participants) {
            System.out.println("------------------------------------");
            System.out.println("Очередь за " + participant.getName());
            System.out.println();
            for (ObstaclesI obstacle : obstacles) {
                if (!participant.goThroughObstacle(obstacle)) {
                    break;
                }
            }
        }

    }

    private static void toFillArrays(List<ParticipantI> participants, List<ObstaclesI> obstacles) {

        participants.add(new Cat("Вася", 50, 1));
        participants.add(new Robot("Дроид-Эльбрус", 800, 2));
        participants.add(new Human("Джон", 200, 1));

        obstacles.add(new Track(200));
        obstacles.add(new Wall(1.2f));
    }
}