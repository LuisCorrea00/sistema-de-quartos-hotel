import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Quarto[] quartos = new Quarto[100];
        int index = 0;
        char opcao;
        boolean encerrar = false;
        System.out.println("HOTEL BOM DESCANSO");
        do {
            System.out.println("[A] Criar Quarto");
            System.out.println("[B] Listar Quartos");
            System.out.println("[C] Manter Quarto");
            System.out.println("[D] Encerrar");
            System.out.println("Informe a opção desejada:");
            opcao = ler.next().charAt(0);
            switch (opcao){
                case 'a','A' -> {
                    quartos[index] = new Quarto();
                    System.out.print("Informe o número do quarto: ");
                    int numQuarto = ler.nextInt();
                    quartos[index].setNumQuarto(numQuarto);
                    System.out.print("Informe o número do andar: ");
                    int andar = ler.nextInt();
                    quartos[index].setAndar(andar);
                    System.out.print("Informe a capacidade do quarto: ");
                    int capacidade = ler.nextInt();
                    quartos[index].setCapacidade(capacidade);
                    System.out.print("Informe o número de leitos do quarto: ");
                    int leitos = ler.nextInt();
                    quartos[index].setLeitos(leitos);
                    System.out.println("Informe se o quarto possui vista [0] não [1] sim: ");
                    int vista = ler.nextInt();
                    quartos[index].setVista(vista);
                    quartos[index].setOcupado(false);
                    quartos[index].setLimpo(true);
                    index++;
                }
                case 'b','B' -> {
                    if (index == 0){
                        System.out.println("Nenhum quarto criado");
                        break;
                    }
                    int opcao2;
                    System.out.println("Ver todos os quartos [1]: ");
                    System.out.println("Ver todos quartos ocupados [2]: ");
                    System.out.println("Ver todos quartos livres [3]: ");
                    System.out.println("Ver todos quartos aguardando limpeza [4]: ");
                    System.out.println("Informe a opção desejada: ");
                    opcao2 = ler.nextInt();
                    switch (opcao2){
                        case 1 -> {
                            for (int i = 0; i<index; i++){
                                System.out.println("Número: "+quartos[i].getNumQuarto());
                                System.out.println("Andar: "+quartos[i].getAndar());
                                System.out.println("Capacidade: "+quartos[i].getCapacidade());
                                System.out.println("Leitos: "+quartos[i].getLeitos());
                                System.out.println("Vista: "+quartos[i].isVista());
                                System.out.println("Ocupado: "+quartos[i].isOcupado());
                                System.out.println("Limpo: "+quartos[i].isLimpo());
                                System.out.println();
                            }
                        }
                        case 2 -> {
                            for (int i = 0; i<index; i++){
                                if (quartos[i].isOcupado() && quartos[i].isLimpo()){
                                    System.out.println("Número: "+quartos[i].getNumQuarto());
                                    System.out.println("Andar: "+quartos[i].getAndar());
                                    System.out.println("Capacidade: "+quartos[i].getCapacidade());
                                    System.out.println("Leitos: "+quartos[i].getLeitos());
                                    System.out.println("Vista: "+quartos[i].isVista());
                                    System.out.println("Ocupado: "+quartos[i].isOcupado());
                                    System.out.println("Limpo: "+quartos[i].isLimpo());
                                    System.out.println();
                                }
                            }
                        }
                        case 3 -> {
                            for (int i = 0; i<index; i++){
                                if (!quartos[i].isOcupado()){
                                    System.out.println("Número: "+quartos[i].getNumQuarto());
                                    System.out.println("Andar: "+quartos[i].getAndar());
                                    System.out.println("Capacidade: "+quartos[i].getCapacidade());
                                    System.out.println("Leitos: "+quartos[i].getLeitos());
                                    System.out.println("Vista: "+quartos[i].isVista());
                                    System.out.println("Ocupado: "+quartos[i].isOcupado());
                                    System.out.println("Limpo: "+quartos[i].isLimpo());
                                    System.out.println();
                                }
                            }
                        }
                        case 4 -> {
                            for (int i = 0; i<index; i++){
                                if (quartos[i].isLimpo()){
                                    System.out.println("Número: "+quartos[i].getNumQuarto());
                                    System.out.println("Andar: "+quartos[i].getAndar());
                                    System.out.println("Capacidade: "+quartos[i].getCapacidade());
                                    System.out.println("Leitos: "+quartos[i].getLeitos());
                                    System.out.println("Vista: "+quartos[i].isVista());
                                    System.out.println("Ocupado: "+quartos[i].isOcupado());
                                    System.out.println("Limpo: "+quartos[i].isLimpo());
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
                case 'c','C' -> {
                    System.out.print("Informe o número do quarto: ");
                    int num = ler.nextInt();
                    System.out.println("Definir ocupado [1]: ");
                    System.out.println("Definir liberado [2]: ");
                    System.out.println("Definir limpo [3]: ");
                    int opcao2 = ler.nextInt();
                    int selected = 0;
                    for (int i = 0; i<index;i++){
                        if (quartos[i].numQuarto == num){
                            selected = i;
                        }
                    }
                    switch (opcao2){
                        case 1 -> {
                            quartos[selected].setOcupado(true);
                            System.out.println("Quarto definido como ocupado!");
                        }
                        case 2 -> {
                            quartos[selected].setOcupado(false);
                            quartos[selected].setLimpo(false);
                        }
                        case 3 -> {
                            quartos[selected].setLimpo(true);
                        }
                    }

                }
                case 'd','D' -> {
                    System.out.println("Encerrando...");
                    encerrar = true;
                }
            }
        }while(!encerrar && index < 100);
    }
}