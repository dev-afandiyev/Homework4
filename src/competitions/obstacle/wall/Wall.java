package competitions.obstacle.wall;

import competitions.obstacle.IObstacle;
import competitions.participant.IParticipant;

public class Wall implements IObstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(IParticipant participant) {
        participant.jump(height);
    }

}
