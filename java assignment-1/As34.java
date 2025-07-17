// question 34
class As34{
    public static void main(String args[]){
        double Wl=128;
        double Wb=92;
        double Wh=40;
        double AW=0.5*(Wl+Wb);
        double Pw=4;
        double Pl=Pw;               //its perpendicular to Pw
        double AP=Pl*Pw;
        double Area=AW-AP;
        System.out.println("Wooded Area:"+Area);    
    }
}
