import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCount = new HashMap<>();
    private Map<String, Integer> sortedResults = new TreeMap<>();
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        sortedResults.putAll(voteCount);
        System.out.println("Sorted Results: " + sortedResults);
        System.out.println("Vote Order: " + voteOrder);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");
        vs.displayResults();
    }
}
