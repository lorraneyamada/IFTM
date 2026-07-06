import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();
        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matriz[i][j] = s.nextInt();
            }
        }

        for (int j = 0; j < n; j++)
        {
            System.out.print(matriz[m - 1][j]);
            if (j < n - 1)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}