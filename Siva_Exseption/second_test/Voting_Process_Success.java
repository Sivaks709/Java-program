package second_test;

public class Voting_Process_Success extends Exception {
    @Override
    public String getMessage() {
        return "You Are Votted...";
    }
}

class Voting_Process_Failed extends Exception {
    @Override
    public String getMessage() {
        return "Get Lost...";

    }
}