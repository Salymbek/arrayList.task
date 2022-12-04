package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("TOKMOK");
        names.add("KYZYL-KIYA");
        names.add("NARYN");
        names.add("BALYKCHY");


//
//        Java 8 үчүн практикалык тапшырма
//
//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз.


        ArrayList<String> strings = new ArrayList<>();
        strings.add("BISHKEK");
        strings.add("OSH");
        strings.add("KARA-KOL");
        System.out.println("N-1 : " +strings);


//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.


        strings.add(0,"KANT");
        System.out.println("N-2 : "+strings);


//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.


        System.out.println("N-3 : "+strings.indexOf("KARA-KOL"));


//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.


        strings.set(1,"KARA-BALTA");
        System.out.println("N-4 : "+strings);


//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.


        strings.remove(2);
        System.out.println("N-5 : "+strings);


//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.

        System.out.println("N-6 : "+strings.get(1));


//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.

         Collections.sort(strings);
        System.out.println("N=7 : "+strings);


//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.

        strings.addAll(names);
        System.out.println("N-8 : "+strings);

//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.

        Collections.shuffle(strings);
        System.out.println("N-9 : "+strings);


//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.


        strings.retainAll(names);
        System.out.println("N-10 : "+strings);


//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз


        System.out.println("N-11 : "+strings.subList(1, 3));

    }
}
