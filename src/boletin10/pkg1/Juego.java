package boletin10.pkg1;

import javax.swing.JOptionPane;

public class Juego {
    public void pregunta(){
        int numcorrecto=0;
        do{
        numcorrecto=Integer.parseInt(JOptionPane.showInputDialog("Numero a adivinar:"));
        }while(numcorrecto>1 && numcorrecto>50);
        int x=Integer.parseInt(JOptionPane.showInputDialog("Numero de Intentos"));
        
        for(int i=0;i<x;i++){
        int numadiv=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        if(numadiv<numcorrecto){
            JOptionPane.showMessageDialog(null,"El numero es menor");
        }
        else if(numadiv>numcorrecto){
            JOptionPane.showMessageDialog(null,"El numero es mayor");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero correcto!!");
            break; 
            }
        
            }
    
    }}
