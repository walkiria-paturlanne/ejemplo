
/*
Atributos: 
String: patente, marca, modelo
Int: añoPatentamiento, cantPuertas, precio
Sets y Gets
Metodos específicos: 
Calcular antiguedad (int)
Calcular Costo de Transferencia (float)
Calcular Comisión vendedor (float)

*/

package consecionaria;


public class Vehiculo {
    
    private String patente, marca, modelo;
    private int añoPatentamiento, cantPuertas ;
    private float precio;
    
    
    public Vehiculo()
    {
         
        patente = marca = modelo = "";
        añoPatentamiento = cantPuertas  = 0;
        precio = 0.0f;
    
    
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoPatentamiento() {
        return añoPatentamiento;
    }

    public void setAñoPatentamiento(int añoPatentamiento) {
        this.añoPatentamiento = añoPatentamiento;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Ahora los métodos
    
    public int calcularAntiguedad()
    {
       int añoActual = 2020;
       int antiguedad;
       antiguedad = añoActual - añoPatentamiento;
       return antiguedad;
    
    }
    
    public float calcularCostoTransferencia()
    { 
     // Para vehículos de menos 5 años será el 5% del valor más
     //un fijo de $3.500
      float costoTransferencia;
      if (calcularAntiguedad() < 5) 
      { costoTransferencia = precio * 0.05f + 3500 ;}
      // para Vehículos de entre 5 y 20 años será el 4% del valor más un
      //fijo de $3.000
      else
      {
          if ( calcularAntiguedad() >=5 && calcularAntiguedad() <20 )
            { costoTransferencia = precio * 0.04f + 3000 ;}  
            //para vehículos de más de 20 años solo se paga una tasa de $2.500 
             else 
            { costoTransferencia = 2500;}
      }
      return costoTransferencia;
    
    }
    
    public float calcularComision()
    {
       // Es el 2% del valor del vehículo con un mínimo de $4000
       //de comisión
        float comision;
        comision = precio * 0.2f;
        //en esta parte estoy dudando si se valida que sea una comision
        //minima de 4000 con un While
        return comision;
    
    }
    
  
}  //Fin de clase
