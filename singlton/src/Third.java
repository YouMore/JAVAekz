//Из методички
//через метод getInstance() с ленивой инициализацией:
//В этой реализации создается приватный конструктор,
// чтобы предотвратить создание экземпляров класса извне.
//`instance` - это переменная экземпляра класса в Java, которая ссылается на объект класса,
// созданный с использованием конструктора
// Поле "instance" является статическим и приватным, чтобы не допустить создание нескольких экземпляров класса.
// Метод "getInstance()" возвращает единственный экземпляр класса и использует ленивую инициализацию,
// чтобы создать экземпляр класса только при первом вызове метода.
public class Third {
    private static Third instance;

    private Third() {}

    public static synchronized Third getInstance() {
        if (instance == null) {
            instance = new Third();
        }
        return instance;
    }
}