package SecondNum1;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String authName;
        String authEmail;
        String authGend;//Helps to input smth to char
        char authGender;
        Author Me = new Author("David","david228@somemail.vad",'m');
        System.out.println("Author name is " + Me.getName()+", email is "+Me.getEmail()+", gender is "+Me.getGender());
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your name, email and gender\n");
        authName = sc.next();
        authEmail = sc.next();
        authGend = sc.next();
        //Convert string authGender to char
        authGender = authGend.charAt(0);
        Me.setName(authName);
        Me.setEmail(authEmail);
        Me.setGender(authGender);
        System.out.println("Author name is " + Me.getName()+", email is "+Me.getEmail()+", gender is "+Me.getGender());
    }
}
