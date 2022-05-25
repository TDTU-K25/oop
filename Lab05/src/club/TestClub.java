public class TestClub {
    public static void main(String[] args) {
        Club c1 = new Club();
        Club c2 = new Club("MU", 3, 5, 2);
        Club c3 = new Club(c2);

        System.out.println("(" + c1.getName() + ", " + c1.getWins() + ", " + c1.getDraws() + ", " + c1.getLosses() + ")");
        System.out.println("(" + c2.getName() + ", " + c2.getWins() + ", " + c2.getDraws() + ", " + c2.getLosses() + ")");
        System.out.println("(" + c3.getName() + ", " + c3.getWins() + ", " + c3.getDraws() + ", " + c3.getLosses() + ")");

        System.out.println();

        c1.setName("MC");
        c1.setWins(2);
        c1.setDraws(2);
        c1.setLosses(3);

        c3.setName("Liverpool");
        c3.setWins(2);
        c3.setDraws(4);
        c3.setLosses(2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println();

        System.out.println(c1.numMatchesPlayed());
        System.out.println(c2.numMatchesPlayed());
        System.out.println(c3.numMatchesPlayed());

        System.out.println();

        System.out.println(c1.isFinish());
        System.out.println(c2.isFinish());
        System.out.println(c3.isFinish());

        System.out.println();

        System.out.println(c1.getPoints());
        System.out.println(c2.getPoints());
        System.out.println(c3.getPoints());
    }
}
