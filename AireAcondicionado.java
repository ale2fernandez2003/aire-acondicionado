
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
    
    public AireAcondicionado(float minimoDe, float maximoDe){
        temperatura = 15.0f;
        incremento = 3.0f;
        minimo = minimoDe;
        maximo = maximoDe;
    }

    public void subirTemperatura(){
        if (maximo<temperatura){
            System.out.println();
        }
        else {
            temperatura = temperatura + incremento;
        }
    }
    
    public void bajarTemperatura(){
       if (minimo<temperatura){
            System.out.println();
        }
        else {
            temperatura = temperatura - incremento;
        }
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
    
}
