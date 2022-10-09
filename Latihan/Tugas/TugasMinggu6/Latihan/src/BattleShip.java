public class BattleShip {

    private IMissile weapon;
    public int HealthPoint;
    public String Type;

    public void BattleShip();
    public void BattleShip(IMissile Weapon) {
        this.weapon = weapon;
    }
    public void ChangeWeapon(IMissile weapon) {
        this.weapon = weapon;
    }

    public void GetHealthStatus() {
    }
    public void UseWeapon() {
        
    }

    
    
}
