
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
    
    public AireAcondicionado()
    {
        temperatura = 15.0f;
    }

    public void subirTemperatura (){
        temperatura = temperatura + 5;
    }
    
    public void bajarTemperatura (){
        temperatura = temperatura - 5;
    }

    public float getTemperatura (){
        return temperatura;
    }
    
}
