
import java.io.Console;
import java.util.*;

public class Main {
    //программа переворачивает массив
    public static void reverseArray(String[] a) {
        //Выводим изначальный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    /*Он по очереди меняет местами противоположные элементы массива,
        используя как посредника дополнительную переменную String temp
        (temp - от temporary, "временный"). Можно было бы обойтись и без нее,
        если бы массив хранил переменные числового типа.
        Тут есть a[i] и малопонятное a[n-i-1]. Но на самом деле n-i-1 это
        просто формула для определения "противоположного" элемента массива:Если
        бы мы имели массив, который бы состоял из элементов a, b, c, d, e и f,
        то есть массив из 6 элементов (n=6), "противоположным" (то есть элементом
        a[n-i-1]) для каждого из них были бы f для a, e для b и  d для c. Цикл из
        фрагмента кода выполнялся бы три раза, до элемента d (i=0, 1, 2). Граница
        выполнения массива показана оранжевой линией на рисунке.
        Так, обратите внимание, что мы не должны проходить циклом весь массив,
        чтобы поменять его элементы местами.*/
    }

    static void reverse(Integer a[]) {

        /*Третий метод заключается в использовании функции java.util .Коллекции. метод обратного
        (список списков). Этот метод изменяет элементы в указанном списке на противоположные.
        Следовательно, сначала мы преобразуем массив в список с помощью java.util .Arrays.asList(массив),
        а затем переверните список.*/
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    // программа проверяет является ли строка палиндромом
    //Наивный подход: перевернув заданную строку и сравнив
    public static boolean isPalindrome1(String word) {
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        // Checking if both the strings are equal
        if (word.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    /*Рекурсивный подход: подход очень прост.
        Так же, как и в случае с двумя указателями, мы проверим первое и
        последнее значение строки, но на этот раз это будет сделано с помощью рекурсии.
        Мы возьмем два указателя i, указывающие на начало строки, и j,
        указывающие на конец строки.
        Продолжайте увеличивать i и уменьшать j, пока i < j и на каждом шаге
        Проверьте, совпадают ли символы в этих указателях или нет.
        Мы делаем это с помощью рекурсии - (i +1, j-1
        Если все символы одинаковы в i-м и j-м индексах до тех пор,
        пока не будет выполнено
        условие i>=j, выведите true, иначе false
        Ниже приведена реализация вышеупомянутого подхода:*/
    public static boolean isPalindrome(int i, int j, String A) {
        // сравнение двух указателей
        if (i >= j) {
            return true;
        }

        // сравнение символов по этим указателям
        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }

        // снова все рекурсивно проверяем
        return isPalindrome(i + 1, j - 1, A);
    }

    public static boolean isPalindrome(String A) {
        return isPalindrome(0, A.length() - 1, A);
    }

    //метод, который возводит число в квадрат
    public static void numb2(int num1, int num2) {
        System.out.println(Math.pow(num1, num2));

    }

    /* метод:
    1. Получаем на входе массив чисел.
    2. Все четные числа увеличиваем на единицу.
    3. Возвращаем кусок списка с 3-го по 7-й элемент.*/
    public static void changeArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr1[i] = arr1[i] + 1;
            }
        }
        for (int i = 2; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    //метод разделяет любую строку на две части ровно пополам по количеству символов
    public static void splitString(String s) {
        final int mid = s.length() / 2;
        String[] parts = {
                s.substring(0, mid),
                s.substring(mid),
        };
        /* или final int mid = str.length() / 2;
        String first = str.substring(0, mid);
        String second = str.substring(mid);*/

        System.out.println(Arrays.toString(parts));
        /* или System.out.println(first);
        System.out.println(second);*/
    }

    //массив приводим к строке
    public static void changesArrayInString(String[] namBookAndAuthor) {
        String str = String.join(",", namBookAndAuthor);
        System.out.println(str);
    }

    //Дан массив строк, необходимо удалить из него все дубли,
    // оставшиеся строки объединить в одну в порядке следования в массиве.
    public static void changeStringArray(String[] str1) {
        String[] str = new String[9];
        for (int i = 0; i < str1.length; i++) {
            str[i] = str1[i];
            System.out.print(str1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (i != j && str1[i] != null) {
                    if (str1[i].equals(str[j])) {
                        str1[i] = null;
                    }
                }
            }
        }
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i] + " ");
        }
    }

    public static void main(String[] args) {
       /* City city = new City();
        city.createStreet();
        City.Street streetFirst = city.new Street();
        City.Street streetSecond = new City().new Street();
        streetFirst.getAddress();
        streetSecond.getAddress();
        System.out.println();*/
int i = 0;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

    }}