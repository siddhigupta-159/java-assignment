import java.util.Scanner;
class dmart{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("enter the name of customer");
        
        Scanner a=new Scanner(System.in);
        String gender=a.next();
        System.out.println("enter the gender of customer");

        Scanner b=new Scanner(System.in);
        String powder=b.next();
        System.out.println(("enter 1st prduct name and quantity"));  // 1=10r ;

        Scanner d=new Scanner(System.in);
        String  oinment=d.next();
        System.out.println("enter 2nd product name and quantity"); //1=20r; 2*20=40

        Scanner e=new Scanner(System.in);
        String tshirt=e.next(); 
        System.out.println("enter the 3rd product name and quantity");  //1=30rs; 3*30=90

        Scanner f=new Scanner(System.in);
        String shoe=f.next();
        System.out.println("enter the 4th product name and quantity"); //1=40rs;4*40=160

        Scanner g=new Scanner(System.in);
        String towel=g.next();
        System.out.println("enter the 5th product name and quantity"); //1=50rs ; 5*50=250

        Scanner h=new Scanner(System.in);
        String pant=h.next();
        System.out.println("enter the 6th product name and quantity"); //1=6=rs ;6*60=360

        Scanner i=new Scanner(System.in);
        String kurta=i.next();
        System.out.println("enter the 7th product name and quantity"); //1=70 ; 7*70=490

        Scanner j=new Scanner(System.in);
        String serum=j.next();
        System.out.println("enter the 8th product name and quantity"); //1=80rs ; 8*80=640

        Scanner k=new Scanner(System.in);
        String shampoo=k.next();
        System.out.println("enter the 9th product name and quantity"); //1=90rs 9*90=810

        Scanner l=new Scanner(System.in);
        String conditioner=l.next();
        System.out.println("enter the 10th product name and quantity"); //1=100; 10*100=100
        
        int total4=(10+40+90+160)-(12); //300*5%=12; 300-12=288
        int item5=250-25;  //250*10%=25; 250-25
        int total10=(1000-150); //1000*15%; 1000-150=850
        int totalamount=(total4+item5+total10)+3905; //3550*10%; 3550+355=3590

    if{ (gender == "female"){
        System.out.print("Gift : cadeberry\t\t\t0.00\t\t0.00");
    } else {
        System.out.print("Gift : ledger wallet\t\t0.00\t\t0.00");
    }


        System.out.println( "        Dmart        " );
        System.out.println("name: Siddhi gupta                 Date:21/07/2025");
        System.out.printn("_______________________________________________________");
        System.out.println("item name     quantity    price   total   after discount");
        System.out.println("powder         1           11     11rs        10");
        System.out.println("oinment        2           23     46rs        40");
        System.out.println("tshirt         3           31     93rs        90");
        System.out.println("shoe           4           44     176rs      160");
        System.out.println("pant           5           52     260rs      250");
        System.out.println("towel          6           66     639rs      360");
        System.out.println("kurta          7           75     525rs      490");
        System.out.println("serum          8           69     712rs      640");
        System.out.println("shampoo        9           84     756rs      810");
        System.out.println("condiotioner   10          95     950rs     1000");
        System.out.printn("_______________________________________________________);
        System.out.println("                                 A.P.       D.P");
        System.out.println(""                                 4138       3550");
        System.out.println( "Gift:cadberry                    0.00       0.00");
        System.out.printlm( "Carry Bag : yes                  10:00	    10:00");
        System.out.println("GST (10%)	                     413.8       355");
        System.out.println( "total                            451.8       3905");
        System.out.printn("_______________________________________________________");                              
        System.out.println("   thank you ");
        System.out.println( "        To visit us");
        System.out.println(  "             Dmart");
        System.out.printn("_______________________________________________________");
               }
}
