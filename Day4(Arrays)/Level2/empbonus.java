import java.util.*;
class empbonus{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double[] salary = new double[10];
       double[] experience = new double[10];
       double[] newSalary = new double[10];
       double totalBonus = 0, totalOldSalary = 0, totalNewSalary ;
       for(int i=0;i<10;i++){
           System.out.print("Enter salary of Employee "+(i+1)+": ");
           salary[i] = sc.nextInt();
           if(salary[i]<=0){
               System.out.println("Please enter positive number");
               i--;
               continue;
           }
           System.out.print("Enter experice in years for Employee "+(i+1)+": ");
           experience[i] = sc.nextInt();
           if(experience[i]<=0){
               System.out.println("Please enter positive number");
               i--;
           }
       }
       for(int i=0;i<10;i++){
           if(experience[i]>5){
               double bonus = salary[i] * 0.05;
               totalBonus += bonus;
               totalOldSalary += salary[i];
               newSalary[i] = salary[i] + (bonus);
           }else{
               double bonus = salary[i] * 0.02;
               totalBonus += bonus;
               totalOldSalary += salary[i];
               newSalary[i] = salary[i] + (bonus);
           }
           System.out.println("New salary for employee " + i + " is " + newSalary[i]);
       }
       totalNewSalary = totalOldSalary + totalBonus;
       System.out.println("Total old Salary: "+ totalOldSalary);
       System.out.println("Total bonus: "+ totalBonus);
       System.out.println("Total new salary: " + totalNewSalary);    
   }  
}