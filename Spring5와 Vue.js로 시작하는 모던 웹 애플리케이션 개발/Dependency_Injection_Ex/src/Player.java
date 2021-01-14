public class Player {
    private Weapon weapon;

    Player(){
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void usePlayerWeapon() {
        weapon.useWeapon();
    }
}
