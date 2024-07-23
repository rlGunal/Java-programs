package String;

public class stringcount {
    public static void main(String[] args) {
        String str="hELlo woRLd proGramMing";
        int count=0;
        String s="";
        for (char i:str.toCharArray())
        {
            count++;
        }
        System.out.println(str+" The count is: "+count);
       
    }
    
}
