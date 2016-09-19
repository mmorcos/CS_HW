Scanner input= new Scanner(System.in);
            System.out.println("Please enter the numerical day of the week it is.");
            int days= input.nextInt();
            System.out.println("The day of the week is ");
            switch (days){
                case 0: System.out.println("Sunday"); break;
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednsday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
                default: System.out.println("Error: please enter a value from 0-6"); break;
            }
       




                //First all the employees and salaries must be expressed to java
            double employee1=111;
            double employee2=222;
            double employee3=333;
            double salary1=67.37 ;
            double salary2=9.52;
            double salary3=120.63;
            String employee="Employee ID";
            String salary="Salary per hour";
            //then we can use the printf option to organize a table with System.out
            System.out.printf(employee +"              "+ salary +"\n");
            System.out.printf("%12.1f              %15.1f \n", employee1,salary1);
            System.out.printf("%12.1f              %15.1f \n", employee2,salary2);
            System.out.printf("%12.1f              %15.1f \n", employee3,salary3);
            //the .1 after 10 limits the output to only 1 decimal place