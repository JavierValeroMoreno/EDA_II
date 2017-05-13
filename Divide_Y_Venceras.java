package EDA_II;

import EDA_II.Construccion;
import java.io.*;
import java.util.ArrayList;

public class Divide_Y_Venceras{
    
    private class Fabrica extends Construccion{

        public Fabrica(String calle, String avenida,char orienacion, double caudal, double [] contaminantes){

            super(calle,avenida,orienacion);
            this.caudal = caudal;
            this.contaminantes = contaminantes;

        }
    }
    private class Sensor <T> extends Construccion{

       
        public T left;
        public T right;

        public Sensor <T>(String calle, String avenida, char orienacion){
            super(calle,avenida,orientacion);

        }

        public setSensor(Sensor s){
            if (s == null)
                throw new NullPointerException();
            double [] aux = s.getContaminantes();
            if(contaminantes != null)
                for(int i = 0; i < this.contaminantes.length; i++ )
                    f.contaminantes[i] += aux[i];
            else
                contaminantes = aux;
            caudalA += s.getCaudal();
        }
        public void setFabricaL(Fabrica f){

            if(f.calle != this.calle && f.avenida != this.avenida)
                throw new RuntimeException();
            if(f == null)
                throw new NullPointerException();
            this.left = f;  
            double[] aux = f.getContaminantes();

            if(contaminantes != null)
                for(int i = 0; i < this.contaminantes.length; i++ )
                    f.contaminantes[i] += aux[i];
            else
                contaminantes = aux;
            caudal += f.getCaudal();
            
        }
   
        public void setFabricaR(Fabrica f){
            if(f.calle != (this.calle + 1.0) && f.avenida != this.avenida)
                throw new RuntimeException();
            if(f == null)
                throw new NullPointerException();
            this.right = f;
            double[] aux = f.getContaminantes();

            if(contaminantes != null)
                for(int i = 0; i < this.contaminantes.length; i++ )
                    contaminantes[i] += aux[i];
            else
                contaminantes = aux;
            caudal += f.getCaudal();
        }
      
        
    } 
}