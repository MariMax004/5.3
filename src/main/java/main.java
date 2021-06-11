import java.util.Scanner;

public class main {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float sum = in_number("сумму вклада");
        float per = in_number("% годовых");
        float n = in_number("во скалько раз увеличить сумму");
        int year = 0;
        float next_sum;
        float last_sum = sum * n;

        while (sum < last_sum) {
            next_sum = sum * (per / 100);
            sum += next_sum;
            year++;

        }

        System.out.println("Сумма вклада увеличится в " + n + " раз через " + year + " лет. Конечная сумма будет равна " +String.format("%.3f",sum)+" рублей");


    }

    public static float in_number(String string) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите " + string);
            try {
                float num=Float.parseFloat(in.next().trim().replaceAll(",", "\\."));
                if(Float.isInfinite(num))
                    System.out.println("Число не должно выходить за границы допустимого");
                else if (num<0) System.out.println("Число должно быть положительным");
                else return num;
            } catch (NumberFormatException ignored) {
                System.out.println("Число должно быть вещественного типа");
            }
        }
    }
}
