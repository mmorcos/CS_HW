System.out.println("Type your first name");
           Scanner scan = new Scanner(System.in);
           String first_name;
           first_name= scan.nextLine();
           System.out.println("Type your middle initial");
           String middle_initial;
           middle_initial= scan.nextLine();
            System.out.println("Type your last name");
           String last_name;
           last_name= scan.nextLine();
           System.out.println("Your full name is: " + last_name + "," + " " +  first_name +
               " "+ middle_initial);








import javax.swing.JOptionPane; 


   "Enter a number");
        int x= Integer.parseInt(input);
        int y= x*x;
        JOptionPane.showMessageDialog(null, "The number you entered, squared is: " + y);