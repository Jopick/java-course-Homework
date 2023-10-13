import java.util.Arrays;
import java.util.Scanner;

// ТУТ Я ПРОСТО ПРОВЕРЯЮ ВСЯКИЕ ФИЧИ И БАЛУЮСЬ ЭТО НЕ ДЗ!!!!!!!
public class Quiz {

    public static void main(String[] args) throws Exception {
        // массив и его хранение
        int[] v1 = new int[5];
        v1[0] = 1;
        v1[1] = 2;
        System.out.println(Arrays.toString(v1));

        int[][] m2 = new int[5][5];
        System.out.println(Arrays.toString(m2[1]));

        //сравнение int и Integer
        Integer a = 200;
        Integer b = 200;
        int e = 1;
        int r = 1;
        System.out.println(e == r);
        System.out.println(a.equals(b));

        // Цикл for while Foreach
        for(int i = 0;i < 10; i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i = 1; i < 10; i++){
            if(i % 6 == 0){
                break;
            }
            System.out.print(i);
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        int[] rt = new int[6];
        for(int el: rt) {
            System.out.print(el + ", ");
        }
        System.out.println();
        int [][] men = new int[][] {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };
        for(int[] vTemp : men){
            for(int el : vTemp){
                System.out.print(el + ", ");
            }
            System.out.println();
        }
        int aq = 100;
        int nq = 1;
        while ( nq < aq){
            nq *= 2;
        }
        System.out.println(nq);
        nq = 1;
        aq = 100;
        int cq;
        if (aq < nq) {
            cq = aq;
        } else {
            cq = nq;
        }
        System.out.println(cq);
        // то же самое что и if
        cq = (aq < nq) ? aq : nq;
        System.out.println(cq);
        // swich AND if

        String str = "y";
        int res;

        if (str.equals("a") || str.equals("b")){
            res = 0;
        } else if (str.equals("ab") || str.equals("bs")){
            res = 1;
        } else if(str.equals("abs")){
            res = 2;
        } else{
            res = 100;
        }
        System.out.println("String");
        System.out.println(res);

        str = "abc";
        switch (str) {
            case "a", "b":
                res = 0;
                break;
            case "ab", "bc":
                res = 1;
                break;
            case "abc":
                res = 2;
                break;
            default:
                res = 100;
        }
        System.out.println(res);

        res = switch (str) {
            case "a", "b":
                yield 0;
            case "ab", "bc":
                yield 1;
            case "abc":
                yield 2;
            default:
                yield 100;
        };
        System.out.println(res);

        str = "a";
        res = switch (str) {
            case "a", "b" -> 0;
            case "ab" -> 1;
            case "abc" -> 2;
            default -> 200;
        };

        System.out.println(res);

        //строки
        //Srting str
        str = "aabbbcdddd";
        System.out.println("Длинна сроки: " + str.length());
        System.out.println("Разделение по b: " + Arrays.toString(str.split("b")));
        System.out.println("Индекс bc: " + str.indexOf("bc"));
        System.out.println("Индекс e: " + str.indexOf("e"));
        System.out.println("Заменили b на d: " + str.replace('b', 'd'));
        System.out.println("Массив чаров: " + Arrays.toString(str.toCharArray()));
        System.out.println("Сравнение без регистра " + str.equalsIgnoreCase("AabBbcDdDd"));

        //final не даёт видоизменять переменную
        // final inta = 1
        // final ints = new int[3]
        // final List<Integer> ints2 = new LinkedList<>()

        //var любой тип данных
        var stp = "123";
        var i = 3;
        var l = 1l;
        var d = 1D;
        var d2 = 1.0;
        var ints = new int[5];


        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int bage = scanner.nextInt();
        System.out.println("Мен зовут " + name + ", мне " + age + " лет! " + bage);
        scanner.close();
    }
}
