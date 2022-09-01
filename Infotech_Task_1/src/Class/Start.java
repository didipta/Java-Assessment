package Class;

public class Start {
    public static void main(String[] args) {
        Bonuscalculation bonuscalculation=new Bonuscalculation(new Permanentemployee());
        bonuscalculation.Showresult(1,"Rahim",8000);
        bonuscalculation=new Bonuscalculation(new Contractualandtemporary());
        bonuscalculation.Showresult(2,"Karim",20000);
        System.out.println("------------------------");
        Providentfund providentfund=new Providentfund(new Permanentemployee());
        providentfund.Showresult(1,"Rahim");
        providentfund=new Providentfund(new Contractualandtemporary());
        providentfund.Showresult(2,"Karim");
        providentfund.Showresult(3,"Habib");

    }
}
