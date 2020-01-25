/**
 * @author jiahuan.yang
 */
public class InitalCommand implements Command {

    private RoverStatus status;

    public InitalCommand(RoverStatus status) {
        this.status = status;
    }

    @Override
    public RoverStatus execute(RoverStatus status) {
        return this.status;
    }
}
