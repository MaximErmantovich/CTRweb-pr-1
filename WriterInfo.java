public class WriterInfo {
    public static void printAllInfo(Product obj){
        System.out.println("Product: "+obj.getName());
        System.out.println("Availability: "+obj.getAvailability());
        System.out.println("Price: "+obj.getPrice()+"\n");
    }
}
