package obstacles;

import participants.ParticipantI;

public class Track implements ObstaclesI {
    private float length;
    private String name= "Беговая дорожка";

    public String getName() {
        return name;
    }
    public Track(float length){
        this.length=length;
    }

    @Override
    public float getObstacleLength() {
        return length;
    }

    @Override
    public boolean handleParticipant(ParticipantI participant) {
       if(participant.getMaxRunLength()>=this.length){
           return true;
       }
       return false;
    }



}
