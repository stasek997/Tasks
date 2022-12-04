package Lesson12;

public class Phone {

    private double price;
    private String name;


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getSeasonPrice(double discount, SeasonPrice func) {
        return func.calcPrice(discount, price);
    }

    public double chooseAndGetSeasonPrice(String season) {
        switch (season) {
            case "winter":
                return getSeasonPrice(40.0, (discount, price) -> {
                    return price - discount * Math.random()*10;
                });
            case "spring":
                return getSeasonPrice(40.0, (discount, price) -> {
                    return price * (1 + Math.sqrt(Math.pow(discount / Math.random() * 100, 2 )));
                });
            case "summer":
                return getSeasonPrice(40.0, (discount, price) -> {
                    return price - Math.sqrt(Math.pow(Math.random()*10 - discount * 5,2));
                });
            case "autumn":
                return getSeasonPrice(40.0, (discount, price) -> {
                    return price * (1 + Math.sqrt(Math.pow(discount / Math.random() * 100, 2 )) + 2);
                });
            default:
                return price;
        }


    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
