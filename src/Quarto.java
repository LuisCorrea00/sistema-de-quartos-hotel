public class Quarto {
    int numQuarto, andar, capacidade, leitos;
    boolean vista, limpo, ocupado;

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getLeitos() {
        return leitos;
    }

    public void setLeitos(int leitos) {
        this.leitos = leitos;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(int opcao) {
        if (opcao == 0 ){
            this.vista = false;
        }
        else this.vista = true;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
