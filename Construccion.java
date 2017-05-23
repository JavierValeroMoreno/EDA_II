package EDA_II;

public class Construccion{
	
	    public String calle;
        public String avenida;
        public char orienacion;
        public double caudal = 0.0;
        public double [] contaminantes;

        public Construccion(String calle, String avenida, char orienacion){

            this.calle = calle;
            this.avenida = avenida;
            this.contaminantes = contaminantes;
        
        }
        public double getCaudal(){
            return this.caudal;
        }
        public double [] getContaminantes(){
            return this.contaminantes;
        }
}