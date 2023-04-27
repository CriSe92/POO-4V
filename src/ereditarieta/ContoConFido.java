package ereditarieta;

public class ContoConFido extends ContoBancario{
    private double fido = 1000;
    private double scoperto = 0;
    
    public ContoConFido(String numero){
      super(numero);
      //fido = 1000;
      //scoperto = 0;
    }
    
    public ContoConFido(String numero, double saldo) {
      super(numero,saldo);
      //fido = 1000;
      //scoperto= 0;
    }
    
    public ContoConFido(String numero, double saldo, double fido){
    	super(numero, saldo);
    	this.fido = fido;
    }
    
    @Override
    public void deposita(double quanto) {}
    
    
    @Override
    public boolean preleva(double quanto) {
    	System.out.println("Sono  dentro conto con fido");
      if(quanto<=saldo()){
        super.preleva(quanto);
      }else{
        if(quanto<=saldo()+fido-scoperto) {
          double residuo = quanto-saldo();
          super.preleva(saldo());
          scoperto = scoperto+residuo;
        }
      }
      return false;
    }
    
    
    @Override
    public String toString(){
      return super.toString()+" Fido: "+fido+" Scoperto: "+scoperto;
    }
    
    public double getFido(){
      return fido;
    }
    
    public double getScoperto(){
      return scoperto;
    }
    
    public void setFido(double fido){
      this.fido = fido;
    }
    
    public void setScoperto(double scoperto){
      this.scoperto = scoperto;
    }

}
