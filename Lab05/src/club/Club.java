public class Club {
    // Attributes
    private String name;
    private int wins;
    private int draws;
    private int losses;

    // Constructors
    public Club() {
        this.name = "";
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
    } 

    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    } 

    public Club(Club club) {
        this.name = club.name;
        this.wins = club.wins;
        this.draws = club.draws;
        this.losses = club.losses;
    } 

    // Getters
    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getDraws() {
        return this.draws;
    }

    public int getLosses() {
        return this.losses;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int numMatchesPlayed() {
        int numMatches = this.wins + this.draws + this.losses;
        return numMatches;
    }

    public boolean isFinish() {
        if (this.numMatchesPlayed() >= 10)
            return true;
        else
            return false;
    }

    public int getPoints() {
        int points = this.wins * 3 + this.draws + this.losses * 0;
        return points;
    }

    public String toString() {
        return "Club " + this.name + ": " + this.wins + "/" + this.draws + "/" + this.losses;
    }
} 
