import org.junit.Test;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Test
    public void should_face_to_east_given_face_to_north_and_turn_right() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 N";
        String moveCommand = "R";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.EAST.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_west_given_face_to_north_and_turn_left() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 N";
        String moveCommand = "L";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.WEST.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_south_given_face_to_east_and_turn_right() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 E";
        String moveCommand = "R";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.SOUTH.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_north_given_face_to_east_and_turn_left() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 E";
        String moveCommand = "L";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.NORTH.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_west_given_face_to_south_and_turn_right() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 S";
        String moveCommand = "R";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.WEST.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_east_given_face_to_south_and_turn_left() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 S";
        String moveCommand = "L";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.EAST.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_north_given_face_to_west_and_turn_right() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 W";
        String moveCommand = "R";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.NORTH.equals(marsRover.report().getDirection());
    }

    @Test
    public void should_face_to_south_given_face_to_west_and_turn_left() {
        // given:
        marsRover = new MarsRover();
        String initCommand = "0 0 W";
        String moveCommand = "L";

        // when:
        marsRover.initialize(initCommand);
        marsRover.execute(moveCommand);

        // then:
        assert marsRover.report().getX() == 0;
        assert marsRover.report().getY() == 0;
        assert Direction.SOUTH.equals(marsRover.report().getDirection());
    }
}
