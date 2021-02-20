package game;

import java.util.Scanner;

public class JogoAssasino {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Você acorda... e se vê trancado em um quarto, no "
                + "qual você não consegue reconhecer...\nNão possuí nada nesse q"
                + "uarto, a não ser um urso de pelúcia... Após você apertar ele"
                + " ele começa a emitir um som, um ruído, que logo se torna uma "
                + "voz familiar, que diz:\n"
                + "-Bem-vindo a diversão querido amigo... Está pronto?\n"
                + "-As regras são simples, esse local possuí nove quartos, sendo "
                + "eles:");
        int a[] = new int[9], b = 0, turnos = 15, c, d = 0, s = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 3) + b + 1;
            b = b + 3;
            System.out.print(a[i] + " ; ");
        }
        System.out.println("\n-Então, você tem 15 minutos para sair desse local"
                + ", caso contrário, você ficara preso... a única maneira de se dar "
                + "bem nesse jogo, é seguindo as dicas!\n"
                + "-Bom... olhe seu braço, a primeira dica está nele, HAHAHA!\n"
                + "E o urso explode...");
        System.out.println("Ao olhar seu braço, você vê escrito nele:");

        while ((turnos > 0) && (s < 3)) {
            b = (int) (Math.random() * 9);
            c = (int) (Math.random() * 4);
            if (c == 0) {
                c = 1;
                while (a[b] > c) {
                    if (a[b] % c == 0) {
                        d = c;
                    }
                    c++;
                }
                if (d == 1) {
                    System.out.println("É somente divisível por ele mesmo");
                } else {

                    System.out.println("É divisivel por " + d);
                }
            } else if (c == 1) {
                if ((b != 0) && (b != 8)) {
                    c = a[b] + a[b - 1] - a[b + 1];
                    System.out.println("Somado com seu quarto antecessor e subtraido pelo sucessor resulta em " + c);
                } else {
                    c = 1;
                    while (a[b] > c) {
                        if (a[b] % c == 0) {
                            d = c;
                        }
                        c++;
                    }
                    if (d == 1) {
                        System.out.println("Somente divisível por ele mesmo");
                    } else {
                        System.out.println("Divisivel por " + d);
                    }

                }

            } else if (c == 2) {
                if (a[b] < 6) {
                    c = 3;
                } else if (a[b] < 11) {
                    c = 2;
                } else {
                    c = 1;
                }
                d = a[b];
                for (int i = 0; i < c; i++) {
                    d = d * a[b];
                }
                System.out.println("Elevado a determinado número se torna " + d);
            } else if (c == 3) {
                c = (int) (Math.random() * 2);
                if ((b != 8) && (c == 0) || (b == 0)) {
                    System.out.println("É " + (((double) 100 / a[b + 1]) * a[b] + "% do seu quarto sucessor"));
                } else if ((b != 0) && (c == 1) || (b == 9)) {
                    System.out.println("É " + (((double) 100 / a[b - 1]) * a[b] + "% do seu quarto antecesor"));

                }

            }
            while (turnos > 0) {
                System.out.println("Qual é o número do quarto?");
                c = ler.nextInt();
                if (c == a[b]) {
                    switch (s) {
                        case 0:
                            System.out.print("\nVocê entra no quarto, e logo avista uma bilhete no chão, então você lê:\n"
                                    + "PARABÉNS, achei que nem passaria dessa... Esse bilhete tem uma senha que será necessaria "
                                    + "vá para próximo quarto que, \n");
                            break;
                        case 1:
                            System.out.println("Você encontra um cofre, no canto da sala porém para poder abrir precissa da senha,"
                                    + " do bilhete... Mas percebe que bilhete tem uma charada:");
                            b = (int) (Math.random() * 5) + 1;
                            c = (int) (Math.random() * 5) + 2;

                            for (int i = 0; i < 5; i++) {
                                b = b + c;
                                c++;
                                if (i < 4) {
                                    System.out.print(b + " ; ");
                                } else {
                                    System.out.println("?");
                                }

                            }
                            while (turnos > 0) {
                                System.out.println("qual é o número (?)");
                                c = ler.nextInt();
                                if (c == b) {
                                    System.out.println("Você consegue abrir o cofre, e nele tem uma chave e um bilhete, que está escrito:"
                                            + "\nParece que chave encontrou, então uma fechadura achar ... o proxímo quarto a se chegar é:");
                                    break;
                                } else {
                                    System.out.println("Código incorreto!");
                                    turnos--;
                                    System.out.println("==================Tempo restante: " + turnos + " minutos==================");
                                    if (turnos < 1) {
                                        break;
                                    }

                                }

                            }

                            break;

                        case 2:
                            System.out.println("Você entra no quarto e avista um alçapão, então você abre com a chave... Pareçe"
                                    + " levar para uma sala subterânea");

                            break;

                    }
                    s++;
                    break;
                } else {
                    turnos--;
                    System.out.println("Você entra no quarto, e não vê nada além de poeira");
                    System.out.println("==================Tempo restante: " + turnos + " minutos==================");
                    if (turnos < 1) {
                        break;
                    }
                }
            }

        }
        int z, x, y;
        z = (int) (Math.random() * 5) + 1;
        x = (int) (Math.random() * 5) + 1;
        y = (int) (Math.random() * 5) + 1;
        System.out.println("Você encontra desce, e vê uma sala cheia de caixas, e escuta um bip.... é uma bomba, e para desarmar, é necessario insirir um código, na parede está escrito:");
            System.out.println("z+x+y= " + (z + x + y));
            System.out.println("E z/x= " + ((double) z / x));
        while (turnos > 0) {
            
            System.out.println("y+z-x?");
            z = ler.nextInt();
            if (z == (y + z - x)) {
                System.out.println("Você tenta o código.... E consegue desarmar a bomba!");
                System.out.println("Após passar tudo isso, após todo esse sufoco... A porta abre, e você consegue sair...");
                System.out.println("Parabens, você ganhou!");
                break;
            } else {
                System.out.println("O código está errado");
                turnos--;
                System.out.println("==================Tempo restante: " + turnos + " minutos==================");
            }

        }
        while (turnos < 1) {
            System.out.println("Você perdeu... o tempo acabou");
            break;
        }
    }

}
