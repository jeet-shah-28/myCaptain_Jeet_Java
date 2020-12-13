import java.util.Scanner;

public class T4_matrix {
    double matrix[][];
    int m,n;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("\nEnter the no. of rows : ");
        m = sc.nextInt();
        System.out.print("\nEnter the no. of columns : ");
        n = sc.nextInt();
        matrix = new double[m][n];
        System.out.println("\nEnter the values in the Matrix : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextDouble();
            }
        }
    }

    T4_matrix add(T4_matrix b) {
        T4_matrix c = new T4_matrix();
        c.m = b.m;
        c.n = b.n;
        c.matrix = new double[c.m][c.n];
        int i, j;

        if (this.m != b.m || this.n != b.n) {
            System.out.print("\nAddition not possible. The rows and columns of both the matrices should be equal.");
        }
        else {
            for (i = 0; i < m; i++) //rows
            {
                for (j = 0; j < n; j++) //columns
                {
                    (c).matrix[i][j] = matrix[i][j] + (b).matrix[i][j];
                }
            }

        }

        return c;
    }

    void display()
    {
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        T4_matrix a = new T4_matrix();
        T4_matrix b = new T4_matrix();

        System.out.println("\n=========MATRIX 1=========");
        a.input();
        System.out.println("\n=========MATRIX 2=========");
        b.input();

        if (a.m == b.m && a.n == b.n)
        {
            T4_matrix c = new T4_matrix();
            c = a.add(b);
            System.out.println("\n=========MATRIX 1 + MATRIX 2=========");
            c.display();
        }
        else
        {
            System.out.println("\nNo. of rows or columns of MATRIX 1 is not equal to that of MATRIX 2");
            System.out.println("Addition NOT POSSIBLE :(");
        }
    }
}
