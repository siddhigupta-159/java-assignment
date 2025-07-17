//question 32
class As32{
    public static void main(String args[]){
        int w=20;
        int l=30;
        int A=w*l;
        int P1=3;
        int P2=4;
        int AG=P1*P2;
        int Ap1=l*P1;
        int Ap2=w*P2;
        int Apath=(Ap1+Ap2-AG);
        int TotalArea=(AG-Apath);
        System.out.println("AREA:"+TotalArea);

    }
}





