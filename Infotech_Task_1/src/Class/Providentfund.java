package Class;

import interfaces.Checker;

public class Providentfund {
    private Checker checker;

    public Providentfund(Checker checker) {
        this.checker = checker;
    }
    public void Showresult(int id,String name)
    {
        Employee employee=new Employee(id,name,0);
        System.out.println("Employee Id:"+employee.getId()+" Employee Name:"+ employee.getName()+" Employee is eligible for Provient fund:"+checker.providentfund());
    }
}
