/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calend1;

/**
 *
 * @author Javier Gonzalez
 * @author Eric Perez
 */
import java.util.Scanner;
public class Calend1 {

    /**
     * @param args the command line arguments
     */
    public static int getMonthNumber(String s){
        int month;
        if(s.equalsIgnoreCase("jan"))
            month =1;
        else if(s.equalsIgnoreCase("feb"))
            month =2;
        else if(s.equalsIgnoreCase("mar"))
            month =3;
        else if(s.equalsIgnoreCase("apr"))
            month =4;
        else if(s.equalsIgnoreCase("may"))
            month =5;
        else if(s.equalsIgnoreCase("jun"))
            month =6;
        else if(s.equalsIgnoreCase("jul"))
            month =7;
        else if(s.equalsIgnoreCase("aug"))
            month =8;
        else if(s.equalsIgnoreCase("sep"))
            month =9;
        else if(s.equalsIgnoreCase("oct"))
            month =10;
        else if(s.equalsIgnoreCase("nov"))
            month =11;
        else if(s.equalsIgnoreCase("dec"))
            month =12;
        else 
            month = 0;
        return month;
        
    }
    public static String getMonthName(int month){
        String monName;
        if (month<2)
            monName="January ";
        else if (month<3)
            monName="February ";
        else if (month<4)
            monName="March ";
        else if (month<5)
            monName="April ";
        else if (month<6)
            monName="May ";
        else if (month<7)
            monName="June ";
        else if (month<8)
            monName="July ";
        else if (month<9)
            monName="August ";
        else if (month<10)
            monName="September ";
        else if (month<11)
            monName="October ";
        else if (month<12)
            monName="November ";
        else if (month<13)
            monName="December ";
        else 
            monName="ERROR: Input a real month";
        return monName;
    }
      public static boolean isLeapYear(int year){
        if (year%4>0){
            if (year%100>0){
                year=year%100;
                if (year%400>0){
                    return false;
                }
                else 
                    return true;
            }
            return false;
        }
        return true;
            
    }
    public static int getDaysIn(int month,int year){
        int days;
        days=0;
        if (month<1)
            days=0;
        else if (month<2)
            days=31;
        else if (month<3){
             if (isLeapYear(year))
                days=29;
             else
                 days=28;
        }
        else if (month<8){
            if (month%2==0)
                days=30;
            else
                days=31;
        }
        else if (month<9)
            days=31;
        else if (month>=9){
            if (month%2==0)
                days=31;
            else
                days=30;
        }

        return days;
    }
    public static int getStartDay(int month, int year){
        int startDay=0, yearEnd=0, centry=0,tabMonth=0;
        if (year<=1999){
            yearEnd=year-1900;
            centry=9;
        }
        else {
            yearEnd=year-2000;
            centry=0;
        }
        if (isLeapYear(year)){
            if (month==1)
                tabMonth=6;
            if (month==2)
                tabMonth=2;
            if (month==3)
                tabMonth=3;
            if (month==4)
                tabMonth=6;
            if (month==5)
                tabMonth=1;
            if (month==6)
                tabMonth=4;
            if (month==7)
                tabMonth=6;
            if (month==8)
                tabMonth=2;
            if (month==9)
                tabMonth=5;
            if (month==10)
                tabMonth=0;
            if (month==11)
                tabMonth=3;
            if (month==12)
                tabMonth=5;
                }
        else {
            if (month==1)
                tabMonth=0;
            if (month==2)
                tabMonth=3;
            if (month==3)
                tabMonth=3;
            if (month==4)
                tabMonth=6;
            if (month==5)
                tabMonth=1;
            if (month==6)
                tabMonth=4;
            if (month==7)
                tabMonth=6;
            if (month==8)
                tabMonth=2;
            if (month==9)
                tabMonth=5;
            if (month==10)
                tabMonth=0;
            if (month==11)
                tabMonth=3;
            if (month==12)
                tabMonth=5;
                }
        startDay= 1+tabMonth+yearEnd+(yearEnd/4)+centry;
        startDay= startDay%7;
        startDay=startDay-1;
        return startDay;
    }
      
    public static void displayCalendar(int month, int year){
        System.out.println(" Sun Mon Tue Wed Thur Fri Sat");
        int startDay = getStartDay(month,year);
        int weekDay =startDay;
        int days =getDaysIn(month,year);
        for (int i=1; i<=startDay; i=i+1){
            System.out.print("    ");
        }
        for (int i=1; i<=days; i=i+1){
            System.out.printf("%4d", i);
            weekDay=weekDay+1;
            if (weekDay%7==0){
                System.out.println();
            }
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String repeat;
        String response;
        do {
        Scanner kb = new Scanner(System.in);
        int j=0;
        int year=0;
        int g=0;
        int monNumb=0;
        while (j<3){
            System.out.println("Input month and year");
            String month = kb.next();
            String inpyear = kb.next();
            monNumb=getMonthNumber(month);
            if(monNumb>0){
                 for (int i=0;i<inpyear.length();i=i+1){
               if(!Character.isDigit(inpyear.charAt(i))){
                   g=g+1;}
           }
           
           if(g>0) {
                System.out.println("Error: you must input a valid date");
                j=j+1;
                if (j>2){
                    System.out.println("Program is shutting down");
                System.exit(0);}}
           
           else {
                year=Integer.parseInt(inpyear);
                if (year<1900){
                    System.out.println("Error: you must input a date between "+
                            "1900 and 2099");
                j=j+1;
                }
                else if(year>2099){
                    System.out.println("Error: you must input a date between "+
                            "1900 and 2099");
                j=j+1;
                if (j>2){
                    System.out.println("Program is shutting down");
                System.exit(0);}}
                else
                    j=3;
           }
            }
            if(monNumb<1){
                System.out.println("Error: you must input a valid date");
                j=j+1;
                if (j>2){
                    System.out.println("Program is shutting down");
                System.exit(0);}
            }
            
        

           if (inpyear.length()!=4){
               System.out.println("Error: you must input a valid date");
                j=j+1;
           }

              
           
           }
        String monName= getMonthName(monNumb);
        System.out.println("     "+monName + year);
        displayCalendar(monNumb,year);
        System.out.println("\nDo you want to continue?");
        repeat = kb.next();
        response = repeat.substring(0,1);
    } while(response.equalsIgnoreCase("y"));
        System.out.println("Program Successfuly Terminated");
    }
    
}
