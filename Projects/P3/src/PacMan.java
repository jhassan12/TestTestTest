import java.util.ArrayList;
import java.util.HashSet;
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
    return false;
  }

  public boolean is_ghost_in_range() {
    Location curr_loc = this.myLoc;
    int x_val = curr_loc.x;
    int y_val = curr_loc.y;

    Location loc = new Location(x_val, y_val);
    HashSet<Map.Type> types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the right
    loc = new Location(x_val + 1, y_val);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }
      

    // to the left
    loc = new Location(x_val - 1, y_val);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the right upper corner
    loc = new Location(x_val + 1, y_val + 1);
   types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the right lower corner
    loc = new Location(x_val + 1, y_val - 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the bottom
    loc = new Location(x_val, y_val - 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the top
    loc = new Location(x_val, y_val + 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the left lower corner
    loc = new Location(x_val - 1, y_val - 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }

    // to the left upper corner
    loc = new Location(x_val - 1, y_val + 1);
    types_at_loc = this.myMap.getLoc(loc);

    for (Map.Type type : types_at_loc) {
      if (type.equals(Map.Type.GHOST)) {
        return true;
      }
    }
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
