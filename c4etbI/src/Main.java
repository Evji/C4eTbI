import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("выберите пункт");
            System.out.println("1.сложение");
            System.out.println("2.вычитание");
            System.out.println("3.умножение");
            System.out.println("4.деление");
            System.out.println("5.выйти");
            int person = scanner.nextInt();
            int result;
            if (person == 5){
                break;
        }else if (person == 1){
                System.out.println( "введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("введите второе число : ");
                int b = scanner.nextInt();
                System.out.println(" a : " + a);
                System.out.println(" b : " + b);
                result = a + b;
                System.out.println(" Ответ : " + result);

            }
            else if (person == 2){
                System.out.println( "введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("введите второе число : ");
                int b = scanner.nextInt();
                System.out.println(" a : " + a);
                System.out.println(" b : " + b);
                result = a - b;
                System.out.println(" Ответ : " + result);

            }
            else if (person == 3){
                System.out.println( "введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("введите второе число : ");
                int b = scanner.nextInt();
                System.out.println(" a : " + a);
                System.out.println(" b : " + b);
                result = a * b;
                System.out.println(" Ответ : " + result);

            }
            else if (person == 4){
                System.out.println( "введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("введите второе число : ");
                int b = scanner.nextInt();
                if (b == 0){
                    System.out.println(" на ноль делить нельзя");
                }
                System.out.println(" a : " + a);
                System.out.println(" b : " + b);
                result = a / b;
                System.out.println(" Ответ : " + result);

            }
        }

        }



      }

