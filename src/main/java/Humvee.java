import behaviours.IDamage;

public class Humvee extends Vehicle {

    public Humvee(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        this.setHealthValue( healthValue - damage);
    }
}
