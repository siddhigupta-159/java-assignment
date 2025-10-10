//"1,2,3,4,5,6,7,8,9,10"

class Testmain {
    public static void main(String args[]) {

        String s = "1,2,3,4,5,6,7,8,9,10";
        String[] x = s.split(",");
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + Integer.parseInt(x[i]);
        }
        System.out.println("SUM OF STRING :" + sum);
    }

}
