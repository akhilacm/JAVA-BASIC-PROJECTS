import java.util.Arrays;

public class StringExcersise1 {
    // Infymegamart is automating the process of bill calculation. They have categoried their customers into two categories .
    // Regular and Privillege. if regular customer 10% discount is applicable. For privillege customer 20% discount is applicable.

    // methood description :
    // getName(): This method will return the name of the customer.
    // getDiscount() : This method will returns the discount percentage.
    // findDiscountAndName(String inputString): the user input is taken in a string variable in this pattern 
    // "CustomerType:CustomerName". The given input may contain unnessary spaces before and after the input .

    // sample
    // input - "Regular:Jack"
    //Output - "Hi Jack! 10% discount is applicable for you."

    // sample 2
    // input ="Privilaged:Mary"
    // output - "Hi mary! 20% discount is applicable for you"

    private String customerName;
    private int applicableDiscount;

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public void setApplicableDiscount(int discount){
        this.applicableDiscount = discount;
    }

    public String getCustomerName(){
        return customerName;
    }

    public int getApplicbleDiscount(){
        return applicableDiscount;
    }

    public void findDiscountAndName(String inpString){
        String[] strgArr = inpString.split(":");
        setCustomerName(strgArr[1]);
        if (strgArr[0].startsWith("Regular")){
            setApplicableDiscount(10);
        }
        else if(strgArr[0].startsWith("Privilage")){
            setApplicableDiscount(20);
        }
        System.out.println("Hi "+getCustomerName()+ '!'+ " "+ getApplicbleDiscount()+" discount is applicable for you");
    }
}
