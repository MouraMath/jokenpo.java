import java.util.Scanner;

class Jokenpo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int jogador = 0, maquina = 0, rodadas = 0;


        System.out.println("Bem-vindo a batalha do armagedom");
        System.out.println("A humanidade precisa da tua ajuda para derrotar a Skynet");
        System.out.println("Vença uma melhor de 3 em partidas jokenpo para nos salvar");
        System.out.println("Contamos contigo. Boa sorte!");



        /*na descrição dizia primeiro "melhor de 3", e depois "vencer 3 partidas"
        acabei fazendo uma melhor de 3, quem tiver mais vitórias dentro de 3 rodadas é o vencedor */

        while (rodadas<3) {

            System.out.print("Selecione: Pedra(1), Papel(2) ou Tesoura(3)");
            String jogada = in.nextLine();


                if (!jogada.equals("1") && !jogada.equals("2") && !jogada.equals("3")) {

                    System.out.println("Selecione uma opção válida");

                } else {


                    int rand = (int) (Math.random() * 3 +1);


                    String Skynet = "";
                    if (rand == 1) {
                        Skynet = "Pedra";
                    } else if (rand == 2) {
                        Skynet = "Papel";
                    } else {
                        Skynet = "Tesoura";
                    }
                    System.out.println("Skynet joga: " + Skynet);


                    if (jogada.equals("1") && Skynet.equals("Pedra") || jogada.equals("2") && Skynet.equals("Papel") || jogada.equals("3") && Skynet.equals("Tesoura")) {
                        System.out.println("\nA rodada empatou");
                        rodadas++;
                        System.out.println("Placar - Jogador: " +jogador + " Máquina: " + maquina);

                    } else if ((jogada.equals("1") && Skynet.equals("Tesoura")) || (jogada.equals("3") && Skynet.equals("Papel")) || (jogada.equals("2") && Skynet.equals("Pedra"))) {
                        System.out.println("\nVencemos a rodada. Há esperança para a humanidade");
                        jogador++;
                        rodadas++;
                        System.out.println("Placar - Jogador: " +jogador + " Máquina: " + maquina);

                    } else {
                        System.out.println("\nPerdemos a rodada :( Precisamos resistir.");
                        maquina++;
                        rodadas++;
                        System.out.println("Placar - Jogador: " +jogador + " Máquina: " + maquina);
                    }

                }
            }

            if(jogador>maquina){
                System.out.println("Resistimos! A humanidade prevaleceu! Obrigado por nos salvar!");
            }
            else if (jogador<maquina){
                System.out.println("A Skynet infelizmente venceu. A humanidade foi extinta.");
            }
            else{
                System.out.println("O jogo empatou. A guerra contra as máquinas ainda não chegou ao fim.");
            }

            System.out.println("Obrigado pelos serviços prestados em batalha!");

    }
}