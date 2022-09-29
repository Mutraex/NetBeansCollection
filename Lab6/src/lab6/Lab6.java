/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Mutraex
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SalariedEmployee emp1 = new SalariedEmployee("Gonzalez");
        SalariedEmployee emp2 = new SalariedEmployee("Ramirez");
        SalariedEmployee emp3 = new SalariedEmployee("Jones");
        SalariedEmployee emp4 = new SalariedEmployee("Horikawa");
        SalariedEmployee emp5 = new SalariedEmployee("Minh");
        
        Manager mg = new Manager();
        ProductionDesigner pd = new ProductionDesigner();
        Recruiter rec = new Recruiter();
        CommunityLiaison cl = new CommunityLiaison();
        
        mg.decorate(emp1);
        pd.decorate(emp1);
        rec.decorate(emp1);
        cl.decorate(emp1);
        
        rec.decorate(emp2);
        cl.decorate(emp2);
        
        pd.decorate(emp3);
        cl.decorate(emp3);
        
        pd.decorate(emp4);
        
        rec.decorate(emp5);
        
        emp1.getDescription();
        emp2.getDescription();
        emp3.getDescription();
        emp4.getDescription();
        emp5.getDescription();
        
        //decorate(emp1,"Manager");
    }
    
}
