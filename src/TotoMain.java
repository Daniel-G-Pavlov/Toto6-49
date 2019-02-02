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
        drawingSecondNumbers(secondDraw1);
        drawingThirdNumbers(thirdDraw1);

//          Check for winning numbers
//        Проверка за печеливши числа
        hitTheFirstDraw1 = youHitTheFirstNumber(ChoiceOfTheNumbers, firstDraw1, hitTheFirstDraw);
        hitTheSecondDraw1 = youHitTheSecondNumber(ChoiceOfTheNumbers, secondDraw1, hitTheSecondDraw);
        hitTheThirdDraw1 = youHitTheThirdNumber(ChoiceOfTheNumbers, thirdDraw1, hitTheThirdDraw);

//          Sorting in ascending order
//        Подреждане във възходящ ред
        firstDrawOrdering = firstNumberOrdering(firstDraw1);
        secondDrawOrdering = secondNumnerOrdering(secondDraw1);
        thirdDrawOrdering = thirdNumberOrdering(thirdDraw1);

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

    private static int[] drawingSecondNumbers(int[] secondDraw) {
        Random rand = new Random();
        for (int i = 0; i < secondDraw.length; i++) {
            do {
                secondDraw[i] = rand.nextInt(49) + 1;
            } while (secondDraw[0] == secondDraw[1] || secondDraw[0] == secondDraw[2] ||
                    secondDraw[0] == secondDraw[3] || secondDraw[0] == secondDraw[4] ||
                    secondDraw[0] == secondDraw[5] || secondDraw[1] == secondDraw[0] ||
                    secondDraw[1] == secondDraw[2] || secondDraw[1] == secondDraw[3] ||
                    secondDraw[1] == secondDraw[4] || secondDraw[1] == secondDraw[5] ||
                    secondDraw[2] == secondDraw[0] || secondDraw[2] == secondDraw[1] ||
                    secondDraw[2] == secondDraw[3] || secondDraw[2] == secondDraw[4] ||
                    secondDraw[2] == secondDraw[5] || secondDraw[3] == secondDraw[0] ||
                    secondDraw[3] == secondDraw[1] || secondDraw[3] == secondDraw[2] ||
                    secondDraw[3] == secondDraw[4] || secondDraw[3] == secondDraw[5] ||
                    secondDraw[4] == secondDraw[0] || secondDraw[4] == secondDraw[1] ||
                    secondDraw[4] == secondDraw[2] || secondDraw[4] == secondDraw[3] ||
                    secondDraw[4] == secondDraw[5] || secondDraw[5] == secondDraw[0] ||
                    secondDraw[5] == secondDraw[1] || secondDraw[5] == secondDraw[2] ||
                    secondDraw[5] == secondDraw[3] || secondDraw[5] == secondDraw[4] ||
                    secondDraw[i] != secondDraw[i]);
        }
        return secondDraw;
    }

    private static int[] drawingThirdNumbers(int[] thirdDraw) {
        Random rand = new Random();
        for (int i = 0; i < thirdDraw.length; i++) {
            do {
                thirdDraw[i] = rand.nextInt(49) + 1;
            } while (thirdDraw[0] == thirdDraw[1] || thirdDraw[0] == thirdDraw[2] ||
                    thirdDraw[0] == thirdDraw[3] || thirdDraw[0] == thirdDraw[4] ||
                    thirdDraw[0] == thirdDraw[5] || thirdDraw[1] == thirdDraw[0] ||
                    thirdDraw[1] == thirdDraw[2] || thirdDraw[1] == thirdDraw[3] ||
                    thirdDraw[1] == thirdDraw[4] || thirdDraw[1] == thirdDraw[5] ||
                    thirdDraw[2] == thirdDraw[0] || thirdDraw[2] == thirdDraw[1] ||
                    thirdDraw[2] == thirdDraw[3] || thirdDraw[2] == thirdDraw[4] ||
                    thirdDraw[2] == thirdDraw[5] || thirdDraw[3] == thirdDraw[0] ||
                    thirdDraw[3] == thirdDraw[1] || thirdDraw[3] == thirdDraw[2] ||
                    thirdDraw[3] == thirdDraw[4] || thirdDraw[3] == thirdDraw[5] ||
                    thirdDraw[4] == thirdDraw[0] || thirdDraw[4] == thirdDraw[1] ||
                    thirdDraw[4] == thirdDraw[2] || thirdDraw[4] == thirdDraw[3] ||
                    thirdDraw[4] == thirdDraw[5] || thirdDraw[5] == thirdDraw[0] ||
                    thirdDraw[5] == thirdDraw[1] || thirdDraw[5] == thirdDraw[2] ||
                    thirdDraw[5] == thirdDraw[3] || thirdDraw[5] == thirdDraw[4] ||
                    thirdDraw[i] != thirdDraw[i]);
        }
        return thirdDraw;
    }

    private static int[] firstNumberOrdering(int[] firstDraw) {
        for (int i = 0; i < firstDraw.length; i++) {
            System.out.print(firstDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < firstDraw.length; i++) {
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

    private static int[] secondNumnerOrdering(int[] secondDraw) {
        for (int i = 0; i < 6; i++) {
            System.out.print(secondDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < secondDraw.length; i++) {
            for (int j = 0; j < secondDraw.length; j++) {
                if (secondDraw[j] > drow[i]) {
                    drow[i] = secondDraw[j];
                } else ;
            }
            for (int h = 0; h < secondDraw.length; h++) {
                if (secondDraw[h] == drow[i]) {
                    secondDraw[h] = 0;
                }
            }
        }
        int j = 5;
        for (int i = 0; i < secondDraw.length; i++) {
            secondDraw[i] = drow[j];
            j--;
        }
        return secondDraw;
    }

    private static int[] thirdNumberOrdering(int[] thirdDraw) {
        for (int i = 0; i < thirdDraw.length; i++) {
            System.out.print(thirdDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < thirdDraw.length; i++) {
            for (int j = 0; j < thirdDraw.length; j++) {
                if (thirdDraw[j] > drow[i]) {
                    drow[i] = thirdDraw[j];
                } else ;
            }
            for (int h = 0; h < thirdDraw.length; h++) {
                if (thirdDraw[h] == drow[i]) {
                    thirdDraw[h] = 0;
                }
            }
        }
        int j = 5;
        for (int i = 0; i < thirdDraw.length; i++) {
            thirdDraw[i] = drow[j];
            j--;
        }
        return thirdDraw;
    }
}