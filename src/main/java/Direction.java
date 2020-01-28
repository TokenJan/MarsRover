import java.util.Arrays;

/**
 * @author jiahuan.yang
 */

public enum Direction {

    EAST("E", 0),
    SOUTH("S", 1),
    WEST("W", 2),
    NORTH("N", 3);

    private String abbrev;

    private int index;

    Direction(String abbrev, int index) {
        this.abbrev = abbrev;
        this.index = index;
    }

    public Direction right() {
        return getByIndex((this.index + 1) % 4);
    }

    public Direction left() {
        return getByIndex((this.index + 3) % 4);
    }

    private Direction getByIndex(int index) {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.index == index)
                .findFirst()
                .orElse(null);
    }

    public static Direction getByAbbrev(String abbrev) {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.abbrev.equals(abbrev))
                .findFirst()
                .orElse(null);
    }
}
