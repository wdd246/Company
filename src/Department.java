import java.util.Optional;

public class Department {
    private Manager boss;

    public Optional<Manager> getBoss(){ //Can be null so Optional is required
        return Optional.ofNullable(boss);
    }

    public void setBoss(Manager boss){
        this.boss = boss;
    }
}
