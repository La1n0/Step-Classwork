import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<product> productList = new ArrayList<>();
        productList.add(new product("Laptop", 5, 2500.0, true, LocalDate.of(2025, 12, 31)));
        productList.add(new product("Telefon", 10, 1500.0, true, LocalDate.of(2024, 9, 30)));
        productList.add(new product("Tabletă", 8, 800.0, false, LocalDate.of(2023, 6, 15)));
        productList.add(new product("Mouse", 20, 50.0, true, LocalDate.of(2024, 4, 20)));


        ProductService productService = new ProductService(productList);


        List<product> filteredProducts = productService.filterProductsByPrice(500.0, 2000.0);
        System.out.println("Produse filtrate după preț: " + filteredProducts);


        List<product> sortedProducts = productService.sortProductsByName();
        System.out.println("Produse sortate după nume: " + sortedProducts);


        Map<Integer, List<product>> groupedProducts = productService.groupProductsByQuantity();
        System.out.println("Produse grupate după cantitate: " + groupedProducts);


        double totalStockValue = productService.calculateTotalStockValue();
        System.out.println("Valoarea totală a stocului: " + totalStockValue);


        product mostExpensiveProduct = productService.findMostExpensiveProduct();
        System.out.println("Cel mai scump produs: " + mostExpensiveProduct);


        List<product> futureExpiringProducts = productService.getProductsExpiringInFuture();
        System.out.println("Produse cu dată de expirare în viitor: " + futureExpiringProducts);
    }
}
