import java.util.Random;
import java.util.Scanner;

public class TotoMain {
    public static void main(String[] args) {

        int[] ChoiceOfTheNumbers = new int[6];

        int[] FirstDraw = {50, 51, 52, 53, 54, 55};
        int[] SecondDraw = {50, 51, 52, 53, 54, 55};
        int[] ThirdDraw = {50, 51, 52, 53, 54, 55};

        int[] FirstDrawOrdering = new int[6];
        int[] SecondDrawOrdering = new int[6];
        int[] ThirdDrawOrdering = new int[6];

        int HitTheFirstDraw = 0;
        int HitTheSecondDraw = 0;
        int HitTheThirdDraw = 0;

        int HitTheFirstDraw1 = 0;
        int HitTheSecondDraw1 = 0;
        int HitTheThirdDraw1 = 0;

        choiceOfNumer(ChoiceOfTheNumbers);
        drawingFirstNumbers(FirstDraw);
        drawingSecondNumbers(SecondDraw);
        drawingThirdNumbers(ThirdDraw);

        HitTheFirstDraw1 = youHitTheFirstNumber(ChoiceOfTheNumbers, FirstDraw, HitTheFirstDraw);
        HitTheSecondDraw1 = youHitTheSecondNumber(ChoiceOfTheNumbers, SecondDraw, HitTheSecondDraw);
        HitTheThirdDraw1 = youHitTheThirdNumber(ChoiceOfTheNumbers, ThirdDraw, HitTheThirdDraw);

        FirstDrawOrdering = firstNumberOrdering(FirstDraw);
        SecondDrawOrdering = secondNumnerOrdering(SecondDraw);
        ThirdDrawOrdering = thirdNumberOrdering(ThirdDraw);

        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(FirstDraw[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(SecondDraw[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(ThirdDraw[i] + " , ");
        }
        System.out.println();

        System.out.println("Вие улучихте в първо теглене " + HitTheFirstDraw1 + " числа");
        System.out.println("Вие улучихте в второ теглене " + HitTheSecondDraw1 + " числа");
        System.out.println("Вие улучихте в трето теглене " + HitTheThirdDraw1 + " числа");

        System.out.println("Вие бяхте избрали следните числа : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(ChoiceOfTheNumbers[i] + " , ");
        }
    }

    private static int youHitTheFirstNumber(int[] choiceOfTheNumbers, int[] firstDraw, int hitTheFirstDraw) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (choiceOfTheNumbers[i] == firstDraw[j]) {
                    hitTheFirstDraw++;
                }
            }
        }
        return hitTheFirstDraw;
    }

    private static int youHitTheSecondNumber(int[] choiceOfTheNumbers, int[] SecondDraw, int hitTheSecondDraw) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (choiceOfTheNumbers[i] == SecondDraw[j]) {
                    hitTheSecondDraw++;
                }
            }
        }
        return hitTheSecondDraw;
    }

    private static int youHitTheThirdNumber(int[] choiceOfTheNumbers, int[] ThirdDraw, int hitTheThirdDraw) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (choiceOfTheNumbers[i] == ThirdDraw[j]) {
                    hitTheThirdDraw++;
                }
            }
        }
        return hitTheThirdDraw;
    }

    private static int[] choiceOfNumer(int[] choiceOfTheNumbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Моля изберете число от 1 до 49 за позиция " + (i + 1) + " : ");
            choiceOfTheNumbers[i] = input.nextInt();
        }
        return choiceOfTheNumbers;
    }

    private static int[] drawingFirstNumbers(int[] firstDraw) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
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
        for (int i = 0; i < 6; i++) {
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
        for (int i = 0; i < 6; i++) {
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

    private static int[] firstNumberOrdering(int[] FirstDraw) {
        for (int i = 0; i < 6; i++) {
            System.out.print(FirstDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < FirstDraw.length; i++) {
            for (int j = 0; j < FirstDraw.length; j++) {
                if (FirstDraw[j] > drow[i]) {
                    drow[i] = FirstDraw[j];
                } else ;
            }
            for (int h = 0; h < FirstDraw.length; h++) {
                if (FirstDraw[h] == drow[i]) {
                    FirstDraw[h] = 0;
                }
            }
        }
        int j = 5;
        for (int i = 0; i < FirstDraw.length; i++) {
            FirstDraw[i] = drow[j];
            j--;
        }
        return FirstDraw;
    }

    private static int[] secondNumnerOrdering(int[] SecondDraw) {
        for (int i = 0; i < 6; i++) {
            System.out.print(SecondDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < SecondDraw.length; i++) {
            for (int j = 0; j < SecondDraw.length; j++) {
                if (SecondDraw[j] > drow[i]) {
                    drow[i] = SecondDraw[j];
                } else ;
            }
            for (int h = 0; h < SecondDraw.length; h++) {
                if (SecondDraw[h] == drow[i]) {
                    SecondDraw[h] = 0;
                }
            }
        }
        int j = 5;
        for (int i = 0; i < SecondDraw.length; i++) {
            SecondDraw[i] = drow[j];
            j--;
        }
        return SecondDraw;
    }

    private static int[] thirdNumberOrdering(int[] ThirdDraw) {
        for (int i = 0; i < 6; i++) {
            System.out.print(ThirdDraw[i] + " , ");
        }
        System.out.println();
        int[] drow = new int[6];
        for (int i = 0; i < ThirdDraw.length; i++) {
            for (int j = 0; j < ThirdDraw.length; j++) {
                if (ThirdDraw[j] > drow[i]) {
                    drow[i] = ThirdDraw[j];
                } else ;
            }
            for (int h = 0; h < ThirdDraw.length; h++) {
                if (ThirdDraw[h] == drow[i]) {
                    ThirdDraw[h] = 0;
                }
            }
        }
        int j = 5;
        for (int i = 0; i < ThirdDraw.length; i++) {
            ThirdDraw[i] = drow[j];
            j--;
        }
        return ThirdDraw;
    }
}