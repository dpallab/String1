import java.util.Scanner;
public class StringPalindrome
{
    public static void main(String[] args)
    {
        String input, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:- ");
        input = in.nextLine();

        for (int i = input.length() - 1; i >= 0; i--)
        {
            reverse = reverse + input.charAt(i);
        }

        if (input.equalsIgnoreCase(reverse))
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
}