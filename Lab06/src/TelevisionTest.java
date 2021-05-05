/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2004-13 LearningPatterns Inc.
 */

/*
 * Lab - Arrays
 *
 * This class is the main class, i.e., where the application starts.
 *
 * It creates a Television array to hold Television objects.
 * It takes brand arguments from the command line and creates a Television
 * object for each one, adding them into the array.
 * It then iterates over the array, printing each Television object's data.
 */

class TelevisionTest
{
   public static void main(String[] args)
   {
      if (args.length == 0)
      {
         System.out.println("Usage: java TelevisionTest <brand1> <brand2> ...");
         System.exit(-1);  //  exit
      }
      
      // create an array to hold args.length Television objects
      Television[] tvArray = new Television[args.length/2];
      
      // for each command line argument, create a Television object
      // and add it to the array
      int i = 0;
      
      String brand = "";
      int vol =0;
      int total =0;
      
      total = args.length / 2;
      for (String curArg : args)
      {
    	 //System.out.println("counter :" + i + "... "+ args.length % 2);
         // each Television has a brand from the command line and a volume of 10  	 
         //tvArray[i++] = new Television(curArg, 10);
    	  ;
    	
    	 
      }
      int ii = 0;
      for (int count =0; count <= args.length-1; count++)
      {
    	 //System.out.println(args[count]);
    	 if(count%2 ==0) 	 
    	 {
    		 //System.out.println(count);
    		 brand = args[count];
    		 vol = Integer.parseInt(args[count+1]);
    		 tvArray[ii++] = new Television(brand, vol);
    	 }
    	 else
    		 continue;
    	 	
    	 
      }
      
      // iterate over the array and print each Television object's data
      for (Television curTV : tvArray)
      {
         System.out.println(curTV);
      }
   }
}
