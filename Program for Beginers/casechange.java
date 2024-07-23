public class casechange {
    public static void main(String[] args) {
        String str="hELlo woRLd proGramMing";
        int count=0;
         for (char i:str.toCharArray())
        {
            count++;
        }
        for(int i=0;i<count;i++)
        {
             char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                System.out.print((char)(str.charAt(i)+32));
            }
           
            else{
            System.out.print((char)(str.charAt(i)-32));
             }
         }
        System.out.println();
        System.out.println(str.replaceAll("\\s",""));    
        } 
    }
