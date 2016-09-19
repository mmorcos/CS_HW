System.out.println("This program will find the valume of a cone. \n"
                    + "Please enter a number for the radius.");
            Scanner input=new Scanner(System.in);
            double r=input.nextDouble();
            System.out.println("Enter a number for the height. ");
            double h=input.nextDouble();
            double v = CylinderVolume ( r,h);
            System.out.println("The volume of the cone with the inputed "
                    + "demiensons"
                    + "are:"  + v );
                }       
           public static double CylinderVolume(double r, double h){
          double result= ((1.0/3.0)*Math.PI) * (r*r)*h;
          return result;
        }
 
             




Scanner input=new Scanner(System.in);
             int i;
            for (i=1;i<=3;i++){
                System.out.println("Enter the number of month you are in.");
             int month=input.nextInt();
             findsem(month);
            }
   


            // TODO code application logic here
        }
public static void findsem(int m){
         if (m<=5 && m>=2){
        System.out.println("You are in the spring semester");
        }
        else if (m<=12 && m>=9)
          System.out.println("You are in the fall semester.");
        else if (m<=8 && m>=6)
            System.out.println("You are on summer break!");
        else if (m==1)
            System.out.println("You are on winter break");
        }
}