Scanner input=new Scanner(System.in);
            System.out.println("Judge 1 please submit your score");
            double score1=input.nextDouble();
            System.out.println("Judge 2 please submit your score");
            double score2=input.nextDouble();
            System.out.println("Judge 3 please submit your score");
            double score3=input.nextDouble();
            System.out.println("Judge 4 please submit your score");
            double score4=input.nextDouble();
            if (score1 >= 0 && score1 <= 10 && 
                score2 >= 0 && score2 <= 10 &&
                score3 >= 0 && score3 <= 10 &&
                score4 >= 0 && score4 <= 10 ){
            System.out.println("The final score of the contestant is " + (score1
                    + score2 + score3 + score4)/4);
            }
            else {
                System.out.println("Error: please enter a number greather than"
                        + " or equal to 0 and less than or egual to 10");
            }


 


 


 Scanner input=new Scanner(System.in);
            System.out.println("Enter the number of the month you are in. ");
            int month=input.nextInt();
           // if the month falls between june and august it will be summer
            // if on january it will be winter break
            //if between february and may it will be spring semmester
            //if between september and december it will be fall semmester
        
            if (month <= 5 && month >= 2 ){
            System.out.println("You are in the spring semmester.");
            }
              if (month <=12 && month >= 9)
                    System.out.print("You are in the fall semmester."); 
                
              else if (month >=6 && month <=8){ 
                        System.out.println("You are on sumemr break!");}
        
              else if (month==1){
    System.out.print("You are on winter break!");}