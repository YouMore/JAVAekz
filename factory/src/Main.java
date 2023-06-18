//=======Методичка по пракам=============
// Паттерн «Фабричный метод» – определяет интерфейс создания
//объектов, позволяя подклассам менять тип создаваемых объектов
//Порождающие паттерны проектирования отвечают за удобное
//безопасное создание объектов или групп объектов.

//===================Более подробное описание=====================
//Паттерн "Фабрика" (Factory) — это порождающий паттерн проектирования, который позволяет создавать объекты
// без явного указания их классов. Он определяет общий интерфейс для создания объектов в суперклассе,
// позволяя подклассам изменять тип создаваемых объектов.
//
//Ключевые участники паттерна:
//
//Абстрактная фабрика (Abstract Factory) — интерфейс или абстрактный класс,
// который определяет методы для создания объектов.

//Конкретная фабрика (Concrete Factory) — класс, который реализует интерфейс или наследует абстрактный класс фабрики
// и предоставляет конкретную реализацию методов.

//Продукт (Product) — объект, который фабрика создает.

//Клиент (Client) — класс, который использует объекты, созданные фабрикой.

// мы хотим создать классы "Dog" и "Cat", представляющие собаку и кошку соответственно.
// Мы можем использовать паттерн "Фабрика", чтобы создавать объекты "Dog" и "Cat" без явного указания их классов.
public class Main {
    public static void main(String[] args) {
        System.out.println("================= Factory pattern =================");
        Factory[] enemiesMakers = {new CatFactory(), new DogFactory()};
        for (Factory factory : enemiesMakers) {
            Animal animal = factory.animalFactory();
            animal.SaySomething();
        }
    }
}