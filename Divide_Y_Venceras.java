package EDA_II;

import EDA_II.Construccion;
import java.io.*;
import java.util.ArrayList;

public class Divide_Y_Venceras{

    public ArrayList<Sensor> ciudad;

    public void cargarArchivo(String fichero){

    }

    public Divide_Y_Venceras(String fichero){
       cargarArchivo(fichero);
    }

    public void metodoDivideyVenceras(){

        

    }
    
    private double calcFlujo(double caudal, double contaminante){
        return contaminante/caudal;
    }
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
        public void setConstruccionL(T parametro){

            if(typeof(parametro) == Fabrica)
                if(parametro.calle != this.calle && parametro.avenida != this.avenida)
                            throw new RuntimeException();
            
            if(parametro == null)
                throw new NullPointerException();
            this.left = parametro;  
            double[] aux = (typeof(parametro) == Fabrica)? parametro.getContaminantes: parametro.get(0).getContaminantes ;

            if(contaminantes != null)
                for(int i = 0; i < this.contaminantes.length; i++ )
                    contaminantes[i] += aux[i];
            else
                contaminantes = aux;
            caudal +=(typeof(parametro) == Fabrica)? parametro.getCaudal() : parametro.get(0).getCaudal();
            
        }

        public void setConstruccionR(T parametro){
            if(typeof(parametro) == Fabrica)
                if(parametro.calle != (this.calle + 1.0) && parametro.avenida != this.avenida)
                    throw new RuntimeException();
            if(parametro == null)
                throw new NullPointerException();
            this.right = parametro;
            double[] aux (typeof(parametro) == Fabrica)? parametro.getContaminantes() : parametro.get(0).getContaminantes();

            if(contaminantes != null)
                for(int i = 0; i < this.contaminantes.length; i++ )
                     contaminantes[i] += aux[i];
            else
                contaminantes = aux;
            caudal +=(typeof(parametro) == Fabrica)? parametro.getCaudal() : parametro.get(0).getCaudal();
        }
         
    } 
}