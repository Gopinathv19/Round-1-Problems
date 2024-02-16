public class reversing
{
public static void reverse(char[] CharArray)
{
   int i=0;
   int j=CharArray.length-1;
   while(i<j) 
   {
    if(!Character.isAlphabetic(CharArray[i]))
    {i++;
    }
    

    else if (!Character.isAlphabetic(CharArray[j]))
    {
           j--;
    }
    else
    {
        char temp=CharArray[i];
        CharArray[i]=CharArray[j];
        CharArray[j]=temp;
        i++;
        j--;
    }
   }
  }
   
public static void main(String[] args) {
    String str="Go45@  %fol ***gopi 4abd   ";
    char[] CharArray=str.toCharArray();
    System.out.println("Input String    "+str);
    reverse(CharArray);
    String reversed=new String(CharArray);
    System.out.println("Output String   "+reversed);
}
} 