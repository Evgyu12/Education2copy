package collections.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangeEx {
    public static void main(String[] args) {
        Exchanger <Action> exchanger = new Exchanger<>();
        List<Action> friends1Action = new ArrayList<>();
        friends1Action.add(Action.NOJNICI);
        friends1Action.add(Action.BUMAGA);
        friends1Action.add(Action.NOJNICI);
        List<Action> friends2Action = new ArrayList<>();
        friends2Action.add(Action.BUMAGA);
        friends2Action.add(Action.KAMEN);
        friends2Action.add(Action.KAMEN);
        new BeastFriends("Vanya", friends1Action,exchanger);
        new BeastFriends("Petya", friends2Action,exchanger);


    }
}

enum Action {
    KAMEN ,NOJNICI, BUMAGA;
}

class BeastFriends extends Thread{
    private String name;
    private List<Action> myActions;

    private Exchanger <Action> exchanger;

    public BeastFriends(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins (Action myAction, Action friendsActions){
        if((myAction == Action.KAMEN && friendsActions == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendsActions == Action.BUMAGA)
                    || (myAction == Action.BUMAGA && friendsActions == Action.KAMEN))
        {
            System.out.println(name + " WINS");
        }
    }
    public void run (){
        Action reply;
        for (Action action: myActions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}