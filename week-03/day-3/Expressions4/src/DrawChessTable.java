public class DrawChessTable {
    public static void main(String[] args) {
        String color1 = "%";
        String color2 = " ";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    System.out.print(color1 + color2);
                } else {
                    System.out.print(color2 + color1);
                }
            }
            System.out.println();
        }
    }
}
