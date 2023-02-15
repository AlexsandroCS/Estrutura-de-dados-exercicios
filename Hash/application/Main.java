import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        verifiedVote("Alexsandro");
        verifiedVote("Joaquim");

        verifiedVote("Alexsandro");
        verifiedVote("Joaquim");

        verifiedVote("Camila");
    }

    private static Map<String,Boolean> vote = new HashMap<>();

    private static void verifiedVote(String name){
        if (vote.containsKey(name)){
            System.out.println("Você já votou!");
            System.out.println("You have already voted!\n");
        }
        else {
            vote.put(name,true);
            System.out.println("Você acabou de finalizar seu voto!");
            System.out.println("You have finalized your vote!\n");
        }
    }
}