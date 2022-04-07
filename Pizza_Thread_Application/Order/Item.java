package Order;

public class Item {
    String itemName;
    int price;
    int preparationTime;

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPreparationTime(){
        return this.preparationTime;
    }

    public void setPreparationTime(int preparationTime){
        this.preparationTime = preparationTime;
    }
}
