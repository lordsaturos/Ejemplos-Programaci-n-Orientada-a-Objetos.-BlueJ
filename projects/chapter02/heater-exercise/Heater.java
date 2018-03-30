
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double minTemperature, double maxTemperature)
    {
        // initialise instance variables
        temperature = 15;
        min = minTemperature;
        max = maxTemperature;
        increment = 5;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void warmer()
    {
        // put your code here
        if (temperature + increment <= max)
        {   
            temperature = temperature + increment;
        }
        else
        {
            System.out.println("La temperatur ha llegado al maximo.");
        }
        return;
    }

    public void cooler()
    {
        // put your code here
        if (temperature - increment >= min)
        {   
            temperature = temperature - increment;
        }
        else
        {
            System.out.println("La temperatur ha llegado al mínimo.");
        }
        return;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setIncrement(double nuevoIncremento)
    {
        if (nuevoIncremento > 0)
        {
            increment = nuevoIncremento;
        }
        else
        {
            System.out.println("El núevo incremento no puede ser negativo ni igual a 0.");
        }
        return;
    }
}