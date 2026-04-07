package OOProject;

public class Skill {
    private String name;            // 스킬이름
    private String requiredJob;     // 필요 직업
    private String requiredWeapon;  // 필요 무기
    private String effect;          // 시전 효과

    // 스킬 생성자
    public Skill(String name, String requiredJob, String requiredWeapon, String effect){
        this.name = name;
        this.requiredJob = requiredJob;
        this.requiredWeapon = requiredWeapon;
        this.effect = effect;
    }

    //스킬 사용 가능 여부 체크
    public boolean isUseble(String jobSkill, String weaponSkill){
        return requiredJob.equals(jobSkill) && requiredWeapon.equals(weaponSkill);
    }

    // 시전 문구 출력
    public void cast(){
        System.out.println("["+ name + "] 시전 : "+ effect );
    }

    public String getName(){
        return this.name;
    }



}
