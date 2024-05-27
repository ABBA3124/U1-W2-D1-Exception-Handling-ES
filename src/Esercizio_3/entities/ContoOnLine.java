package Esercizio_3.entities;


public class ContoOnLine extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public double getMaxPrelievo() {
        return maxPrelievo;
    }

    public void setMaxPrelievo(double maxPrelievo) {
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + " - Saldo " + getSaldo() + " - Num Movimenti: " + getnMovimenti()
                + " - Massimo movimenti: 50 Massimo prelievo possibile: " + getMaxPrelievo());
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > this.getMaxPrelievo()) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(x);
    }
}



