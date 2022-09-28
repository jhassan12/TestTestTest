import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    ArrayList<Location> validMoves = get_valid_moves();
	
    if (validMoves.isEmpty()) {
      return false;
    }
    
    Random rand = new Random();
    Location nextMove = validMoves.get(rand.nextInt(validMoves.size()));
      
    if (myMap.move(myName, nextMove, Map.Type.PACMAN)) {
      myLoc = nextMove;
      return true;
    }
    
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    HashSet<Map.Type> locTypes = myMap.getLoc(myLoc);

    if (locTypes.contains(Map.Type.COOKIE)){
      return myMap.eatCookie(myName);
    }

    return null;
  }
}
