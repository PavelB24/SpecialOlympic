package obstacles;

import participants.ParticipantI;

public interface ObstaclesI {
    float getObstacleLength();
    boolean handleParticipant(ParticipantI participant);
    public String getName();

}
