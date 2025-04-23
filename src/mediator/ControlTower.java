package src.mediator;

import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements TowerMediator {
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();

    @Override
    public void broadcast(String msg, Aircraft sender) {
        System.out.println(sender.getClass().getSimpleName() + " (" + sender.id + "): " + msg);
    }

    @Override
    public boolean requestRunway(Aircraft a) {
        landingQueue.add(a);
        return true;
    }
}
