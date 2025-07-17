//question 24
class As24{
    public static void main( String args[]){
        double Bl=25;
        double Bh=10;
        double Bt=7.5;
        double Vb=Bl*Bh*Bt;
        double Wl=20*100;      //meter to cm
        double Wh=2*100;
        double Wt=0.75*100;
        double Vw=Wl*Wh*Wt;
        double NumB=Vw/Vb;
        double cost=(NumB/1000)*900;
        System.out.println("No. of bricks:"+NumB);
        System.out.println("toal cost:"+cost);

    }
}