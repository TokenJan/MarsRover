import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Before
    public void setup() {
        marsRover = new MarsRover();
    }

    @Test
    public void should_return_position_and_direction_after_initiation() {

        // given:
        String x = "3";
        String y = "5";
        Direction direction = Direction.NORTH;
        RoverStatus status = new RoverStatus(x, y, direction);
        InitalCommand command = new InitalCommand(status);

        // when:
        marsRover.execute(Collections.singletonList(command));

        // then:
        RoverStatus actualStatus = marsRover.getStatus();
        assert x.equals(actualStatus.getX());
        assert y.equals(actualStatus.getY());
        assert direction.equals(actualStatus.getDirection());
    }
}
