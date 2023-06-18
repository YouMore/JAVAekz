// Конкретные стратегии
class ChristmasDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.8; // Скидка 20% на Рождество
    }
}