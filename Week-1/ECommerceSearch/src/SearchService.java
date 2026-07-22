public class SearchService {

    public static Product linearSearch(Product[] products, String name) {

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}