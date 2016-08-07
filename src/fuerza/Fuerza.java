package fuerza;

/**
 * @Autor: Luis Fernando Félix Mata
 * Mi primer proyecto en Java
 */
public class Fuerza {
    public static void main(String[] args) {
        // TODO code application logic here
        int contraseña = 100000;
        for (int i = 0; i != (contraseña + 1); i++) {
            System.out.println("Intentando con "+i);
            if (i == contraseña){
                System.out.println("La contraseña es: "+i);
            }
        }
    }
    
}
