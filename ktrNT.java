import java.util.Scanner;

public class ktrNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int number ;
        do{
            number = scanner.nextInt();
        }while (number<2);
        int check = 1;
        for(int i = 2; i< number ; i++)
        {
            if(number%i==0)
            {
                System.out.println("Khong Phai La So Nguyen To");
                check = 0;
                break;
            }
        }
        if (check == 1)
        {
            System.out.println("La So NT");

        }
    }
}
