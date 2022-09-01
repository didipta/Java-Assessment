package Class;

import interfaces.Checker;

public class Bonuscalculation {

    private Checker checker;

    public Bonuscalculation(Checker checker) {
        this.checker = checker;
    }
    public void Showresult(int id,String name,int amount)
    {
        Employee employee=new Employee(id,name,amount);
        System.out.println("Employee Id:"+employee.getId()+" Employee Name:"+ employee.getName()+" Employee Bonuse:"+(int)checker.bonus(employee.getAmount()));
    }
}
