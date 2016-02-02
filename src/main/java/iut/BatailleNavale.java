package iut;

public class BatailleNavale {

    public boolean isFinished() {
        return hasSurrender;
    }

    public void surrender() {
        hasSurrender=true;
    }

    public void sinkBoat() {
        nbBoat--;
    }

    public void play(String player) {
        this.player = player;
    }

    public String lastPlayed() {
        return player;
    }

    public int getNbBoat() {
            return nbBoat;
    }

    public void addBoat() {
        nbBoat++;
    }

    public boolean isInitialize() {
        return true;
    }

    public boolean haveBoats() {

        return getNbBoat()>0;
    }

    public void initBoat() {
        //haveBoat = true;

        nbBoat = 5;
        //return haveBoat;
    }
    public static void main(String[] args) {
		System.out.println("bataille navale");
	}

    private boolean hasSurrender = false;
    private String player;
    int nbBoat = 0;
}
