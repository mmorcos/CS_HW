//Lab 5, Debugging
            String s;
 s="Hello Java";
 char c = s.charAt(9);
 System.out.println(c);
        // runtime error found, quotes put around the string
        // runtime errof round, character 15 exceeded amount of characters in
        //"hello java", replaced with character 9
            // program will pick out a character in the program
            // character is the final letter "a" in the word "java"
 
 
 
 
            //Homework 5, Debugging
            final double PI = 3.14;
            double r = 2.5;
            double h= 3.6;
            double volume = ((1.0/3.0)*PI*(r*r)*h);
  System.out.println("The volume is " + volume);
            // logic error found, parenthesis around the formula
            // logic error found, double requires .0 at the end of 1 and 3
        //so instead of 1/3- should be 1.0/3.0