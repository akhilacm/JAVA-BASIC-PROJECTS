public class StringMethodTest {

    public String sample = "Sample test";
    public String newSample ="New sample";

    public void stringOperations() {

        System.out.println("concatenates "+sample.concat(newSample));
        System.out.println("Length:   "+ sample.length());
        System.out.println("case sensitive check: "+sample.equals("sample test"));
        System.out.println("case insensitive check: "+ sample.equalsIgnoreCase("sample test"));
        System.out.println("replace all occurance of specifiled character with new character: "+ sample.replace("s", "e"));
        System.out.println("To uppercase: " + sample.toUpperCase());
        System.out.println("To lower case "+ sample.toLowerCase());
        System.out.println("Check string is empty : " + sample.isEmpty());
        System.out.println("Check whether the string starts with specified prefix 'Sam' "+ sample.startsWith("Sam"));
        System.out.println("Check whether the string starts with specified prefix 'sam' "+ sample.startsWith("sam"));
        System.out.println("Check whether the string ends with 'test' : "+ sample.endsWith("test"));
        System.out.println("Return substring from index 3 and 8 : " + sample.substring(0, 6));
        System.out.println("Character at index 4 : " + sample.charAt(4));
        System.out.println("Index of character 't' : " + sample.indexOf('t'));
        System.out.println("Index of character 't' after index 5 : " + sample.indexOf('t', 5));
        System.out.println("Last index of character 't' : " + sample.lastIndexOf('t'));
        System.out.println("Last index of character 't' before index 5 : " + sample.lastIndexOf('t', 5));
        System.out.println("Trim the string : " + "   Hello World   ".trim());
    }

   

    public String [] splitString(String str, String separator){
        return str.split(separator);
    }

    public void java11Methods(){
        System.out.println("\nJava 11 String methods examples:");
        String str = " Hello World ";
        System.out.println("Original String: '"+ str + "'");
        System.out.println("isBlank: means string is empty or contains only white space "+ str.isBlank()); // false
        String emptyStr = " ";
        System.out.println("isBlank: check a blank string '"+ emptyStr.isBlank() + "'"); // true
        System.out.println("strip:  means all leading and trailing whitespace is removed '"+ str.strip() + "'"); // "Hello World"
        System.out.println("stripLeading: means leading whitespace is removed '"+ str.stripLeading() + "'"); // "Hello World "
        System.out.println("stripTrailing: means trailing whitespace is removed '"+ str.stripTrailing() + "'"); // " Hello World"
        String multilineStr = "  Hello \n  World  \n ";
        System.out.println("lines:");
        multilineStr.lines().forEach(line -> System.out.println("'"+line+"'"));
    }

}
