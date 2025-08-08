// 10 20 30
// 40 50 60
// 70 80 90   
//  print - sum of all even numbers and sum of all odd numbers

class Testmain {
    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int sum1=0;
        int sum2=0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (arr[r][c]%2==0) {
                    sum1 =sum1+arr[r][c];
                }
                    else 
                    sum2=sum2+arr[r][c];
            }
            System.out.println("sum of even no are "+ sum1);
            System.out.println("sum of odd no. are" +sum2);
        }
    }
}
