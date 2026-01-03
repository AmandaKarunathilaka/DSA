package sub3;

public class RabbitProblem {
	// Recursive Fibonacci
    public static int rabbits(int n) {
        if (n <= 1)
            return n;
        return rabbits(n - 1) + rabbits(n - 2);
    }
    
    public static void main(String[] args) {
        int months = 7;
        System.out.println("Rabbit population by month:");
        for (int i = 0; i < months; i++) {
            System.out.print(rabbits(i) + " ");
        }
    }
}
