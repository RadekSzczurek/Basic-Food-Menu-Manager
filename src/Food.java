public class Food {
    private final String dishName;
    private final int price;

    public Food(String dishName, int price) {
        this.dishName = dishName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nazwa dania -> " + dishName +
                ", Cena -> " + price + " zł";
    }
}
