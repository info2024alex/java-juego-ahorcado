import java.util.Scanner;

public class Ahorcado {
        public static void main(String[] args) throws Exception {

            //clase scanner que nos permite que el usuario escriba
            Scanner scanner = new Scanner(System.in);
            //declaraciones y asignaciones
            String palabraSecreta ="inteligencia";
            int intentosMaximos=10; 
            int intentos = 0;

            boolean palabraAdivinada =false;

            //Arreglos
            char[] letrasAdivinadas = new char [palabraSecreta.length()];
            //estructura de control de tipo iterativa (bucle)
            for(int i=0; i<letrasAdivinadas.length;i++){
                letrasAdivinadas[i] = '_';
            
            }
                //es para seguir los intentos hasta que se termine la palabra
            while(!palabraAdivinada && intentos < intentosMaximos){ //esto se usa cuando tenemos una palabra o array de char

               System.out.println("palabra a adivinar " + String.valueOf(letrasAdivinadas) + " ("+ palabraSecreta.length()+ "letras)");//no es lo mismo un string a un char.aca se forma el string y se puede comparar con equals
                //valueOf:string 
               System.out.println("introduce una letra");
               //se espera la letra, scaner devuelve un string, charAt es un metodo de string que devuelve la primera letra que se escribe
               //se usa la clase scaner para medir una letra
               //char letra = scanner.next().charAt(0);

                //metodo para evitar problemas en caso que escriba en mayusculas
                char letra = Character.toLowerCase(scanner.next().charAt(0));

               boolean letraCorrecta=false;

               for(int i=0; i <palabraSecreta.length();i++){
                //estructura de control condicional
                //charat los que hace es recorrer la palabra letra por letra.
                if(palabraSecreta.charAt(i)== letra)
                {
                    // este metodo es para verificar si coincide la letra ingresada con la que se debe adivinar.
                    //tambien evita descontar los intentos ya que devuelve true
                    letrasAdivinadas[i]= letra;
                    letraCorrecta =true;
                    //si coiciden las latras en mas de una ocacion, esto reemplaza las hacertadas 
                }
               }

               if(!letraCorrecta){
               intentos++;
               System.out.println("incorrecto; te quedan"+(intentosMaximos - intentos)+"intentos");

               }
               //equals, esto dice si un string es igual a otro , lo que hace es comparar las palabras adivinadas. 
               if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada=true;
                System.out.println("has adivinado " + palabraSecreta);
               }
                


            }
            //en caso de no adivinar la palabra sale del while 
            if(!palabraAdivinada){
            System.out.println("perdiste");

            }
            scanner.close();


    }
}
