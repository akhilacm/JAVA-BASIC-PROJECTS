public class Quiz {
    
    public void quiz1(){
        
        String name ="Oliver";
        name.concat("Lawrence");
        String department = "Digital";
        System.out.println(name+department);
        // because string is immutable name will not be modified 

    }

    public void quiz2(){
        StringBuilder s1 = new StringBuilder("Java is object oriented");
       // String result = s1; can not convert Stringbuilder to String
        String s2 = "hello";
        s1.append(s2);

        // StringBuilder s3 = s2; can not convert String to StringBuilder

        StringBuilder s3 = new StringBuilder(s2);
        System.out.println(s3);


    }

    public void quiz3(){
        String word1 = "Willow", word2= "ow";
        System.out.println(word1 == "Willow");
        System.out.println(word1 == ("Will"+"ow"));
        System.out.println(word1 == ("Will"+word2));
    
    }
}

