
package ProyectoCalculadora;




public class Calculadora {
    //Atributos 
    private String digitos;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    
    
    //Constructor
    public Calculadora()
    {
        digitos= "";
        resultado= 0;
        suma= false;
        resta= false;
        multiplicacion= false;
        division= false;
        
    }

    public String getDigitos() {//obtiene el valor
        return digitos;
    }

    public void setDigitos(String digitos) {//coloca el valor del digito
        this.digitos = digitos;
    }
    
    public void agregarNum(int num)
    {
       setDigitos(digitos+num); 
    }
    public void suma(String num)
    {
        this.resultado= Double.parseDouble(num);
        suma= true;
        setDigitos("");
    }   
     public void resta(String num)
    {
        this.resultado= Double.parseDouble(num);
        resta= true;
        setDigitos("");
    }   
      public void multiplicacion(String num)
    {
        this.resultado= Double.parseDouble(num);
        multiplicacion= true;
        setDigitos("");
    }  
      public void division(String num)
    {
        this.resultado= Double.parseDouble(num);
        division= true;
        setDigitos("");
        
    }  
    public double calculo(String numero)
    {
        if(suma==true)
        {
            resultado=resultado + Double.parseDouble(numero);
        }
        if(resta==true)
        {
            resultado=resultado - Double.parseDouble(numero);
        }
     
        if(multiplicacion==true)
        {
            resultado=resultado * Double.parseDouble(numero);
        }
        
         if(division==true)
        {
            resultado=resultado / Double.parseDouble(numero);
        }
        
        //RETORNAR VALORES
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        //RETORNAR EL VALOR GENERADO
        return resultado;
    }

}