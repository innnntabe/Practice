package lesson5;

public class Kuku2 {
	public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("\t%2d ", i * j);
            }
            System.out.println();
        }
    }
}
