package creational.adaptor;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
    List<Item> list = new ArrayList<Item>();

    public void addLItem(Item item){
        list.add(item);
    }
}
