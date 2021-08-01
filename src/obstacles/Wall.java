package obstacles;

import participants.ParticipantI;

public class Wall implements ObstaclesI {
    private float high;
    private String name= "Стена";

    public String getName() {
        return name;
    }


    public Wall(float high) {
        this.high = high;
    }

    @Override
    public float getObstacleLength() {
        return high;
    }

    @Override
    public boolean handleParticipant(ParticipantI participant) {
        if(participant.getMaxJumpHigh()>=this.high){
            return true;
        }
        return false;
    }


}
