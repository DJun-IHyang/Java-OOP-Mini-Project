package OOProject;

public class Human {

    private String name; //이름
    private int age;    // 나이

    private HumanState state;   //스태미나, 체력, 배고픔
    private IJob job;
    private IWeapon currentWeapon;

    // human의 객체 생성
    public Human(String name, int age, IJob job){
        this.name = name;
        this.age = age;
        this.state = new HumanState();
        this.job = job;
        this.currentWeapon = job.getWeaponBox().get(0);

    }

    public void attack(SkillRepository repo){
        // 1. SkillRepository 클래스의 findSkill 메서드에게 이 조건에 맞는 주소를 호출함.
        Skill usableSkill = repo.findSkill(job.getJobName(), currentWeapon.getWeaponName());

        //System.out.println("현재" + name + "님의 상태 :" + "hp : "+ state.getHp() + "stamina : " + state.getStamina() + " hunger : "+ state.getHunger());
        System.out.println(age + "세" + job.getJobName() + " " + name + "님이" + currentWeapon.equip());
        currentWeapon.usingWeapon();

        // 2, findSkill 메서드가 return한 값을 토대로 if문 실행
        if(usableSkill != null){
            System.out.println("동시에");
            usableSkill.cast();
        }
        else
        {
            System.out.println("스킬은 사용하지 않았다.");
        }

    }

}
