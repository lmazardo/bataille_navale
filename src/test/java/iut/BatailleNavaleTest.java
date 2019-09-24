package iut;

import org.junit.Test;

import static org.junit.Assert.*;

public class BatailleNavaleTest {

    @Test
    public void canInitialize() {
        BatailleNavale batailleNavale = new BatailleNavale();

        boolean initialize = batailleNavale.isInitialize();
        assertEquals(false, initialize);
    }

    @Test
    public void shouldHaveBoats() {
        BatailleNavale batailleNavale2 = new BatailleNavale();

        assertEquals(true, batailleNavale2.haveBoats());
    }

    @Test
    public void shouldHaveBoatTestAfterInit() {
        BatailleNavale batNav = new BatailleNavale();
        batNav.initBoat();
        assertEquals(true, batNav.haveBoats());
    }

    @Test
    public void checkIfbattleIsNotFinished() {
        boolean hasFinished = new BatailleNavale().isFinished();
        assertFalse(hasFinished);

    }

    @Test
    public void checkIfBattleIsFinishedWhenSurrendering() {
        BatailleNavale batailtrueleNavale = new BatailleNavale();

        batailleNavale.surrender();
        boolean finished = batailleNavale.isFinished();
        assertTrue(finished);
    }

    @Test
    public void shouldHaveFiveBoat() {
        BatailleNavale batailleNavale = new BatailleNavale();
        batailleNavale.initBoat();
        assertEquals(5, batailleNavale.getNbBoat());
    }

    @Test
    public void AddBoat() {
        BatailleNavale batailleNavale = new BatailleNavale();
        batailleNavale.initBoat();
        batailleNavale.addBoat();
        assertEquals(6, batailleNavale.getNbBoat());
    }

    @Test
    public void canSinkBoat() {
        BatailleNavale batailleNavale = new BatailleNavale();
        batailleNavale.initBoat();
        batailleNavale.addBoat();//6 bateaux
        batailleNavale.sinkBoat();

        assertEquals(5, batailleNavale.getNbBoat());

    }

    @Test
    public void playerOneCouldPlay() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.play("playerOne");

        assertEquals("playerOne", batailleNavale.lastPlayed());
    }

    @Test
    public void playerTwoCouldPlay() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.play("playerTwo");

        assertEquals("playerTwo", batailleNavale.lastPlayed());
    }

}
