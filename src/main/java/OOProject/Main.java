package OOProject;

public class Main {

    public static void main(String[] arg){
        SkillRepository repository = new SkillRepository();

        Human player = new Human("DJ", 29, new Warrior());

        player.attack(repository);
    }

}
