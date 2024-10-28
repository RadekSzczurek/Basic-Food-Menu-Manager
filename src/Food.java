public class Food {
    private String dishName;
    private int price;

    public Food(String dishName, int price) {
        this.dishName = dishName;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nazwa dania -> " + dishName +
                ", Cena -> " + price + " zł";
    }
}
