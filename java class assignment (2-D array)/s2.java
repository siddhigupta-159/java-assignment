// 10 20 30
// 40 50 60
// 70 80 90   
//  print 30 50 70

class Testmain {
        public static void main(String[] args) {
            int arr[][] = {
                    { 10, 20, 30 },
                    { 40, 50, 60 },
                    { 70, 80, 90 }
            };
            for (int r = 0; r < 3; r++) {
                for (int c = 3; c>=0; c--) {
                    if (r == c) {
                        System.out.print(arr[r][c]  +" ");
                    }
                }
            }
        }
    }

