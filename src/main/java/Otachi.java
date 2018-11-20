import behaviours.IDamage;

public class Otachi extends Kaiju {

    public Otachi(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        this.setHealthValue( healthValue - damage);
    }

    public String fly() {
        return "Flying " + this.getName();
    }
}
