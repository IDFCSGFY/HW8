import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("#1");
        int mass1[] = new int[]{1, 2, 3};
        float mass2[] = {1.57f, 7.654f, 9.986f};
        boolean mass3[] = new boolean[3];
        mass3[mass3.length - 1] = true;

        //2
        System.out.println("\n#2\n");
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i]);
            if (i != mass1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            if (i == mass2.length - 1) {
                System.out.println(mass2[i]);
                break;
            }
            System.out.print(mass2[i] + ", ");
        }
        for (int i = 0; i < mass3.length; i++) {
            if (i == mass3.length - 1) {
                System.out.println(mass3[i]);
                break;
            }
            System.out.print(mass3[i] + ", ");
        }

        //3
        System.out.println("\n#3\n");
        for (int i = mass1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(mass1[i]);
                break;
            }
            System.out.print(mass1[i] + ", ");
        }
        for (int i = mass2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(mass2[i]);
                break;
            }
            System.out.print(mass2[i] + ", ");
        }
        for (int i = mass3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(mass3[i]);
                break;
            }
            System.out.print(mass3[i] + ", ");
        }

        //4
        System.out.println("\n#4\n");
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 != 0) {
                mass1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(mass1));
    }
}