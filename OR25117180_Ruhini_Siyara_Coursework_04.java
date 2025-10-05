import java.util.*;
class OR25117180_Ruhini_Siyara_Coursework_04{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|\t\t\t   SALARY INFORMATION SYSTEM\t\t\t  |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("\n");
        
        System.out.println("\t[1] Calculate Income Tax");
        System.out.println("\t[2] Calculate Annual Bonus");
        System.out.println("\t[3] Calculate Loan amount");
        
        System.out.println("\n");
        System.out.print("Enter an option to continue > ");
        int num = input.nextInt();
        input.nextLine();
        
        switch(num) {
            case 1:
                System.out.println("\n\n---------------------------------------------------------------------------");
                System.out.println("|\t\t\t    Calculate Income Tax\t\t\t  |");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("\n");
                
                System.out.print("Input Employee name   - ");
                String name1 = input.nextLine();
                
                System.out.print("Input Employee Salary - Rs.");
                int salary1 = input.nextInt();
                input.nextLine();
                System.out.println("\n");
                
                double tax=0;
                
                if (salary1<=100000){
                    System.out.println("You are free from Income Tax");
                }
                else if(salary1<=141667){
                   tax= (salary1-100000)*0.06 ;
                 
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                 else if(salary1<=183333){
                   tax= 2500+(salary1-141667)*0.12 ;
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=225000){
                    tax=7500+(salary1-183333)*0.18;
                   
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=266667){
                    tax=15000+(salary1-225000)*0.24;
                   
                    System.out.println("You have to pay Income Tax per month : Rs. "+tax);
                }
                else if(salary1<=308333){
                    tax=25000+(salary1-266667)*0.3;
                    
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=350000){
                    tax=37500+(salary1-308333)*0.36;
                   
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=450000){
                    tax= 52500+(salary1-350000)*0.36;
               
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=550000){
                    tax=88500+(salary1-450000)*0.36;
                   
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=650000){
                    tax=124500+(salary1-550000)*0.36;
                
                    System.out.println("You have to pay Income Tax per month : Rs. "+tax);
                }
                else if(salary1<=750000){
                   
                    tax=160500+(salary1-650000)*0.36;
            
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1<=900000){
                    
                    tax=196500+(salary1-750000)*0.36;
                   
                    System.out.println("You have to pay Income Tax per month : Rs. "+tax);
                }
                else if(salary1<=1000000){
                    
                    tax=250500+(salary1-900000)*0.36;
                   
                    System.out.println("You have to pay Income Tax per month : Rs."+tax);
                }
                else if(salary1>1000000){
                    
                    tax=286500+(salary1-1000000)*0.36;
                    
                    System.out.println("You have to pay Income Tax per month : Rs. "+tax);
                }
                break;
                
            case 2:
                System.out.println("\n\n---------------------------------------------------------------------------");
                System.out.println("|\t\t\t   Calculate Annual Bonus\t\t\t  |");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("\n");
                
                System.out.print("Input Employee name   - ");
                String name2 = input.nextLine();
                
                System.out.print("Input Employee Salary - Rs.");
                int salary2 = input.nextInt();
                input.nextLine();
                System.out.println("\n");
                
                double bonus;
                if (salary2<=100000){
                    bonus=5000;
                    System.out.println("Annual bonus - : "+bonus);
                }
                else if(salary2>100000&&salary2<=199999){
                    bonus=salary2*0.1;
                    System.out.println("Annual bonus - : "+bonus);
                }
                else if(salary2>=200000&&salary2<=299999){
                    bonus=salary2*0.15;
                    System.out.println("Annual bonus - : "+bonus);
                }
                else if(salary2>=300000&&salary2<=400000){
                    bonus=salary2*0.2;
                    System.out.println("Annual bonus - : "+bonus);
                }
                else if(salary2>400000){
                    bonus=salary2*0.35;
                    System.out.println("Annual bonus - : "+bonus);
                }
                break;
                
            case 3:
                System.out.println("\n\n---------------------------------------------------------------------------");
                System.out.println("|\t\t\t   Calculate Loan amount   \t\t\t  |");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("\n");
                
                System.out.print("Input Employee name   - ");
                String name3 = input.nextLine();
                
                System.out.print("Input Employee Salary - Rs.");
                double salary4 = input.nextDouble();
                input.nextLine();
                
                if (salary4<=50000){
                    System.out.println("\tYou can not get a loan because your salary amount is less than rs.50 000...");
                }
                else {
                    System.out.print("Input number of years for loan (max 5): ");
                    int years = input.nextInt();
                    input.nextLine();
                    
                    if (years <= 0 || years >5) {
                        System.out.println("\tInvalid number of years. Please enter between 1-5 years.");
                    }
                    else {
                        double maxInstallment = salary4 * 0.6;
                        double annualInterestRate = 0.15;
                        double monthlyRate = annualInterestRate / 12;
                        int numberOfMonths = years * 12;
                        
                        double calculation = maxInstallment * (1 - (1 / Math.pow(1 + monthlyRate, numberOfMonths))) / monthlyRate;
                        
						double temp = (calculation / 1000);
						int roundAmount = (int)(temp + 0.5);
						
						double loanAmount=roundAmount * 1000;

                        System.out.println("You can get Loan Amount : Rs."+loanAmount);
                    }
                }
                break;
                
            default:
                System.out.println("Invalid option! Please enter a valid choice.");
        }
    }
}

