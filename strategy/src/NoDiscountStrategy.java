// Конкретные стратегии
class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}
