package giochi;

public class Carta{
  private int seme;//da 0 a 3
  private int valore;//da 1 a 10
  
  public Carta(int s, int v){
    if(v<1 || v>10)
      throw new RuntimeException("Valore non valido!");
    if(s<0 || s>3)
      throw new RuntimeException("Seme non valido!");
    this.seme = s;
    this.valore = v;
  }
  
  public int getValore(){
    return valore;
  }
  
  public int getSeme(){
    return seme;
  }
  
  private String getNomeSeme(){
    switch(seme){
      case 0: return "Denari";
      case 1: return "Spade";
      case 2: return "Coppe";
      case 3: return "Bastoni";
      default: return "Seme non valido";
    }
  }
  
  public String toString(){
    return valore+" "+getNomeSeme();
  }
  
  public static void main(String[] args){
    Carta c = new Carta(0,5);
    System.out.println(c);
  }
}
