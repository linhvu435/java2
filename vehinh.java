public class vehinh {
    public static void main(String[] args) {
        for( int i = 1; i<=3;i++)
        {
            for(int j = 1; j<=7;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        tamgiac();
        System.out.println();
        tamgiac1();
        System.out.println();
        tamgiaccan();
    }

    public static void tamgiac() {
        for (int i = 1;i<=5;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tamgiac1()
    {
        for (int i = 5;0<=i;i--)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tamgiaccan()
    {   int h = 7;
        for (int i = 0 ;i<h;i++)
        {
            for(int j =1;j<=h*2-1;j++)
            {
               if(h-i <= j && j <= h+i)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }

}

