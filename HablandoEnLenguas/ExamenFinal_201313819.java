import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileReader;
 import java.io.IOException;
 import java.io.PrintWriter;
 
 public class ExamenFinal_201313819 {
   static File Archivo;
   static File Salida;
   static String textoentrada;
 
    public static void main(String[] args) {
   	Archivo = new File(args[0]);
          String[] ar;
          ar = args[0].split(".txt");
          textoentrada = ar[0];
          Salida = new File(textoentrada +"_201313819.txt");
     		ExamenFinal_201313819.Lectura();
     		System.out.println();
     		System.out.println("Directorio de Salida: " + Salida.getPath());
     }
  
     public static void Lectura(){
        	try{
              FileReader FileReader = new FileReader(Archivo);
             BufferedReader BufferedReader = new BufferedReader(FileReader);
              PrintWriter Imprimir = new PrintWriter(Salida);
  
              int numerolineas = Integer.parseInt(BufferedReader.readLine());
              
              Imprimir.println("Documento Traducido");
              Imprimir.println();
  // Se procede a traducir el texto utilizando la codificacion descubierta
              for(int i = 0; i < numerolineas; i++){
			  //String linea separa por linea el texto
                  String linea = BufferedReader.readLine();
				  //String Palabra separa por palabras la linea 
                  String[] Palabra = linea.split(" ");
                  Imprimir.print("Caso #" + (i+1) + ":\t");
                  for (int j = 0; j < Palabra.length; j++) {
                      char[] Letras = Palabra[j].toCharArray();
                      for(int k = 0; k < Letras.length; k++){
					  switch(Letras[k]){
				
					    case 'a':
					  Letras[k] = 'y';
					  break;
                              
                        case 'b':
                              Letras[k] = 'h';
                          break;
						  case 'c':
                              Letras[k] = 'e';
                          break;
						  
						 case 'd':
						 Letras[k]='s';
                          break;
						  case 'e':
                              Letras[k] = 'o';
                          break;
						  case 'f':
                              Letras[k] = 'c';
                          break;
						  case 'g':
                              Letras[k] = 'v';
                          break;
						  case 'h':
                              Letras[k] = 'x';
                          break;
						  case 'i':
                              Letras[k] = 'd';
                          break;
						  case 'j':
                              Letras[k] = 'u';
                          break;
						  case 'k':
                              Letras[k] = 'i';
                          break;
						  case 'l':
                              Letras[k] = 'g';
                          break;
						  case 'm':
                              Letras[k] = 'l';
                          break;
						  case 'n':
                              Letras[k] = 'b';
                          break;
						  case 'o':
                              Letras[k] = 'k';
                          break;
						  case 'p':
                              Letras[k] = 'r';
                          break;
						  case 'q':
                              Letras[k] = 'z';
                          break;
						  case 'r':
                              Letras[k] = 't';
                          break;
						  case 's':
                              Letras[k] = 'n';
                          break;
						  case 't':
                              Letras[k] = 'w';
                          break;
						  case 'u':
                              Letras[k] = 'j';
                          break;
						  case 'v':
                              Letras[k] = 'p';
                          break;
						  case 'w':
                              Letras[k] = 'f';
                          break;
						  case 'x':
                              Letras[k] = 'm';
                          break;
						  case 'y':
                              Letras[k] = 'a';
                          break;
						  case 'z':
                              Letras[k] = 'q';
					  break;
					  default:
					  Imprimir.print("error de traduccion");
					  break;
					  
					  }
                         
 
                       
                         Imprimir.print(Letras[k]);
                   }
                  
                     Imprimir.print(" ");
                 }
            
                 Imprimir.println();
            }
             Imprimir.close();
           }catch(FileNotFoundException e){
		   System.out.println("Archivo no Encontrado");
         }catch(IOException ex){
         }
    }
 }
