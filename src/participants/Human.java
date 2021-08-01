package participants;

import obstacles.ObstaclesI;

public class Human implements ParticipantI {
    private String name;
    private int maxRunLength;
    private int maxJumpHigh;
    private boolean isPassed;

    public Human(String name, int maxRunLength, int maxJumpHigh) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHigh = maxJumpHigh;
    }

    @Override
    public void run() {
        System.out.println("Человек бежит...");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает...");
    }

    @Override
    public int getMaxRunLength() {
        return maxRunLength;

    }

    @Override
    public int getMaxJumpHigh() {
        return 0;
    }

    @Override
    public boolean goThroughObstacle(ObstaclesI obstacles) {
        if (obstacles.handleParticipant(this)) {
            System.out.println(this.getName() + " прошёл через препятствие " + obstacles.getName() + "!");
            isPassed = true;
            return true;
        } else {
            System.out.println(this.getName() + " не справился и дисквалифицирован, при прохождении препятствия " + obstacles.getName() + "!");
            isPassed = false;
            return false;
        }
    }

    @Override
    public boolean toShowResult() {
        return isPassed;
    }


    public String getName() {
        return name;
    }
}
