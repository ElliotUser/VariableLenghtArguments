package exc04;

public class VarArgs3 {
    static void vaTest(int...v){
        System.out.print("vaTest(int...v): "+"\nКоличество аргументов: " + v.length +
                " \nСодержимое: ");

        for (int x:v) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    static void vaTest(int v){
        System.out.print("vaTest(int v): "+"\nНе поддерживает аргументы переменной длины " +
                " \nСодержимое: "+v);
        System.out.println("\n");
    }



    static void vaTest(boolean...v){
        System.out.print("vaTest(boolean...v): "+"\nКоличество аргументов: " + v.length +
                " \nСодержимое: ");

        for (boolean x:v) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    static void vaTest(String msg, int...v){
        System.out.print("vaTest(String mgs, int...v): "+"\nКоличество аргументов: " + v.length +
                " \nСодержимое: ");

        for (int x:v) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        vaTest(10,11,12);
        vaTest(10);
        vaTest(true,false,true);
        vaTest("Два аргумента переменной длины: ",5,16);
    }
}
