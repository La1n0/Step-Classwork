import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductService {
    private List<product> productList;

    public ProductService(List<product> productList) {
        this.productList = productList;
    }

    public List<product> filterProductsByPrice(double minPrice, double maxPrice) {
        return productList.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<product> sortProductsByName() {
        return productList.stream()
                .sorted(Comparator.comparing(product::getName))
                .collect(Collectors.toList());
    }

    public Map<Integer, List<product>> groupProductsByQuantity() {
        return productList.stream()
                .collect(Collectors.groupingBy(product::getQuantity));
    }

    public double calculateTotalStockValue() {
        return productList.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
    }

    public product findMostExpensiveProduct() {
        return productList.stream()
                .max(Comparator.comparing(product::getPrice))
                .orElse(null);
    }

    public List<product> getProductsExpiringInFuture() {
        LocalDate today = LocalDate.now();
        return productList.stream()
                .filter(product -> product.getExpirationDate().isAfter(today))
                .collect(Collectors.toList());
    }
}
