/**
 * @author jiahuan.yang
 */
public interface Command {

    RoverStatus execute(RoverStatus status);
}
