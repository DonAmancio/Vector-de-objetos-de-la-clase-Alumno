import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] alumno=new String[20];
        int[] edad=new int[20];
        int edadmax;
        String nombremax;
        int i=0;
        //introduccion de los datos

        System.out.println("Nombre de alumno: ");
        do {
            System.out.print("Alumno"+(i+1)+": ");
            alumno[i] = scanner.nextLine();
            System.out.println("Edad");
            edad[i] = scanner.nextInt();
            i++;
        } while (alumno[i] =="*");


        edadmax=edad[i];
        nombremax=alumno[i];

        for (int j = 0; j < alumno.length; j++) {
            scanner.nextLine();
            System.out.print("Alumno"+(i+1)+": ");
            alumno[i]= scanner.nextLine();
            System.out.print("Edad: " );
            edad[i]= scanner.nextInt();

            if (edad[i]>edadmax){
                edadmax=edad[i];
                nombremax=alumno[i];
            }

            System.out.println("Alumnos mayores: "+nombremax);
            System.out.println("Edad: "+edadmax);
        }
    }
}
