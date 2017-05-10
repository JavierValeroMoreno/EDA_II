import java.io.*;

public class Divide_Y_Venceras{
    
    private class Fabrica{

        public String calle;
        public String avenida;
        public double caudal;
        public double [] contaminantes;

        public Fabrica(String calle, String avenida, double caudal, double [] contaminantes){

            this.calle = calle;
            this.avenida = avenida;
            this.contaminantes = contaminantes;
            this.caudal = caudal;

        }

        public double getCaudal(){
            return this.caudal;
        }
        public double [] getContaminantes(){
            return this.contaminantes;
        }

    }
    private class Sensor{

        public String calle;
        public String avenida;
        public Fabrica left;
        public Fabrica right;
        public double caudalA;
        public double[] contaminantesA;

        public Sensor(Sensor s, String calle, String avenida){
            this.caudalA = s.getCaudalT();
            this.contaminantesA = s.getContaminantesT();
            this.avenida = avenida;
            this.calle = calle;
        }
        public Sensor(String calle, String avenida){
            this.calle = calle;
            this.avenida = avenida;
            this.caudalA = 0.0;
        }
        public void setFabricaL(Fabrica f){
            this.left = f;  
            double[] aux = f.getContaminantes();

            if(contaminantes != null)
                for(int i = 0; i < this.contaminantesA.length; i++ )
                    contaminantesA[i] += aux[i];
            else
                contaminantesA = aux;
            
        }
        public void setFabricaR(Fabrica f){
            this.right = f;
            double[] aux = f.getContaminantes();

            if(contaminantes != null)
                for(int i = 0; i < this.contaminantesA.length; i++ )
                    contaminantesA[i] += aux[i];
            else
                contaminantesA = aux;
        }
    }
}