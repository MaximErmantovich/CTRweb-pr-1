//А) Создать объект класса согласно заданию. Инициализацию значений полей осуществить с помощью конструктора.
// В классе предусмотреть 2-3 метода, осуществляющие вывод на экран монитора соответствующую информацию о классе.
//Б) Задание А модифицировать: предусмотреть перегруженные конструкторы. Создать второй класс WriterInfo,
// выводящий на экран монитора соответствующую информацию о классе (используя уже созданные методы класса).
// Состав класса Product (продукт): название продукта, наличие в магазине, цена.
public class Product {
    private String name;
    private boolean availability;
    private double price;

    public String getName(){return name;}
    public void setName(String nown){name =nown; }
    public boolean getAvailability(){return availability;}
    public void setAvailability(boolean availabilit){availability = availabilit; }
    public double getPrice(){return price;}
    public void setPrice(double price){price =price; }

    public void printProduct() {
        System.out.println("Окружность с центром ("+name+";"+price+") и радиусом "+availability);
    }

    public Product(){
        name="Borshch";
        availability=true;
        price=100.22;
    }
    public Product(String nName,int nPrice)
    {
        setName(nName);
        availability=false;
        setPrice(nPrice);
    }
}
