// ===================Методичка по пракам====================
// Паттерн «Декоратор» позволяет добавлять новую функциональность
// объекту, является некоторой оберткой над классом (рисунок 10). Не управляет
// жизненным циклом объекта
//
// ======================Более поробное описание========================
// Паттерн декоратор (Decorator) относится к классу структурных паттернов проектирования.
// Его цель - добавить новые функции в объект, не изменяя его интерфейс.
// Декоратор оборачивает объект в другой объект, который добавляет новые функции,
// делегируя вызовы оригинальному объекту.
//
// Отличие паттерна декоратор от паттерна адаптер заключается в том,
// что декоратор используется для добавления новых функций внутри объекта без изменения его интерфейса,
// тогда как адаптер используется для изменения интерфейса класса, чтобы сделать его совместимым с клиентским кодом.

//В данном примере интерфейс Component представляет собой базовый интерфейс для объектов,
// которые могут быть декорированы. Класс ConcreteComponent реализует этот интерфейс и представляет собой объект,
// который может быть декорирован.
//
//Абстрактный класс Decorator также реализует интерфейс Component, но делегирует вызовы оригинальному объекту.
// Классы ConcreteDecoratorA и ConcreteDecoratorB расширяют класс Decorator и добавляют новые функции в объект.
//
//В классе Main создается объект ConcreteComponent, который затем декорируется объектом ConcreteDecoratorA и
// затем объектом ConcreteDecoratorB. При вызове метода doOperation() на
// объекте ConcreteComponent будут выполнены все операции, добавленные в декораторах.

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
        component.doOperation();
    }
}