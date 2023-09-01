package competition.obstacle.wall;

import competition.obstacle.IObstacle;
import competition.participant.IParticipant;

class Wall implements IObstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(IParticipant participant) {
        participant.jump(height);
    }

}
