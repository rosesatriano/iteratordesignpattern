package iteratordesignpattern;

import java.util.Iterator;

public class WishListIterator implements Iterator <Item>{
    private Item[] items;
    private int position = 0;

    public WishListIterator(Item[] items){
        this.items = items;
    }

    public Item next(){
        Item item = items[position];
        position = position + 1;
        return item;
    }

    public boolean hasNext(){
        if(position >= items.length || items[position] == null){
            return false;
        } else{
            return true;
        }
    }
}
