public enum Direction implements IDirection {

    EAST("E") {
        @Override
        public Direction getPrevious() {
            return NORTH;
        }

        @Override
        public Direction getNext() {
            return SOUTH;
        }
    },
    SOUTH("S") {
        @Override
        public Direction getPrevious() {
            return EAST;
        }

        @Override
        public Direction getNext() {
            return WEST;
        }
    },
    WEST("W") {
        @Override
        public Direction getPrevious() {
            return SOUTH;
        }

        @Override
        public Direction getNext() {
            return NORTH;
        }
    },
    NORTH("N") {
        @Override
        public Direction getPrevious() {
            return WEST;
        }

        @Override
        public Direction getNext() {
            return EAST;
        }
    };

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}