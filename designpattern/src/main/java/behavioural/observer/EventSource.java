package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class EventSource {

    List<Observer> list = new ArrayList<>();
    void subscribe(Observer o){
        list.add(o);
    }
    void notify(String event)
    {
        list.stream().forEach(x->x.update(event));
    }
}
