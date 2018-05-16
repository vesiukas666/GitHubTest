import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius ir veiksma tarp ju pvz \"12 + 12\"");

        String line = scanner.nextLine();

        String[] items = line.split(" ");

        ThirdDayCalculator thirdDayCalculator = new ThirdDayCalculator();

        if(items.length == 3){
            switch (items[1]){
                case "+" :
                    double numb = getCorrectNumber(items[0], scanner, "Iveskite pirma skaiciu");
                    double numb2 = getCorrectNumber(items[2], scanner, "Iveskite antra skaiciu");
                 //    double sum =  thirdDayCalculator.sum(numb, numb2);
                    System.out.println("Suma" + thirdDayCalculator.sum(numb, numb2));
                    break;
                case "-"  :
                    //minuso metodas
                default:
                    System.out.println("Nera tokio veiksmo mergyt");
            }

            }else{
            System.out.println("Nepasiseke bandyk dar karta");
        }
    }

    private static double getCorrectNumber(String numb, Scanner scanner, String text) {
        double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            while(true){
                System.out.println(text);
                try{
                    result = scanner.nextDouble();
                    break;

                }catch(InputMismatchException ex){
                    System.out.println("Juk sakiau skaiciu");
                    scanner.nextLine();
                }
            }
        }
            return result;
        }
    }
