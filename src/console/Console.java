package console;

public class Console {

    private boolean isOn;
    private boolean tampaDoDisco;
    private boolean memoryCard;
    private boolean controle;

    public Console() {
        this.isOn = false;
        this.tampaDoDisco = false;
        this.memoryCard = false;
        this.controle = false;
    }

//    Console console1;
    public void Ligar() {

        setLigar(!IsOn());

//        if (IsOn() == false) {
//            // vai ligar
//            setLigar(true);
//        } else if (IsOn() == true) {
//            // vai desligar
//            setLigar(false);
//        }
    }

    public boolean IsOn() {
        return isOn;
    }

    public void setLigar(boolean ligar) {
        this.isOn = ligar;
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
