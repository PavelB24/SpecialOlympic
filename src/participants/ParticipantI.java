package participants;

import obstacles.ObstaclesI;

public interface ParticipantI {
    void run();

    void jump();

    String getName();

    int getMaxRunLength();

    int getMaxJumpHigh();

    boolean goThroughObstacle(ObstaclesI obstacles);

    boolean toShowResult();


}
