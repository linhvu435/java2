public class nguyento20 {
    public static void main(String[] args) {
        int count = 1;
        int check = 1;
        int i = 2;
        while (count <= 20) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = 0;
                }
            }
            if (check == 1) {
                System.out.println(i);
                count++;
            }
            i++;
            check = 1;


        }
    }
}


