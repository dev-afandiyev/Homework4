package competitions.obstacle.runningtrack;

import competitions.obstacle.IObstacle;
import competitions.participant.IParticipant;

public class RunningTrack implements IObstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome(IParticipant participant) {
        participant.run(length);
    }

}