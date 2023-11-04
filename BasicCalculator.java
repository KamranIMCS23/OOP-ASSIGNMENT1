import java.util.Scanner;

    class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Basic Number Calculator");

        // Instructions
        System.out.println("You can start calculate the number like this (Num1 -> Space -> + Num2 and Your Ans is Here )");

        System.out.print("Please Start Calculation Here  - ");

        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        solve(num1, num2, op);

    }
    public static int solve(int num1, int num2, char op)
    {
        int ans = 0;
                                            // addition
        if (op == '+') {
            ans = num1 + num2;
        }
                                        // subtraction
        else if (op == '-') {
            ans = num1 - num2;
        }

                                     // multiplication
        else if (op == '*') {
            ans = num1 * num2;
        }

                                   // Division
        else if (op == '/') {
            ans = num1 / num2;
        }
                                //DisplayError
        else {
            System.out.println("invalid input");
        }
        // Result
        System.out.println("Your answer is - " + ans );
        System.out.println("Thank you for using this Program GoodBye!");
        return ans;
    }
}
//This program is made by Kamran - 2K23/MSCS/23
//I use comment for better understanding and I just try to apply clean code rule.