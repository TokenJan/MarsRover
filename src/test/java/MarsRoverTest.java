import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Before
    public void setup() {
        marsRover = new MarsRover();
    }

    @Test
    public void should_return_position_and_direction_after_initiation() {

        // given:
        Long x = 3L;
        Long y = 5L;
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

    @Test
    public void should_return_position_and_direction_after_initiation_and_move_command() {

        // given:
        Long x = 3L;
        Long y = 5L;
        Direction direction = Direction.NORTH;
        RoverStatus status = new RoverStatus(x, y, direction);
        InitalCommand initalCommand = new InitalCommand(status);
        MoveCommand moveCommand = new MoveCommand("M", 5);
        List<Command> commands = new ArrayList<>();
        commands.add(initalCommand);
        commands.add(moveCommand);

        // when:
        marsRover.execute(commands);

        // then:
        RoverStatus actualStatus = marsRover.getStatus();
        assert x.equals(actualStatus.getX());
        assert 10L == (actualStatus.getY());
        assert direction.equals(actualStatus.getDirection());
    }
}
