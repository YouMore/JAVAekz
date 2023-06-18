// Конкретные стратегии
class BlackFridayDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.7; // Скидка 30% на Черную пятницу
    }
}