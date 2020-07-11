/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendimiento_motor;

/**
 *
 * @author STIVEN
 */
import java.util.Scanner;
public class Rendimiento_Motor {

    public static int Identificar_motor(){

Scanner objeto=new Scanner (System.in);
int codigo;
String tipo_motor;
System.out.println ("Ingrese el codigo del motor:\n");
codigo=objeto.nextInt();

return codigo;
}
    public static float Especificar_combustible_motor(){
        Scanner objeto=new Scanner (System.in);
        float cantidad_combustible;
        System.out.println("Ingrese la cantidad de combustible que utilizara el motor(LT):\n");
        cantidad_combustible = objeto.nextFloat();
        return cantidad_combustible;
    }

    public static float Evaluar_rendimineto_motor(){
        Scanner objeto=new Scanner (System.in);

        float rendimiento;
        System.out.println("Ingrese el rendimiento del motor(Hp):\n");
        rendimiento=objeto.nextFloat();

        return rendimiento;

    }

     public static float Comparar_estado_motor(){
        Scanner objeto=new Scanner (System.in);

        float rendimiento;

        rendimiento=Evaluar_rendimineto_motor();
        return rendimiento;

    }
public static float Obtener_resultados_rendimiento(){
    Scanner objeto=new Scanner (System.in);

    float rendimiento;

    rendimiento=Evaluar_rendimineto_motor();
        return rendimiento;

}
    public static void main(String[] args) {
        //////////////////////////////////////
         Scanner objeto=new Scanner (System.in);
        int codigo;
        float cantidad_combustible;
        String tipo_motor;
        String tipo_combustible;
        float rendimiento_minimo_motor=180;
        float rendimiento_maxima_motor=250;
        float rendimiento;
        //////////////

       ///////////////////////////////////////
       codigo= Identificar_motor();
       cantidad_combustible=Especificar_combustible_motor();
       rendimiento=Evaluar_rendimineto_motor();
       //////////////////////////////////////////////////
       System.out.println("El codigo del motor es:"+codigo);
       System.out.println("La cantidad de combustible que se utilizara es:"+cantidad_combustible);
       ///////////////////////////////////////////////////
        if(rendimiento<rendimiento_minimo_motor){
        System.out.println("\nEl rendimiento no esta estable");

        }else

         {

	if(rendimiento<rendimiento_maxima_motor)
		System.out.println("\nEl rendimiento esta estable");
         else
            System.out.println("\nEl rendimiento no esta estable");

         }
        /////////////////////////////////////////////////
         if(rendimiento<rendimiento_minimo_motor){
        System.out.println("\nEl motor no trabajo correctamente en su estado inicial y final");

         }else

         {

	if(rendimiento<rendimiento_maxima_motor){
		System.out.println("\nEl motor trabajo correctamente en su estado inicial y final");
        }else
            System.out.println("\nEl motor no trabajo correctamente en su estado inicial y final");

        }
         ///////////////////////////////////////////////////////
         if(rendimiento<rendimiento_minimo_motor){
        System.out.println("\nLos resultados han demostrado que la propagación no puede "
                + "usarse en estudios extensivos que investigan el efecto del combustible"
                + " alternativo en el rendimiento del motor.");

         }else

         {

	if(rendimiento<rendimiento_maxima_motor){
		System.out.println("\nLos resultados han demostrado que el propagación puede "
                        + "usarse en estudios extensivos que investigan el efecto del combustible "
                        + "alternativo en el rendimiento del motor.");
        }else
            System.out.println("\nLos resultados han demostrado que la propagación no puede "
                + "usarse en estudios extensivos que investigan el efecto del combustible"
                + " alternativo en el rendimiento del motor.");

        }
    }
}
