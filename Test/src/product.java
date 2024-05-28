import java.time.LocalDate;

public class product {
    private String name;
    private int quantity;
    private double price;
    private boolean available;
    private LocalDate expirationDate;

    public product(String name, int quantity, double price, boolean available, LocalDate expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.available = available;
        this.expirationDate = expirationDate;
    }

    public double getPrice() { return price;
    }

    public Integer getQuantity() { return quantity;
    }

    public <U> U getName() {
        return (U) name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
