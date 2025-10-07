public class TextBlocksExample {

    /**
     * Text blocks in Java (introduced in Java 15) provide a way to declare multi-line string literals
     * using triple quotes ("""). They help improve code readability and reduce the need for escape sequences.
     *
     * Syntax:
     * String textBlock = """
     *     This is a text block.
     *     It can span multiple lines.
     *     "Quotes" and special characters are easier to include.
     *     """;
     */

     //using regular string 
     String myText = "Akhila\nAthin\nNiharika\n";

     // using text blocks
     String myText1 = """
        Akhila
        Athin
        Niharika
        """;

        // using text blocks
     String myText2 = """
            Akhila
                Athin
            Niharika
        """;
        String myText3 = """
               Akhila
            Athin
             Niharika
        """;

        public void display(){
            System.out.println(myText);
            System.out.println(myText1);
            System.out.println(myText2);
            System.out.println(myText3);
        }
}
