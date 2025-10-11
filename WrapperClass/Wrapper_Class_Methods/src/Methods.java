public class Methods {

    String sum = "123"; // if sum = "abc12" give error

    public void display(){

       
        System.out.println("String to Integer : Integer.parseInt(sum) "+ Integer.parseInt(sum));
        System.out.println("tring to double : Double.parseDouble(sum) "+ Double.parseDouble(sum));
        System.out.println("Convert a wrapper type to another wrapper type intValue() longValue() byteValue()");
        Integer phoneNumber = 994671186;
        System.out.println("floatValue() "+phoneNumber.floatValue());
        System.out.println("byteValue() "+phoneNumber.byteValue());
        System.out.println("doubleValue() "+phoneNumber.doubleValue());
        System.out.println("longValue() "+phoneNumber.longValue());

        Character alpha = new Character('A');
        Character beta = new Character('5');
        System.out.println("Check if given character is digit 'Character.isDigit' 'A': " + Character.isDigit(alpha) );
        System.out.println("Check if given character is digit 'Character.isDigit' '5' " + Character.isDigit(beta) );

        System.out.println("Check given character is uppercase 'Character.isUpperCase()' "+ Character.isUpperCase(alpha));

        System.out.println("convert character to string 'Character.toString()'' " + Character.toString(alpha) );

        System.out.println("convert character to char primitive data type 'alpha.charValue()' "+ alpha.charValue());

        System.out.println("Convert to lowercase 'Charecter.toLowerCase() " + Character.toLowerCase(alpha));

        int result1 = Character.compare('A', 'b');
        System.out.println("Compare 'A' and 'b' "+ result1);

        Character gamma = new Character('b');
        System.out.println("Using comapareTo "+ alpha.compareTo(gamma));

        System.out.println(Character.compare(alpha, 'b'));
        
    }
    }