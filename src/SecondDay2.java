import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondDay2 {

    public static void main(String[] arga) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Pasirinkite kokios figuros plota skaiciuosite:");
        //  System.out.println("Staciojo trikampio kampa");
        //  System.out.println("Kvadrato plotas");
        //   System.out.println("Apskritimo plotas");

        //int selection = scanner.nextInt();

        //System.out.println("Jusu pasirinkimas" + selection);
        SecondDay2 secondDay = new SecondDay2();
        //  int selesctedMenuItem = getcorrectnumb(scanner);

        //   switch (selesctedMenuItem){
        //      case 1 :
        //          secondDay.triangle(scanner);
        //          break;
        //       case 2 :
        //           break;
        //       case 3 :
        //           break;
        //       case 4 :
        //          break;



        while(true)

    {
        System.out.println("Pasirinkite kokios figuros plota skaiciuosite:");
        System.out.println("Staciojo trikampio kampa");
        System.out.println("Kvadrato plotas");
        System.out.println("Apskritimo plotas");
        int selesctedMenuItem = (int) getcorrectnumb(scanner);
        switch (selesctedMenuItem) {
            case 1:
                secondDay.triangle(scanner);
                break;
            case 2:
                secondDay.square(scanner);
                break;
            case 3:
                secondDay.rectangle(scanner);
                break;
            case 4:
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Neradome veiksmo pakartokite");
                break;

        }

    }

}

    private void triangle(Scanner scanner){
        System.out.println("Iveskite a stattini");
        double a = getcorrectnumb(scanner);
        System.out.println("Iveskite b statini");
        double b =  getcorrectnumb(scanner);
        System.out.println("Trikampio plotas" + (a*b/2));
    }

    private void square(Scanner scanner){ System.out.println("Iveskite a stattini");
        double a = getcorrectnumb(scanner);
        System.out.println("Iveskite b statini");
        double b =  getcorrectnumb(scanner);
        System.out.println("Kvadrato plotas" + a*b);
        }
    private void rectangle(Scanner scanner) {
        System.out.println("Iveskite a stattini");
        double a = getcorrectnumb(scanner);
        System.out.println("Iveskite b statini");
        double b = getcorrectnumb(scanner);
        System.out.println("Staciakampio plotas" + a/2);
    }

    private static double getcorrectnumb(Scanner scanner){
        double result = 0;
        while(true) {
            try {
                result = scanner.nextDouble();
             //   if(result < 1 || result > 4){
             //   throw new InputMismatchException("Blogas diapzonas");
             //   }
                break;
            }
                catch (InputMismatchException e) {
                System.out.println("Blogas formatas");
                scanner.nextLine();

            }
        }
        return result;

    }
}
