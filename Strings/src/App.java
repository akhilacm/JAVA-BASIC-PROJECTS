import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        StringMethodTest s1 = new StringMethodTest();
        s1.stringOperations();
        
        String sample1 = "apple/banana/mango/grapes";
        String separator = "/";
        System.out.println(Arrays.toString(s1.splitString(sample1, separator)));
        s1.java11Methods();

        ImmutableExample o2 = new ImmutableExample();
        o2.display();

        CompareToExample o3 = new CompareToExample();
        o3.operations();

        StringBuilderExample o4 = new StringBuilderExample();
        o4.display();

        TextBlocksExample o5 = new TextBlocksExample();
        o5.display();

        Quiz q1 = new Quiz();
        q1.quiz1();
        q1.quiz2();
        q1.quiz3();

        StringExcersise1 e1 = new StringExcersise1();
        e1.findDiscountAndName("Regular:Jack");
        e1.findDiscountAndName("Privilage:Mary");

        StringExcercise2 e2 = new StringExcercise2();
        e2.setFirstName("Akhila");
        e2.setMiddleName("");
        e2.setLastName("Murali");

        StringExcercise2 e3 = e2.change();  
        System.out.println(e3.generateInitials());
    }
}
