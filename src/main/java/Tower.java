public class Tower extends Building {

    public Tower(String name, int healthValue) {
        super(name, healthValue);
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        this.setHealthValue( healthValue - damage);
    }
}
