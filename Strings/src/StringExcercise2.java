public class StringExcercise2 {

    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StringExcercise2 change(){
        // remove extra space and also replace empty value to 'N.A'
        StringExcercise2 s1 = new StringExcercise2();
        s1.setFirstName(getFirstName().trim());
        s1.setMiddleName(getMiddleName().isEmpty() ? "N.A" : getMiddleName().trim());
        s1.setLastName(getLastName().trim());
        return s1;
    }
    public StringBuilder generateInitials(){
        change();
        StringBuilder str = new StringBuilder();
        str.append(getFirstName().charAt(0));
        str.append(getMiddleName().charAt(0));
        str.append(getLastName().charAt(0));
        return  str;
    }
}
