package designPattern.adapter;

public class Main {
    public static void main(String args[])
    {
        OldCharger oldCharger = new OldCharger();
        ICharger adapter = new ChargerAdapter(oldCharger);
        ICharger newCharger = new NewCharger();
        adapter.charge220V();
        newCharger.charge220V();
    }
    
}
