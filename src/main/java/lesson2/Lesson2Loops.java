package lesson2;

public class Lesson2Loops {
    public static void main(String[] args) {
Lesson2Loops loops = new Lesson2Loops();
//loops.countNumbers(1);
//loops.countNumbers();
loops.numbersTemplate(9);

    }
    public void countNumbers(int i){
    //    System.out.println(i);
      //  System.out.println(i+1);

        while (i<=10){
            System.out.println(i);
           // i = i+1;
            i++;
        }
    }
//           public void countNumbers(){-
//            for(int i =1; i<=100; i++){
//                System.out.println(i);
//            }
//       }
    public void numbersTemplate(int rows){
        for(int i =1; i<=rows; i++){
            if(i % 2 ==0){
                continue;
            }
            for (int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
//        public void numbersTemplate(int rows){
//            for(int i =1; i<=rows; i++){
//               if(i % 2 ==0){
//               continue;
//                }
//                if(i==7){
//                    break;
//                }
//                for (int j=1; j<=i; j++){
//                    System.out.print(j + " ");
//                }
//                System.out.println();
//            }

        }


        //1
    //1 2
    // 1 2 3
    }

