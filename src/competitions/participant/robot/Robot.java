package competition.participant.robot;

import competition.participant.IParticipant;

class Robot implements IParticipant {

    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean onDistance;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " ran " + distance + " метров.");
        } else {
            System.out.println(name + " couldn't run " + distance + " meters.");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " jumped over the wall " + height + " meters.");
        } else {
            System.out.println(name + " couldn't jump over the high wall " + height + " meters.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

}