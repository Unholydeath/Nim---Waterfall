package group1.csc130.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player player = new Player();
    @Test
    public void testGetName() throws Exception {
    player.setName("Isaiah");
    assertEquals(player.getName(),"Isaiah","Isaiah");
    }

    @Test
    public void setName() throws Exception {
    }

    @Test
    public void getType() throws Exception {
    }

    @Test
    public void setType() throws Exception {
    }

    @Test
    public void makeRowChoice() throws Exception {
    }

    @Test
    public void makeBeadChoice() throws Exception {
    }

}