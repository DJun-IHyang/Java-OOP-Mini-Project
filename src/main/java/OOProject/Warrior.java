package OOProject;

import java.util.ArrayList;

public class Warrior implements IJob{

    private ArrayList<IWeapon> warriorWeaponBox = new ArrayList<>();

    public Warrior(){
        warriorWeaponBox.add(new OneHandSword());
        warriorWeaponBox.add(new TwoHandSword());
    }

    @Override
    public String getJobName() {
        return "Warrior";
    }

    @Override
    public ArrayList<IWeapon> getWeaponBox() {
        return warriorWeaponBox;
    }
}
