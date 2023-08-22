package com.DSA.Recursion;

public class NumberPrintWithRecursion {
    public static void main(String[] args) {
        print(1); //step.1-->calling print function and passing paramerter as int 
    }

    static void print(int n)   //step.2-->this print function receiving parameter 1 as int
    {
        if(n==5)  //step3(base condition)-->checing if received parameter 1==3 condition false then skip 
                  //the if block and jump to next
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);//step4--> after jump comming here print n means 1
        print(n+1); //step5(recursive call or tail recursion means last function call)--> incrementing n+1 means 1+1=2 and calling again print method above at
                    //step 2 and again condition check increment will be happen until n==5
    }
}
