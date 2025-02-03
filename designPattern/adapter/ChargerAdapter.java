package machineCoding.designPattern.adapter;
/* acts as bridge between 2 incompatible interfaces */
public class ChargerAdapter implements ICharger {

    private OldCharger oldCharger;

    public ChargerAdapter(OldCharger charger) {this.oldCharger = charger;}

    public void charge220V()
    {
        System.out.println("adapter for 220V to 110V...");
        oldCharger.charge110V();
    }
    
}
