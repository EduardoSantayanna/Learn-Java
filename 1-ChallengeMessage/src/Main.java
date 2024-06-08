public class Main {
    public static void main(String[] args) {
// Passando uma string como argumento

        String message1 = ChallengeMessage.getMessage("Esta é uma mensagem de teste.");
        System.out.println(message1);  // Saída: Outra mensagem de teste.


// Passando um Integer como argumento
        String message2 = ChallengeMessage.getMessage(123);
        System.out.println(message2);
// Saída: Somente String! Hello world!


// Passando um objeto null como argumento
        String message3 = ChallengeMessage.getMessage(null);
        System.out.println(message3);  // Saída: Somente String! Hello world!

        // Exemplo 4: Passando uma variável String como argumento
        String inputMessage = "Outra mensagem de teste.";
        String message4 = ChallengeMessage.getMessage(inputMessage);
        System.out.println(message4);  // Saída: Outra mensagem de teste.

    }
}