
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    // instance variables - replace the example below with your own
    private float temperatura;
    private float minimo;
    private float maximo; 
    private float incremento;
    private float temperaturaMin;
    private float temperaturaMax;
    private int cantVecesTemperatura;
    private int cantTemperatura;
    
    public AireAcondicionado(float minimoDe, float maximoDe){
        temperatura = 15.0f;
        incremento = 3.0f;
        minimo = minimoDe;
        maximo = maximoDe;
        temperaturaMax = temperatura;
        temperaturaMin = temperatura;
        cantVecesTemperatura = 0;
        cantTemperatura = 0;
    }

    public void subirTemperatura(){
        if (maximo>=(temperatura+incremento)){
            temperatura = temperatura + incremento;
            if (temperatura > temperaturaMax){
                temperaturaMax = temperatura;
            }
            cantTemperatura += 1;
        }
       else {
        temperatura = maximo;
       }
       cantVecesTemperatura += 1;
    }
    
    public void bajarTemperatura(){
       if (minimo<=(temperatura-incremento)){
            temperatura = temperatura - incremento;
            if (temperatura < temperaturaMin){
                temperaturaMin = temperatura;
            }
            cantTemperatura += 1;
       }
       else {
        temperatura = minimo;
       }
       cantVecesTemperatura += 1;
    }
    
    public float getTemperatura(){
        return temperatura;
    }
    
    public float setIncremento(float incrementoDe){
        if (incrementoDe>0){
            incremento = incrementoDe;
        }
        return incremento;
    }
    
    public void imprimirInformacion(){
        System.out.println("Temperatura actual: " +temperatura+"º"); 
        System.out.println("Temp. máxima posible: "+ maximo+"º");
        System.out.println("Temp. minima posible: "+ minimo+"º");
        System.out.println("Temp. máxima seleccionada desde el arranque: "+ temperaturaMax +"º");
        System.out.println("Temp. minima seleccionada desde el arranque: "+ temperaturaMin +"º");
        System.out.println(cantVecesTemperatura+" intentos de cambio de temperatura ("+cantTemperatura+" cambios llevados a cabo realmente)");
    }
    
    public String getInformacion(){
        return ("Temperatura actual: " +temperatura+"º" +"Temp. máxima posible: "+ maximo+"º" + ", Temp. máxima posible: "+ minimo+"º" + ", Temp. máxima seleccionada desde el arranque: "+ temperaturaMax +"º" + ", Temp. minima seleccionada desde el arranque: "+ temperaturaMin +"º" +", " + cantVecesTemperatura+" intentos de cambio de temperatura ("+cantTemperatura+" cambios llevados a cabo realmente");
    }
}