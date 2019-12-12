package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //1st task print array
        System.out.println("1st -----------------------");
        int[] arr1 = {2, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");

        }

        System.out.println("2nd -----------------------");

        //2nd task array elements 0

        int[] arr2=new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 0;
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.println("3rd -----------------------");

        //3rd task 1-1000 numbers

        int[] arr3= new int[1000];

        for (int i = 1; i <= 1000; i++) {
            arr3[i-1] = i;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");

        }


        System.out.println();
        System.out.println("4th -----------------------");

        //4th task byte array
        
        byte[] arr4= new byte[30];
        int j=0;
        for (int i = -30; i < 31; i+=2) {
            
            if(i==0)
                continue;
            arr4[j++]=(byte)i;
            
            }
        for (int i = 0; i < arr4.length; i++) {

            System.out.print(arr4[i] + " ");

        }


        System.out.println();
        System.out.println("5th -----------------------");

        //5th task short array
        short[] arr5 = new short[150];
        int k=0;
        for (int i = 1; i < 300; i+=2) {
            arr5[k++]=(short)i;
        }

        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }


        System.out.println();
        System.out.println("6th -----------------------");

        //6th task %5

        int[] arr6 = {2, 4, 5, 15, 7};
        for (int i = 0; i < arr6.length; i++) {
            if(arr6[i]%5==0){
                System.out.print(arr6[i] + " ");
            }
        }


        System.out.println();
        System.out.println("7th -----------------------");

        //7th task double array

        double[] arr7 = {2.5, 45.7, 0.7, 56.3, 7.9};
        for (int i = 0; i < arr7.length; i++) {

            if(arr7[i] > 24.56){
                System.out.print(arr7[i] + " ");
            }

        }

        System.out.println();
        System.out.println("8th -----------------------");

        //8th task float array

        float[] arr8 = {2.5f, 45.f, 0.7f, 56.3f, 7.9f, -39.4f};
        for (int i = 0; i < arr8.length; i++) {
            if(arr8[i] > 35.56 || arr8[i] < -34.655){
                System.out.print(arr8[i] + " ");
            }
        }

        System.out.println();
        System.out.println("9th -----------------------");

        //9th task sort ascending

        double[] arr9 = {2.5, 45.7, 0.7, 56.3, 7.9 };
        for (int i = 0; i < arr9.length; i++) {
            for(int c=0; c<arr9.length-i-1; c++) {
                if (arr9[c] > arr9[c + 1]) {
                    double current;
                    current = arr9[c + 1];
                    arr9[c + 1] = arr9[c];
                    arr9[c] = current;
                }
            }

        }
        for (int i = 0; i < arr9.length; i++) {
            System.out.print(arr9[i] + " ");
        }

        System.out.println();
        System.out.println("9th -----------------------");

        //9th task sort descending

        for(int i=0; i < arr9.length; i++) {
            for (int n = 0; n < arr9.length - i - 1; n++) {
                if (arr9[n] < arr9[n + 1]) {
                    double current;
                    current = arr9[n];
                    arr9[n] = arr9[n + 1];
                    arr9[n + 1] = current;
                }
            }
        }

            for (int i = 0; i < arr9.length; i++) {
                System.out.print(arr9[i] + " ");
            }

        System.out.println();
        System.out.println("10th -----------------------");

        //10th task number of a from string

        String str = "sgdhaaajhdaa";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
        


        }



    }














