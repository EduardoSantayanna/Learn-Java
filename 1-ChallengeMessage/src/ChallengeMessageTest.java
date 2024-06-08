import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeMessageTest {
    @Test
    public void testMessage() throws Exception {
        // Chama o método getMessage() da classe ChallengeMessage
        String message = ChallengeMessage.getMessage("hello world!");

        // Verifica se a mensagem retornada é "hello world!"
        assertEquals("hello world!", message);
    }

    @Test
    public void testIntegerAsString() throws Exception {
        // Teste com um número passado como uma String
        String message = ChallengeMessage.getMessage("1");

        // Verifica se o número "1" é tratado como uma String
        assertEquals("1", message);
    }

    @Test
    public void testNumberIntegerAsString() throws Exception {
        // Teste com um inteiro passado como uma String
        String message10 = ChallengeMessage.getMessage(10);

        // o inteiro "10" não passa, devolvendo uma String padrão
        assertEquals("Somente String! Hello world!", message10);
    }
}
