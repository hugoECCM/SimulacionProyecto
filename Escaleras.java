package clases;

/**
 *
 * @author hugoc
 */
public class Escaleras {

    public static boolean a1, a2, a3, aux;
    int i = 0;
    int[] a = new int[3];

    public void iteracciones(int i) {
        aux = a1;
        a1 = !a2;
        a2 = !a3;
        a3 = aux;
        if (a1 == false) {
            a[0] = 0;
        } else {
            a[0] = 1;
        }
        if (a2 == false) {
            a[1] = 0;
        } else {
            a[1] = 1;
        }
        if (a3 == false) {
            a[2] = 0;
        } else {
            a[2] = 1;
        }
        System.out.println("iteraccion : " + i + "\n " + a[0] + "\t" + a[1] + "\t" + a[2]);
    }

    public void llamada() {
        i = 0;
        a1 = false;
        a2 = false;
        a3 = false;
        if (a1 == false) {
            a[0] = 0;
        } else {
            a[0] = 1;
        }
        if (a2 == false) {
            a[1] = 0;
        } else {
            a[1] = 1;
        }
        if (a3 == false) {
            a[2] = 0;
        } else {
            a[2] = 1;
        }
        System.out.println("iteraccion : " + i + "\n " + a[0] + "\t" + a[1] + "\t" + a[2]);
        recu(i);
    }

    public int recu(int i) {
        if (i < 3) {
            i++;
            iteracciones(i);
            return recu(i);
        } else {
            return 0;
        }
    }
}
