import java.util.List;

// Контекст
class ShoppingCart {
    private List<Product> products;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(List<Product> products, DiscountStrategy discountStrategy) {
        this.products = products;
        this.discountStrategy = discountStrategy;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        double totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
        return discountStrategy.applyDiscount(totalPrice);
    }
}