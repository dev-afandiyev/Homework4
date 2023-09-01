package competition.obstacle.runningtrack;

import competition.obstacle.IObstacle;
import competition.participant.IParticipant;

class RunningTrack implements IObstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome(IParticipant participant) {
        participant.run(length);
    }

}