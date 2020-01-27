/**
 * @author jiahuan.yang
 */

public enum Direction {

    // 东
    EAST(0),

    // 南
    SOUTH(1),

    // 西
    WEST(2),

    // 北
    NORTH(3);

    private int index;

    Direction(int index) {
        this.index = index;
    }

    public Direction getPrevious() {
        int previousIndex = (this.index - 1) % 4;
        return Direction.values()[previousIndex];
    }

    public Direction getNext() {
        int nextIndex = (this.index + 1) % 4;
        return Direction.values()[nextIndex];
    }
}