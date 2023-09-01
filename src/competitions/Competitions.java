package competitions;

import competitions.obstacle.IObstacle;
import competitions.obstacle.runningtrack.RunningTrack;
import competitions.obstacle.wall.Wall;
import competitions.participant.IParticipant;
import competitions.participant.cat.Cat;
import competitions.participant.human.Human;
import competitions.participant.robot.Robot;

public class Competitions {

    private IParticipant[] participants = {
            new Human("Human", 100, 2),
            new Cat("Cat", 150, 1),
            new Robot("Robot", 200, 3)
    };

    private IObstacle[] obstacles = {
            new RunningTrack(50),
            new Wall(1),
            new RunningTrack(100),
            new Wall(2)
    };

    public void getCompetitionResults() {
        for (IParticipant participant : participants) {
            for (IObstacle obstacle : obstacles) {
                if (participant.isOnDistance()) {
                    obstacle.overcome(participant);
                }
            }
            System.out.println(
                    participant.isOnDistance() ? "Participant " + participant.getClass().getSimpleName() + " passed all obstacles! \n"
                            : "Participant " + participant.getClass().getSimpleName() + " dropped out. \n"
            );
        }
    }

}
