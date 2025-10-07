public class StringBuilderExample {

    StringBuilder str1 = new StringBuilder("Java");
    StringBuilder str2 = new StringBuilder();

    public void display(){
         str2.append("Angular");
         Integer length = str1.length();
         
         System.out.println(length);
         System.out.println(str2.insert(0, "I love "));
         System.out.println(str1.append(11.0));
         System.out.println(str1.append(" is powerful language "));
         System.out.println("capacity of object "+ str1.capacity());
         System.out.println("Insert EE specific position"+ str1.insert(9, "EE"));
         // create substring from startindex till end index

         System.out.println(str1.substring(14));
         // Get substring of last 9 characters
         System.out.println(str1.substring(str1.length() - 9));
         System.out.println("Convert to stringbuilder object using toString() method: "+ str1.toString());
         System.out.println("Delete characters 11.0  which exclude last end index "+ str1.delete(4,8));


         
    }
   

    
}
