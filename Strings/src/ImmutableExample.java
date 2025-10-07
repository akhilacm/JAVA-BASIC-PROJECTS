public class ImmutableExample {
    public String name = "Oliver";

    public void display(){
        System.out.println("reference of string " + name.hashCode());
        name.concat("Carter");
        System.out.println(name);
        System.out.println("refernce of modified string: "+ name.hashCode());

        //in the above example we have string "Oliver" referred by the variable name.
        // even after using concat, name("Oliver") is not changed, rather a new object is created "Oliver Carter",
        // having no reference.This is because String is immutable in Java. means which cannot be changed.

       String s = "Oliver";
       System.out.println("reference of string s: " + s.hashCode());
       String s1 = s.concat(" Carter");
        String s2 = "Oliver Carter";
       System.out.println(s1+ " reference of modified string s1: " + s1.hashCode());
       System.out.println(s2+ " reference of modified string s3: " + s2.hashCode());

}
}
