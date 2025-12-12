public class NPC {
    private float HP;
    private int attack;
    private float defense;
    private int classID;
    private String name;
    private String battleClass;

    // Constructor using classID
    public NPC(String name, int classID) {
        this.name = name;
        this.classID = classID;

        switch(classID) {
            case 1: // Sword Fighter
                this.HP = 120;
                this.attack = 40;
                this.defense = 0.20f;
                this.battleClass = "Sword Fighter";
                break;
            case 2: // Unicorn Sorcerer
                this.HP = 80;
                this.attack = 35;
                this.defense = 0.60f;
                this.battleClass = "Unicorn Sorcerer";
                break;
            case 3: // Dance Battler
                this.HP = 100;
                this.attack = 20;
                this.defense = 0.42f;
                this.battleClass = "Dance Battler";
                break;
            default:
                this.HP = 100;
                this.attack = 20;
                this.defense = 0.5f;
                this.battleClass = "Unknown";
        }
    }

    public String getName() { return name; }
    public String getBattleClass() { return battleClass; }
    public float getHP() { return HP; }
    public float getDefense() { return defense; }
    public int getClassID() { return classID; }

    // Calculate attack against opponent’s defense
    public float calculateAttack(float opponentDefense) {
        return attack * (1 - opponentDefense);
    }

    // Apply damage when defending
    public void calculateDefense(float incomingAttack) {
        float damage = incomingAttack * (1 - defense) - 6;
        if(damage < 0) damage = 0;
        HP -= damage;
        if(HP < 0) HP = 0;
    }

    public boolean isStillAlive() {
        return HP > 0;
    }
}
