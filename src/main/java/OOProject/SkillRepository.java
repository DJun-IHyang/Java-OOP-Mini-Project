package OOProject;

import java.util.ArrayList;

public class SkillRepository {
    private ArrayList<Skill> allSkills = new ArrayList<>();


    public SkillRepository(){
        allSkills.add(new Skill("가르기", "Warrior", "한손검", "횡베기를 한다."));
        allSkills.add(new Skill("강타", "Warrior", "두손검", " 강력한 타격을 한다."));
        //allSkills.add(new Skill("강타", "Warrior", "OneHandSword", " 강력한 타격을 한다."))
        //allSkills.add(new Skill("강타", "Warrior", "OneHandSword", " 강력한 타격을 한다."))
    }

    // 스킬 객체를 전부 확인해서 직업과 무기에 맞는 조건의 스킬을 반환 해주는 역할
    public Skill findSkill(String availableJobName, String availableWeaponName){
        for (Skill s : allSkills){
            if (s.isUseble(availableJobName, availableWeaponName)){

                return s;
            }
        }
        System.out.println("null값이 들어감");
        return null;
    }




}
