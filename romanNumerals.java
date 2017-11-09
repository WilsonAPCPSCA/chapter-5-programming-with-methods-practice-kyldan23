import java.util.Scanner;
public class romanNumerals{
    /**
     * returns the roman numeral(s) that pertain to the number at the place value
     * @param number value at that place 
     * @param roman numeral representing 1 or 10 
     * @param roman numeral representing 5 or 50
     * @param roman numeral representing 10 or 100
     */
    public static String romanDigit(int n, String one, String five, String ten){
        int number=n;
        String finalNumerals=""; //NEVER USE NULL AGAIN IT'S GARBAGE
        if(number<=3){
            for(int i=0;i<number;i++){
                finalNumerals+=one;
            }
            return finalNumerals;
        }
        else if(number==4){
            return one+five;
        }
        else if(number==5){
            return five;
        }
        else if(number>5 && number<9){
            number-=5;
            finalNumerals=five;
            for(int i=0; i<number;i++){
                finalNumerals+=one;
            }
            return finalNumerals;
        }
        else if(number==9){
            return one+ten;
        }
        else{
            return ten;
        }
    }
    public static void main(String []args){
        String romanOnes=null;
        String romanTen=null;
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a number from 1-100 to be converted to Roman numerals.");
        int n=in.nextInt();
        romanOnes=romanDigit(n%10, "I" , "V", "X");
        n=n/10;
        romanTen=romanDigit(n,"X","L","C");
        System.out.print(romanTen+romanOnes);
    }
}
        