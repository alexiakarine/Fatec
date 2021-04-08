package classes;
public class Caneta {
    
    public String modelo;
    private String ponta;
    public boolean tampada;
    private String cor;
    
      
   // public Caneta(){ ___CONSTRUTOR 1
    //    this.tampar();
    //    this.cor = "Azul";
   // }
    
    public Caneta(String m, String c, String p)
    {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getPonta(){
        return this.ponta;
    }
    public void setPonta(String p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
        public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.print("Sobre a Caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("A cor da caneta é : " + this.cor);
        System.out.println("A caneta está pronta para uso " + this.tampada);
        
    }
}

