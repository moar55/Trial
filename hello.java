# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*

import java.util.*;
public class hello {
  public static void main(String [] args)
    {
      Scanner sc=new(System.in);
      
       System.out.print("Please enter your gender : " );
      String gender= sc.nextLine();
      String a = (gender.equlas("male"))?
      System.out.print("Please enter your age : " );
      int age= sc.nextInt();
      String output="";
      
      if(gender.equals("male"))
      {
        if(age>=18)
          output="sir";
        else 
          output="boy"
      }
      
      else if(gender.equals("female"))
      {
        if(age>=18)
          output="Maam";
        else 
          output="girl"
      }
      
      System.out.println("Hello + " " + output);
      }
      }
     
      
