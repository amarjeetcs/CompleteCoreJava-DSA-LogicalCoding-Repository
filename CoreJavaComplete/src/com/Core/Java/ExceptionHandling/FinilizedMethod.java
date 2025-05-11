package com.Core.Java.ExceptionHandling;

public class FinilizedMethod {  
    public static void main(String[] args)   
   {   
       FinilizedMethod obj = new FinilizedMethod();   
       System.out.println(obj.hashCode());   
       obj = null;   
       // calling garbage collector    
       System.gc();   
       System.out.println("end of garbage collection");   
 
   }   
   @Override  
   protected void finalize()   
   {   
       System.out.println("finalize method called");   
   }   
   
   Optinal
}  