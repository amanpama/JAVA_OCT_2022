public class ShoppingCart {
    public ArrayList<String> items = new ArrayList<String>();
    public String store;
    public double total;
    
    public void add_item(String item, double price){
        this.items.add(item);
        this.total += price;
    }
}