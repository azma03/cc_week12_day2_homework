import behaviours.IDamage;

public class Slattern extends Kaiju {

    public Slattern(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(this.getAttackValue());  // iDamage will hold the object of any class that implements IDamage Interface. On attack, reduce the health value of the iDamange object by the attack value of current object
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        this.setHealthValue( healthValue - damage);
    }

    public String fly() {
        return "Flying " + this.getName();
    }
}
