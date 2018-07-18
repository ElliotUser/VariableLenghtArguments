package exc02;

public class VarArgs {
    static void vaTest(int ... v){
        System.out.print("Количество аргументов: "+v.length+ " \nСодержимое: ");

        for (int x:v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(2,12,20);
        vaTest();
    }
}
