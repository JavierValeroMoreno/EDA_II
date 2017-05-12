import java.io.*;

public class Divide_Y_Venceras{
    
    private class Fabrica{

        public String calle;
        public String avenida;
        public char orienacion;
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
        public char orienacion;
        public Fabrica left;
        public Fabrica right;
        public double caudalA = 0.0;
        public double[] contaminantesA;

        public Sensor(Sensor s, String calle, String avenida, char orienacion){
            this.caudalA = s.getCaudalT();
            this.contaminantesA = s.getContaminantesT();
            this.avenida = avenida;
            this.calle = calle;
            this.orienacion = orienacion;
        }
        public Sensor(String calle, String avenida, char orienacion){
            this.calle = calle;
            this.avenida = avenida;
            this.orienacion = orienacion;
        }

        public setSensor(Sensor s){
            if (s == null)
                throw new NullPointerException();
            double [] aux = s.getContaminantesT();
            if(contaminantesA != null)
                for(int i = 0; i < this.contaminantesA.length; i++ )
                    f.contaminantesA[i] += aux[i];
            else
                contaminantesA = aux;
            caudalA += s.getCaudalT();
        }
        public void setFabricaL(Fabrica f){
            if(f.calle != this.calle && f.avenida != this.avenida)
                throw new RuntimeException();
            if(f == null)
                throw new NullPointerException();
            this.left = f;  
            double[] aux = f.getContaminantes();

            if(contaminantesA != null)
                for(int i = 0; i < this.contaminantesA.length; i++ )
                    f.contaminantesA[i] += aux[i];
            else
                contaminantesA = aux;
            caudalA += f.getCaudal();
            
        }
        public void setFabricaR(Fabrica f){
            if(f.calle != (this.calle + 1.0) && f.avenida != this.avenida)
                throw new RuntimeException();
            if(f == null)
                throw new NullPointerException();
            this.right = f;
            double[] aux = f.getContaminantes();

            if(contaminantesA != null)
                for(int i = 0; i < this.contaminantesA.length; i++ )
                    contaminantesA[i] += aux[i];
            else
                contaminantesA = aux;
            caudalA += f.getCaudal();
        }
        public double getCaudalT(){
            return this.caudalA;
        }
        public double[] getContaminantesT(){
            return this.contaminantesA;
        }
        
    } 
}