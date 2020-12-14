import java.util.Scanner;

public class Employee {
    String name, address;
    int year;
    double salary;

    /* Robert 1994 64C- WallsStreet
       Sam 2000 68D- WallsStreet
       John 1999 26B- WallsStreet
    */

    Employee()
    {
        name = "Robert";
        year = 1994;
        salary = 50000.0;
        address = "64C- WallsStreet";
    }

    Employee(String n, int yr, double sal, String adr)
    {
        name = n;
        year = yr;
        salary = sal;
        address = adr;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nName: ");
        name = sc.nextLine();
        System.out.print("Year of joining: ");
        year = sc.nextInt();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        System.out.print("Address: ");
        address = sc.nextLine();
        address = sc.nextLine();
    }

    void display()
    {
        System.out.println("\nName: "+name);
        System.out.println("Year of joining: "+year);
        System.out.println("Salary: "+salary);
        System.out.println("Address: "+address);
    }

    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        /*Sam 2000 68D- WallsStreet
       John 1999 26B- WallsStreet*/

        emp[0] = new Employee();
        emp[1] = new Employee("Sam",2000,75000.0,"68D- WallsStreet");
        emp[2] = new Employee();

        System.out.println("\n-------Enter the details-------");
        emp[2].input();

        for (int i=0; i<3; i++)
        {
            System.out.print("\n-------EMPLOYEE "+(i+1)+"-------");
            emp[i].display();
        }
    }
}
