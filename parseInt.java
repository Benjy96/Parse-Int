import java.util.Scanner;

/**
 * Basic process of how a string to int conversion works:
 * Take a string that holds a 'number', e.g. "5", stored as a string.
 * Cast it as an Integer, from a Character. This returns the ASCII table (decimal) value of the character 5.
 * The ASCII value of the character '5', is 53 in decimal. (35 in Hex, 065 in Oct, &#53 in Html.)
 * The number characters 0 -> 9 are represented by 48 -> 57 in decimal (ASCII table). 
 * Therefore we can subtract 48 to print the decimal value of the number.
 * e.g., Character(5) = 53 in ASCII Decimal. Subtract: 53 - 48 = 5
 * This number 5 is now able to be stored as an integer, and is the correct value.
 */
public class parseInt {
    public static void main(String[] args){
        //Take input (number to be converted) from user
        Scanner scan = new Scanner(System.in);
        //Assign Input to a string
        String toConvert = scan.nextLine();

        //Call method to parse string as an int
        convertToInt(toConvert);
    }

    private static void convertToInt(String s){
        //Store values of converted strings
        int num = 0;
        int[] storeNumbers = new int[10];

        for(int counter = 0; counter < s.length(); counter++) {
            //Cast to int
            //Returns decimal ASCII value of character
            num = (int)s.charAt(counter);

            //Numbers are represented from 48 to 57 in ASCII ( 0 -> 9 )
            //ASCII representation of 0 to 9 "starts" at 48, so subtract it
            if (num > 47 && num < 58) {
                //ASCII goes to 48 in decimal before it is zero
                num -= 48;
            }

            storeNumbers[counter] = num;
            System.out.print(storeNumbers[counter]);
        }//for
    }
}
