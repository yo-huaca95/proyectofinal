package Modelo.vo;

public class Requerimiento_3 {

    public String Proveedor, Pagado, Constructora;
    
    
    public Requerimiento_3() {
    }
    
    
    public Requerimiento_3(String proveedor, String pagado) {
        Proveedor = proveedor;
        Pagado = pagado;
    }
    
    
    public String getProveedor() {
        return Proveedor;
    }
    
    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }
    
    public String getPagado() {
        return Pagado;
    }
    
    public void setPagado(String pagado) {
        Pagado = pagado;
    }
    
    public String getConstructora() {
        return Constructora;
    }
    
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    
    
    }
