import java.util.Scanner;

public class checkPalindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inputan, reverse = "";
        int check;

        System.out.print("Inputkan kata atau angka : ");
        inputan = input.nextLine();
        check = inputan.length();

        for(int i = check - 1; i >= 0; i--){
            reverse = reverse + inputan.charAt(i);
        }
        if(inputan.equals(reverse)){
            System.out.println(inputan + " adalah Palindrome");
        }else{
            System.out.println(inputan + " bukan Palindrome");
        }
    }
}