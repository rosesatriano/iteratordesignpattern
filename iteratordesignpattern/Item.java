package iteratordesignpattern;

/**
 * In this class, we are holding the details of an item. This later prints the
 * item name, item description, and item price. 
 * @author rosesatriano
 */
public class Item{
    private String title;
    private String description;
    private double price;
    
    /**
     * This constructor initializes the variables to specific values.
     * @param title title of item
     * @param description description of item
     * @param price price of item
     */
    public Item(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }
    
    /**
     * This method returns the string representation of item that includes the title,
     * the description, and the price.
     */
    public String toString(){
        return "***** "+title+" *****\n "+description+"\n Price: $"+price+"\n";
    }

    /**
     * This method returns the price of the item. 
     * @return price 
     */
    public double getPrice(){
        return price;
    }

    /**
     * This method displays the item details including the title, description,
     * and price.
    */
    public void print(){
        System.out.println("***** "+title+" *****");
        System.out.println(description);
        System.out.println("Price: $"+price);
    }
}