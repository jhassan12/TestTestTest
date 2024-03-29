import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
    PacMan pacman = frame.addPacMan(new Location(1, 2)); 

    assert (pacman.is_ghost_in_range() == true);
  }
}
