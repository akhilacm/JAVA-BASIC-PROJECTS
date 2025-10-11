public class App {
    public static void main(String[] args) throws Exception {
        
        Integer num = new Integer(12);
        Character val = new Character('F');
        char val1 = 'a';
        Character val2 = val1; // autoboxing primitive --> wrapper class
        char val3 = val2; // unboxing wrapper class --> primitive

        Methods obj1 = new Methods();
        obj1.display();

        Boxing obj2 = new Boxing();

        Excercise obj3 = new Excercise();
        obj3.setExamId("1234");
        obj3.setName("Akhila Murali");
        obj3.setStudentId("12345");
        obj3.setExamId("34");
        System.out.println(obj3.generateExamId());




    }
}
