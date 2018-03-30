package console;


public class Console {
    private boolean ligar;
    private boolean tampaDoDisco;
    private boolean memoryCard;
    private boolean controle;
    
    public Console(){
        this.ligar = false;
        this.tampaDoDisco = false;
        this.memoryCard = false;
        this.controle = false;
    }
    
    Console console1;
       
    public boolean ligar1(){
          if(console1.isLigar()==false){
            // vai ligar
            console1.setLigar(true);
            }
                else if(console1.isLigar()==true){
                    // vai desligar
                    console1.setLigar(false);
                    return false;
                    }
        return true;
    }

   
    public boolean isLigar() {
        return ligar;
    }

   
    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    
    public boolean isTampaDoDisco() {
        return tampaDoDisco;
    }

    
    public void setTampaDoDisco(boolean tampaDoDisco) {
        this.tampaDoDisco = tampaDoDisco;
    }

    
    public boolean isMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(boolean memoryCard) {
        this.memoryCard = memoryCard;
    }

 
    public boolean isControle() {
        return controle;
    }

   
    public void setControle(boolean controle) {
        this.controle = controle;
    }
}