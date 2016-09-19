Scanner input=new Scanner(System.in);
                Boolean answer = true;
             while (answer){
                System.out.println("Enter a command.");
                String command1=input.next();
                System.out.println("Your command is: " w+ command1);
                System.out.println("Do you want to continue?");
                String answer2=input.next();
            if (answer2.equals("n")){
            System.out.println("The program will now be terminated, thank you");
            answer=false;
            }




            


Scanner input=new Scanner(System.in);
            System.out.println("Enter a variable for x, y, and z.");
            double x=input.nextDouble();
            double y=input.nextDouble();
                if (y<0){
                        System.out.println(“Error: please enter a number greater than 0”);
                        }
                else{
}
double z=input.nextDouble();
            double answer= Math.sin(4*x) + Math.log10(y)+ Math.pow(z, 5);
            System.out.println("The answer to the formula sin(4x) + log base 10"
                    + " y +z^= " + answer);