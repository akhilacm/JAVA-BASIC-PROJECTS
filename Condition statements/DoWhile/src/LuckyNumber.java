public class LuckyNumber {
    public static void main(String[] args) {
       
        int num = 1526;

        String luckyString = Integer.toString(num);
        int sum =0;
        for(int i =1 ; i < luckyString.length(); i+= 2)
        {

            sum= sum+(Character.getNumericValue(luckyString.charAt(i))*Character.getNumericValue(luckyString.charAt(i)));
        }
        if(sum%9 ==0){
            
            System.out.println("You are Lucky");
        }

        else{
            System.out.println("Better luck next time");
        }

}}
