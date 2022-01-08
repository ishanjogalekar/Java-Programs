public class down_star_right_angle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = in.nextInt();
        for (int i = 1;i<=row;i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
