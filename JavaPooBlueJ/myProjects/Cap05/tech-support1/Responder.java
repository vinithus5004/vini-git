import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1
 */
public class Responder
{
    private ArrayList<String> responses;
    private Random randomGenerator;
    /**
     * Constr�i uma respondente
     */
    public Responder()
    {
        responses = new ArrayList<String>();
        randomGenerator = new Random();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        // Seleciona um n�mero aleat�rio para o �ndice na lista de
        // respostas padr�o.
        // O n�mero estar� entre 0(inclusivo) e o tamanho da lista (exclusivo).
        int index = randomGenerator.nextInt(responses.size());
        
        return responses.get(index);
    }
    /**
     * Constr�i uma lista de respostas padr�o da qual podemos
     * selecionar uma se n�o soubermos mais o que dizer.
     */
    private void fillResponses()
    {
        responses.add("That sounds odd. Could you describe that problem in more detail?");
        responses.add("No other customer has ever complained about this before. \n" +
                      "What is your system configuration?");
        responses.add("That sounds interesting. Tell me more...");
        responses.add("I need a bit more information on that.");
        responses.add("Have you checked that you do not have a dll conflict?");
        responses.add("That is explained in the manual. Have you read the manual?");
        responses.add("Your description is a bit wishy-washy. Have you got an expert\n" +
                      "there with you who could describe this more precisely?");
        responses.add("That's not a bug, it's a feature!");
        responses.add("Could you elaborate on that?");
    }
}
