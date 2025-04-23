//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class MaxValueIndex {
//
//    public static void main(String[] args) {
//        int[] numbersArray = new int[5];
//        Random random = new Random();
//
//        for (int i = 0; i < numbersArray.length; i++) {
//            numbersArray[i] = random.nextInt(51);
//        }
//
//        List<Integer> numbersList = new ArrayList<>();
//        for (int num : numbersArray) {
//            numbersList.add(num);
//        }
//
//        int maxIndex = 0;
//        for (int i = 1; i < numbersList.size(); i++) {
//            if (numbersList.get(i) > numbersList.get(maxIndex)) {
//                maxIndex = i;
//            }
//        }
//
//        System.out.println("რანდომ რიცხვები: " + numbersList);
//        System.out.println("მაქსიმალური რიცხვის ინდექსი: " + maxIndex);
//        System.out.println("მაქსიმალური რიცხვი: " + numbersList.get(maxIndex));
//    }
//}
