public class DoWhileTest {
   
    public static void main(String[] args) {
         int num1 = 0;
    int num2 = 9;
     do {
        num1++;
        if(num2-- < num1++){
            break;
        }
     } while (num1 < 5);
        System.out.println(num1 + " " + num2);
}
}
