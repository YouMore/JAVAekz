import java.util.Arrays;
import java.util.List;
//==============Методичка по пракам==========
//Паттерн «Стратегия» позволяет определить семейство различных
//алгоритмов, которые можно заменять

//Определяет некоторый алгоритм и позволяет его отдельные шаги
//делегировать подклассам
//
// Поведенческие паттерны проектирования позволяют расширять
//поведение системы и взаимодействие различных объектов между собой.

//================Более подробное описание==================
//Паттерн "Стратегия" (Strategy) — это поведенческий паттерн проектирования,
// который определяет семейство алгоритмов, инкапсулирует каждый из них и делает их взаимозаменяемыми.
// Паттерн позволяет изменять алгоритмы независимо от клиентов, которые ими пользуются.
//
//Ключевые участники паттерна:
//
//Контекст (Context) — класс, который использует стратегии. у нас ShopingCart

//Абстрактная стратегия (Strategy) — интерфейс или абстрактный класс, который определяет методы,
// общие для всех конкретных стратегий. у нас DiscountStrategy

//Конкретные стратегии (Concrete Strategies) — классы, реализующие интерфейс или
// наследующие абстрактный класс стратегии. У нас BlackFridayDiscountStrategy ChristmasDiscountStrategy
// NoDiscountStrategy
//
//
//
//у нас есть класс "ShoppingCart" (корзина покупок),
// который содержит список товаров и метод "calculateTotal()",
// который должен рассчитать общую стоимость товаров в корзине.
// Различные клиенты нашего магазина могут иметь различные скидки,
// поэтому нам нужно иметь возможность изменять алгоритм расчета общей стоимости
// в зависимости от выбранной скидки.

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Product 1", 10.0),
                new Product("Product 2", 20.0),
                new Product("Product 3", 30.0)
        );

        ShoppingCart cart = new ShoppingCart(products, new NoDiscountStrategy());
        double total = cart.calculateTotal(); // total = 60.0
        System.out.println("NoDiscount " + total);
        cart.setDiscountStrategy(new ChristmasDiscountStrategy());
        total = cart.calculateTotal(); // total = 48.0 (с учетом 20% скидки на Рождество)
        System.out.println("CrDiscount " + total);
        cart.setDiscountStrategy(new BlackFridayDiscountStrategy());
        total = cart.calculateTotal(); // total = 42.0 (с учетом 30% скидки на Черную пятницу)
        System.out.println("BFDiscount " + total);
    }
}