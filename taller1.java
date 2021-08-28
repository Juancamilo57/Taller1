package logicaprogramacion20212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class copia {

    public static void main(String[] args) throws IOException {
        boolean ciclo = true;
        while (ciclo) {
            BufferedReader et = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" --- Validador de velocidad --- \n ");

            int velocidad, usuario;

            System.out.println(" Ingrese la velocidad del vehículo en km/h: \n");
            velocidad = Integer.parseInt(et.readLine());

            if (velocidad >= 1 && velocidad <= 60) {
                System.out.println(" Usted NO debera pagar el próximo peaje \n ");

            } else if (velocidad > 60 && velocidad <= 80) {
                System.out.println(" Usted tendra derecho a un galón de combustible en la próxima estación de servicio \n ");

            } else if (velocidad > 80) {
                System.out.println(" Usted debera pagar un comparendo de $550.000 por exceder los limites de velocidad ");
                System.out.println(" y le sera inmobilizado el vehículo por imprudente \n");
            }
            System.out.println(" Digite (1) si desea hacer otra medición \n");
            usuario = Integer.parseInt(et.readLine());
            if (usuario == 1) {
                ciclo = true;

            } else {
                ciclo = false;
            }

        }

    }

}
