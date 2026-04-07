package OOProject;

abstract class Sword implements IWeapon{
    protected String swordType;


    public String getWeaponName(){
        return swordType;
    }
}

class OneHandSword extends Sword{

    // OneHandSword의 생성자
    public OneHandSword(){
        this.swordType = "한손검";
    }

    public void usingWeapon(){
        System.out.println("한손검을 사용해");
    }

    @Override
    public String equip() {
        return "한손검을 장착했습니다.";
    }
}

class TwoHandSword extends Sword{
    public TwoHandSword(){
        this.swordType = "두손검";
    }

    public void usingWeapon(){
        System.out.println("두손검을 사용해");
    }

    @Override
    public String equip() {
        return "두손검을 장착했습니다.";
    }
}
