package test;
import java.util.*;

class functions{
public String []  Splt(String str ){
    int arraySize=0,j=0;
    for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '){arraySize++;}           // coutns the number of splits required with space as the split criteria
        }
    
    //System.out.println(arraySize);
    String [] splt_array=new String[arraySize+1];           // Dynamically seting the size of the array to the number of splits
    Arrays.fill(splt_array,"");                           // seting all elements to someElement instead of null;
    
   for (int i=0;i<str.length();i++)                       // Here it Splits the String;
        {
            if(str.charAt(i)!=' ')
            {
                splt_array[j]=splt_array[j]+str.charAt(i);
            }
            
            else
            {
                j++;
            }
        }
    /*for (int i=0;i<arraySize;i++)                       //Verify whether it is spliting all the elements of the string
        {
               System.out.println(splt_array[4]);
        }
    */
    return splt_array;
        
}
}


public class Test {
    
    static int  Do_Everything(){
        //Scanner scan= new Scanner(System.in);
        //System.out.println("enter a String");
        //String str=scan.nextLine();
        int arraySize=0;
        char new_FirstCharater,new_LastCharater;
      String str="this is a Book which contains all secrets";
        
        functions a =new functions();
        String [] split_string = a.Splt(str);  // this will call the defined fucntion above and split the string according to spaces
       
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '){arraySize++;}           // coutns the number of splits required with space as the split criteria
        }
       
                int first_characer=split_string[0].charAt(0);  // finds the ascii value of the First character of the String and converts it to smaller letter.
                    if(first_characer<97)
                        {
                             first_characer=first_characer+32;
                         }
                             new_FirstCharater=(char)first_characer;
             
                             String temp="";
                            for (int i=0;i<split_string[0].length();i++)
                                {
                                         if(i==0){temp=temp+new_FirstCharater;}
                                         else
                                         {
                                            temp=temp+split_string[0].charAt(i);
                                         }
                                    
                                }split_string[0]=temp;
                                
   
                int last_characer=split_string[arraySize].charAt(0);  // finds the ascii value of the First character of the String and converts it to smaller letter.
                    if(last_characer>97)
                        {
                             last_characer=last_characer-32;
                         }
                             new_LastCharater=(char)last_characer;
                             
                             
                             temp="";
                            for (int i=0;i<split_string[arraySize].length();i++)
                                {
                                         if(i==0){temp=temp+new_LastCharater;}
                                         else
                                         {
                                            temp=temp+split_string[arraySize].charAt(i);
                                         }
                                    
                                }split_string[arraySize]=temp;
                                
                                
                   String Output="";
                   
                   for (int i=arraySize;i!=-1;i--)
                                {
                                    Output=Output+split_string[i]+" ";
                                    
                                }
                   
                   System.out.println("Input=  "+str);
                   System.out.println("Output=  "+Output);
                   System.out.println("\n");
                   
                   System.out.println("This Program will work for any sentence how ever long");
                   System.out.println("\n");
                   
                return 0;
    }
    
    
    
    public static void main(String[] args) {
        
                
        Do_Everything();
        
    }
    
}
