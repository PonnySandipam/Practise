package javaBasicPrograms;

public class Replace    
{    
    public static void main(String[] args) {    
        String string = "Once in a blue moon";    
        char ch = '-';    
            
        //Replace space with specific character ch    
        string = string.replace(" ", ",");
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}      