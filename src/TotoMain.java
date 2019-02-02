import java.util.Random;
import java.util.Scanner;

public class TotoMain {
    public static void main(String[] args) {

        int[] ChoiceOfTheNumbers = new int[6];

        int[] firstDraw1 = {50, 51, 52, 53, 54, 55};
        int[] secondDraw1 = {50, 51, 52, 53, 54, 55};
        int[] thirdDraw1 = {50, 51, 52, 53, 54, 55};

        int[] firstDrawOrdering = new int[6];
        int[] secondDrawOrdering = new int[6];
        int[] thirdDrawOrdering = new int[6];

        int hitTheFirstDraw = 0;
        int hitTheSecondDraw = 0;
        int hitTheThirdDraw = 0;

        int hitTheFirstDraw1 = 0;
        int hitTheSecondDraw1 = 0;
        int hitTheThirdDraw1 = 0;

//          Select numbers
//        Избор на числа
        choiceOfNumer(ChoiceOfTheNumbers);

//          Download the numbers
//        Изтегляне на числата
        drawingFirstNumbers(firstDraw1);
        drawingFirstNumbers(secondDraw1);
        drawingFirstNumbers(thirdDraw1);

//          Check for winning numbers
//        Проверка за печеливши числа
        hitTheFirstDraw1 = youHitTheFirstNumber(ChoiceOfTheNumbers, firstDraw1, hitTheFirstDraw);
        hitTheSecondDraw1 = youHitTheSecondNumber(ChoiceOfTheNumbers, secondDraw1, hitTheSecondDraw);
        hitTheThirdDraw1 = youHitTheThirdNumber(ChoiceOfTheNumbers, thirdDraw1, hitTheThirdDraw);

//          Sorting in ascending order
//        Подреждане във възходящ ред
        firstDrawOrdering = firstNumberOrdering(firstDraw1);
        secondDrawOrdering = firstNumberOrdering(secondDraw1);
        thirdDrawOrdering = firstNumberOrdering(thirdDraw1);

//          Print downloaded numbers
//        Отпечатване на изтеглените числа
        System.out.println();
        for (int i = 0; i < firstDraw1.length; i++) {
            System.out.print(firstDraw1[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < secondDraw1.length; i++) {
            System.out.print(secondDraw1[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < thirdDraw1.length; i++) {
            System.out.print(thirdDraw1[i] + " , ");
        }
        System.out.println();

//        Show profits
//        Показване на печалбите
        System.out.println("Вие улучихте в първо теглене " + hitTheFirstDraw1 + " числа");
        System.out.println("Вие улучихте в второ теглене " + hitTheSecondDraw1 + " числа");
        System.out.println("Вие улучихте в трето теглене " + hitTheThirdDraw1 + " числа");

        System.out.println("Вие бяхте избрали следните числа : ");
        for (int i = 0; i < ChoiceOfTheNumbers.length; i++) {
            System.out.print(ChoiceOfTheNumbers[i] + " , ");
        }
    }

    private static int youHitTheFirstNumber(int[] choiceOfTheNumbers, int[] firstDraw, int hitTheFirstDraw) {
        for (int i = 0; i < choiceOfTheNumbers.length; i++) {
            for (int j = 0; j < firstDraw.length; j++) {
                if (choiceOfTheNumbers[i] == firstDraw[j]) {
                    hitTheFirstDraw++;
                }
            }
        }
        return hitTheFirstDraw;
    }

    private static int youHitTheSecondNumber(int[] choiceOfTheNumbers, int[] SecondDraw, int hitTheSecondDraw) {
        for (int i = 0; i < choiceOfTheNumbers.length; i++) {
            for (int j = 0; j < SecondDraw.length; j++) {
                if (choiceOfTheNumbers[i] == SecondDraw[j]) {
                    hitTheSecondDraw++;
                }
            }
        }
        return hitTheSecondDraw;
    }

    private static int youHitTheThirdNumber(int[] choiceOfTheNumbers, int[] ThirdDraw, int hitTheThirdDraw) {
        for (int i = 0; i < choiceOfTheNumbers.length; i++) {
            for (int j = 0; j < ThirdDraw.length; j++) {
                if (choiceOfTheNumbers[i] == ThirdDraw[j]) {
                    hitTheThirdDraw++;
                }
            }
        }
        return hitTheThirdDraw;
    }

    private static int[] choiceOfNumer(int[] choiceOfTheNumbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < choiceOfTheNumbers.length; i++) {
            System.out.print("Моля изберете число от 1 до 49 за позиция " + (i + 1) + " : ");
            choiceOfTheNumbers[i] = input.nextInt();
        }
        return choiceOfTheNumbers;
    }

    private static int[] drawingFirstNumbers(int[] firstDraw) {
        Random rand = new Random();
        for (int i = 0; i < firstDraw.length; i++) {
            do {
                firstDraw[i] = rand.nextInt(49) + 1;
            } while (firstDraw[0] == firstDraw[1] || firstDraw[0] == firstDraw[2] ||
                    firstDraw[0] == firstDraw[3] || firstDraw[0] == firstDraw[4] ||
                    firstDraw[0] == firstDraw[5] || firstDraw[1] == firstDraw[0] ||
                    firstDraw[1] == firstDraw[2] || firstDraw[1] == firstDraw[3] ||
                    firstDraw[1] == firstDraw[4] || firstDraw[1] == firstDraw[5] ||
                    firstDraw[2] == firstDraw[0] || firstDraw[2] == firstDraw[1] ||
                    firstDraw[2] == firstDraw[3] || firstDraw[2] == firstDraw[4] ||
                    firstDraw[2] == firstDraw[5] || firstDraw[3] == firstDraw[0] ||
                    firstDraw[3] == firstDraw[1] || firstDraw[3] == firstDraw[2] ||
                    firstDraw[3] == firstDraw[4] || firstDraw[3] == firstDraw[5] ||
                    firstDraw[4] == firstDraw[0] || firstDraw[4] == firstDraw[1] ||
                    firstDraw[4] == firstDraw[2] || firstDraw[4] == firstDraw[3] ||
                    firstDraw[4] == firstDraw[5] || firstDraw[5] == firstDraw[0] ||
                    firstDraw[5] == firstDraw[1] || firstDraw[5] == firstDraw[2] ||
                    firstDraw[5] == firstDraw[3] || firstDraw[5] == firstDraw[4]
                    || firstDraw[i] != firstDraw[i]
            );
        }
        System.out.println();
        return firstDraw;
    }


    private static int[] firstNumberOrdering(int[] firstDraw) {
        for (int i = 0; i < firstDraw.length; i++) {
            System.out.print(firstDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < drow.length; i++) {
            for (int j = 0; j < firstDraw.length; j++) {
                if (firstDraw[j] > drow[i]) {
                    drow[i] = firstDraw[j];
                } else ;
            }
            for (int h = 0; h < firstDraw.length; h++) {
                if (firstDraw[h] == drow[i]) {
                    firstDraw[h] = 0;
                }
            }
        }
        int j = 5;
        for (int i = 0; i < firstDraw.length; i++) {
            firstDraw[i] = drow[j];
            j--;
        }
        return firstDraw;
    }
}