public class assignment {

public static final int IS_PART_TIME= 1; 
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR=28; 
public static final int NUM_OF_WORKING_DAYS=2; 
public static final int MAX_HRS_IN_MONTH = 10;


public static void main (String[] args) {

   // Variables 
int empHrs = 0, totalEmpHrs=0, totalworkingDays = 8;

// Computation

while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
 totalworkingDays < NUM_OF_WORKING_DAYS) {

totalworkingDays++;

int empCheck = (int) Math.floor(Math.random() * 10) % 3;

switch (empCheck) {
     case IS_PART_TIME:

  empHrs = 4;
     break;

     case IS_FULL_TIME:
         empHrs =8;

     break;
     default: 
     empHrs = 0;
}

     totalEmpHrs += empHrs;

     System.out.println("Day#:" + totalworkingDays + "Emp Hr: " +empHrs); 
}
     int totalEmpwage = totalEmpHrs * EMP_RATE_PER_HOUR;

     System.out.println("Total Emp Wage: "+totalEmpwage);

    }
 }

