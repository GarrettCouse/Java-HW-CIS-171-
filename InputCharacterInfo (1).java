import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a character... ");

   if(myObj.hasNext())  {       
    if(myObj.isEmpty()){
        System.out.println("The character is");
        System.out.println("is not upper");
        System.out.println("is not lowercase");
        System.out.println("After toLowerCase(), aChar is");
        System.out.println("After toUpperCase(), aChar is");
        System.out.println("is neither a letter nor a digit");
        System.out.println("is whitespace");
    }}
        char myChar = myObj.next().charAt(0);
        System.out.println("The character is " + myChar);

        if(Character.isUpperCase(myChar)){
            System.out.println(myChar + " is uppercase");
            System.out.println(myChar + " is not lowercase");}
        else if(Character.isLowerCase(myChar)){
            System.out.println(myChar + " is not uppercase");
            System.out.println(myChar + " is lowercase");}
        else{
           System.out.println(myChar + " is not uppercase");
            System.out.println(myChar + " is not lowercase"); 
        }
        myChar = Character.toLowerCase(myChar);
        System.out.println("After toLowerCase(), aChar is " + myChar);

        myChar = Character.toUpperCase(myChar);
        System.out.println("After toUpperCase(), aChar is " + myChar);

        if(Character.isLetterOrDigit(myChar)){
        System.out.println(myChar + " Is a letter or digit");}
        else{
           System.out.println(myChar + " Is not a letter or digit");}
        
        if(Character.isWhitespace(myChar)){
        System.out.println(myChar + " Is whitespace");}
        else{
            System.out.println(myChar + " Is not whitespace");
        }
    }
}

