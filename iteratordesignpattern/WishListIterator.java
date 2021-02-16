package iteratordesignpattern;

import java.util.Iterator;

/**
 * This class implements the java.util iterator, so we can iterate the items
 * in the wishlist.
 * @author rosesatriano
 */
public class WishListIterator implements Iterator <Item>{
    private Item[] items;
    private int position = 0;

    /**
     * This constructor creates a new iterator for the items at the start.
     * @param items
     */
    public WishListIterator(Item[] items){
        this.items = items;
    }

    /**
     * This method moves through the list of items by using position. 
     * @param position allows the iterator to get the item at that specific 
     * position
     * @return This returns the next item in the iterator.
     */
    public Item next(){
        Item item = items[position];
        position = position + 1;
        return item;
    }

    /**
     * This method determines whether if there are items to iterate or not.
     * @return false is when there is no more items to iterate when we reach
     * the end of the list or if there is no item in that position. 
     * @return true when there are items to be iterated.
     */
    public boolean hasNext(){
        if(position >= items.length || items[position] == null){
            return false;
        } else{
            return true;
        }
    }
}
