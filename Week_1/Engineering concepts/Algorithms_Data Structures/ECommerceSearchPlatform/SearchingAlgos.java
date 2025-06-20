import java.util.*;

class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product Details = {Id=" + productId + ", Name='" + productName + '\'' + ", Category='" + category + '\'' + '}';
    }
}

public class SearchingAlgos {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == targetId) {
                return products[mid];
            } else if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Product[] products = {
            new Product(1, "Pen", "Stationery"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Camera", "Electronics"),
            new Product(4, "Table", "Furniture"),
    };

    while (true) {
        System.out.println("\nChoose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Exit the Program");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        if (choice == 3) {
            System.out.println("Exiting...");
            scan.close();
            System.exit(0);
        }

        System.out.print("Enter the product ID to search: ");
        int targetId = scan.nextInt();
        Product foundProduct = null;

        switch (choice) {
            case 1:
                foundProduct = linearSearch(products, targetId);
                System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
                break;
            case 2:
                Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
                foundProduct = binarySearch(products, targetId);
                System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2 or 3.");
        }
    }
}
}