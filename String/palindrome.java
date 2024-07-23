package String;

public class palindrome {
    public static void main(String[] args) {
        String str="MADAM MADAM";
        int count=0;
        String s="";
        for (char i:str.toCharArray())
        {
            count++;
        }
          //System.out.println("The count is: "+count);
        for(int i=count-1;i>=0;i--)
          {
            s=s+str.charAt(i);
          }  
            if(str.equals(s)){
                System.out.println(str+" is a palindrome.");
            }
            else{
                System.out.println(str+" is not a palindrome.");
            }    
    }
    
}
