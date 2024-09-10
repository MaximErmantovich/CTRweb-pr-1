
public class Main {

    public static void main(String[] args){
        Product product1 = new Product();
        Product product2 = new Product("Banana",123);
        WriterInfo.printAllInfo(product1);
        WriterInfo.printAllInfo(product2);
    }

}
