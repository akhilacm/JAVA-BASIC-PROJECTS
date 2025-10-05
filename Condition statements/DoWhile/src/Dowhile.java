public class Dowhile {
    public static void main(String[] args) throws Exception {
       int pointer = 0;
       int value = 1;
       System.out.println(value);
       while (true) {
        ++pointer;
        if(pointer % 2 == 0) {
            continue;
        }
        else if(value % 5 ==0) {
            break;
        }
        value *= 3;
        System.out.println(value);
       }
    }
}
