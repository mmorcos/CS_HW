Scanner input=new Scanner(System.in);
            System.out.println("How many students are there?");
            int number_of_students=input.nextInt();
            String names="";
            int i;
            int x=0;
            int maximum=0;
 for (i=0; i<number_of_students; i++)
 {
                System.out.println("Enter the students name.");
                names = input.next();
                System.out.println("Enter the students grade.");
                int grades=input.nextInt();
                if (maximum < grades)
                    maximum=grades;
            }
                System.out.println("The student with the highest grade is " +
                        names + " and his/or her grade is "+ maximum);
            // TODO code application logic here
        }
}
 
 
 
  Scanner input=new Scanner(System.in);
            System.out.println("Enter the initial deposit amount: ");
            float deposit=input.nextFloat();
            System.out.println("Enter anual percentage yield: ");
            float percentage=input.nextFloat();
            System.out.println("Enter number of months: ");
            double months=input.nextDouble();
            float value=0;
            int i=0, j=0;
            System.out.printf("Month         Value\n");
            for (i=0;i<months;i++){
               value=(deposit+(deposit* (percentage/1200)));
               deposit=value;
               j=j+1;
           
           System.out.printf("%-5d  %10.1f\n",j,value);}
            // TODO code application logic here
        }
}