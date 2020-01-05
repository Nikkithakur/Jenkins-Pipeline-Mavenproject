package com.code.Jenkinspipeline;


public class App 
{

	static int operations (int a , int b)
	{
		return a*b;
	}
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(App.operations(5, 6));
    }
}
