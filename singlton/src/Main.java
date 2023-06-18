//Реализовать паттерн Singleton
//=======Методичка по практикам==================
//Синглтон – порождающий паттерн проектирования. Он позволяет
//гарантировать, что будет существовать ровно один объект существующего
//класса.
//==================Более подробное описание=========================
//Паттерн "Синглтон" (Singleton) — это порождающий паттерн проектирования, который гарантирует,
// что у класса будет только один экземпляр, и предоставляет глобальную точку доступа к этому экземпляру.
// Это позволяет контролировать создание объектов и обеспечивает удобный способ доступа к этим объектам
// из любой части приложения.

public class Main {
    public static void main(String[] args) {
        First s1 = First.instance;
        First s2 = First.instance;

        System.out.println(s1);
        System.out.println(s2);

        Second s3 = Second.INSTANCE;
        Second s4 = Second.INSTANCE;
        System.out.println(s3);
        System.out.println(s4);

        Third s5 = Third.getInstance();
        Third s6 = Third.getInstance();

        System.out.println(s5);
        System.out.println(s6);
    }
}