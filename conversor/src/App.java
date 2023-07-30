import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Object [] options = {"Convertir Divisas","Convertir Temperatura","Salir"};

        int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer?", "Conversor",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null,options,options[0]);
         if (elige==2){

            JOptionPane.showMessageDialog(null,"Programa Cerrado");
            System.exit(0);

         }
         if(elige==0){
            boolean continuarPrograma=true;           
            while(continuarPrograma){
                 DecimalFormat formatearDivisa = new DecimalFormat("#.##");
                String [] opciones= {"Colones a Euros","Colones a Dolares", "Colones a Libras Esterlinas","Colones a Yen", "Colones a Wong" };

                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String imput = JOptionPane.showInputDialog(null,"Ingrese Cantidad de Colones");
                double colones;
                
                try{

                    colones = Double.parseDouble(imput);
                    }catch (NumberFormatException e){

                     JOptionPane.showMessageDialog(null, "Valor no valido");
                     return;
                     }

                     if(cambio.equals("Colones a Euros")){
                        double euros = colones/593.90;
                        JOptionPane.showMessageDialog(null, colones + "Colones Costarricenses son: " + formatearDivisa.format(euros) + "Euros. ");
                        }
                        else if(cambio.equals("Colones a Dolares")){
                        double dolares = colones/538.12;
                        JOptionPane.showMessageDialog(null, colones + "Colones Costarricenses son: " + formatearDivisa.format(dolares) + "Dolares. ");
                        }
                        else if(cambio.equals("Colones a Libras Esterlinas")){
                        double Libras = colones/691.27;
                        JOptionPane.showMessageDialog(null, colones + "Colones Costarricenses son: " + formatearDivisa.format(Libras) + "Libras Esterlinas. ");
                        }
                        else if(cambio.equals("Colones a Yen")){
                        double Yen = colones/3.81;
                        JOptionPane.showMessageDialog(null, colones + "Colones Costarricenses son: " + formatearDivisa.format(Yen) + "Yenes. ");
                        }
                        else if(cambio.equals("Colones a Wong")){
                        double Wong = colones/0.42;
                        JOptionPane.showMessageDialog(null, colones + "Colones Costarricenses son: " + formatearDivisa.format(Wong) + "Wongs. ");
                        }

               int confirma = JOptionPane.showConfirmDialog(null,"Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                        if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){

                            continuarPrograma = false;
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        }         

            }

            
        
         }

         if (elige == 1){
            Boolean seguirPrograma = true;
            while(seguirPrograma){
                String [] opciones = {"Celsius a Fahrenheit","Fahrenheit a Celsius"};

                int opcion = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");



                //String cambio = (String) JOptionPane.showInputDialog(null,"elija una opcion", "Conversor de temperatura",
                //JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
               // String valorNominal = JOptionPane.showInputDialog(null,"Ingrese valor a convertir");
                double valor = 0.0;
                try{
                    valor = Double.parseDouble(valorStr);

                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Valor no valido");
                    System.exit(0);}

                
                 double resultado = 0;
                
                
                 if(opcion == 0){
                  resultado = (valor*9/5)+32;
                 JOptionPane.showMessageDialog(null, valor + "Grados Celsius son: " + resultado + "Grados Ferenheid");

                 }else if(opcion == 1){
                    resultado = (valor -32)*5 / 9;
                JOptionPane.showMessageDialog(null, valor + "Grados Farenheid son: " + resultado + "Grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog( null,"Desea seguir usando el programa","",JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }

            }


         }
        

    }
}
