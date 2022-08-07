import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double price = scanner.nextDouble();
        double result = returnIVA(price);
        System.out.println("PRECIO PRODUCTO + IVA: " + result);
    }

    public static double returnIVA(double price){
        return price += price*0.18;
    }
}
