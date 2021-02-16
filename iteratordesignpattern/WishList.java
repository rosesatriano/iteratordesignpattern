package iteratordesignpattern;

/**
 * Wishlist is a program that creates a list of items that includes the item,
 * the price, and the description. We also get the running total cost when
 * an item is added. We can also double our array list later on.
 * @author rosesatriano
 */
public class WishList {
    /**
     * @param name is a string that will later be used to identify the name of
     * the item.
     * @param items is the name of the Item array of objects.
     * @param count is initialized as 0 so we can move through an array and know
     * where we are later on.     
    */
    private String name;
    private Item[] items;
    private int count = 0;

    /**
     * This constructor creates an empty list of a given name with a max of 
     * 5 items
     * @param name given name of object
     */
    public WishList(String name){
        this.name = name;
        items = new Item[5];
    }

    /**
     * This method adds the item with its description and price to a list. If
     * the wishlist is full, then we send the list to be doubled in growArray. 
     * @param title is the name of the object
     * @param description is the description of the object
     * @param price is the price of the object
     */
    public void addItem(String title, String description, double price){
        if(count == items.length){
            items = growArray(items);
        }
        items[count] = new Item(title, description, price);
        count = count + 1;
    }

    /**
     * This method returns a new WishList iterator including items.
     * @return returns new wishlist iterator
     */
    public WishListIterator createIterator(){
        return new WishListIterator(items);
    }

    /**
     * This method takes the cost of an item and adds it to the runnning total
     * cost. 
     * @return This returns the total cost.
     */
    public double getTotalCost(){
        double total = 0;
        for(int i = 0; i < count; i++){
            total = total + items[i].getPrice();
        }
        return total;
    }

    /**
     * This method grows the array by doubling the array length. In order to 
     * do so, we must create a temporary array to copy the original values into.
     * @param items name of the original arrayy
     * @param grow temporary array name
     * @return This returns the temporary array that is the original doubled.
     */
    private Item[] growArray(Item[] items){
        Item[] grow = new Item[2*items.length];
        for(int i = 0; i < items.length; i++){
            grow[i] = items[i];
        }
        return grow;
    }
}
