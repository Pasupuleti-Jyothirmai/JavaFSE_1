public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        String searchItem = "Shoes";

        Product result = SearchService.linearSearch(products, searchItem);

        if (result != null) {
            System.out.println("Product Found:");
            result.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}