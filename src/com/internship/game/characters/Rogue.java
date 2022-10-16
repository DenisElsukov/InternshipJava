import com.internship.game.characters.AbstractCharacter;
import com.internship.game.characters.CharacterInterface;
public class Rogue implements CharacterInterface {

    @Override
    public void greeting() {
    System.out.println("Hello, i am Jack. I stole an apple for you." );
}

    @Override
    public void doStep() {
        System.out.println("Haha");
    }

    @Override
    public void actions() {
        System.out.println("I hop on, you hope");
    }

    @Override
    public void attack() {
        System.out.println("\'Slit!\' \'Crrrr!\'");
    }

}
class RogueCharacteristic extends AbstractCharacter {
    AbstractCharacter abstractCharacter = new AbstractCharacter() {
        @Override
        public void setAgility(double agility) {
            super.setAgility(agility);
            this.setAgility(9.88);
        }

        @Override
        public void setName(String name) {
            super.setName(name);
            this.setName("Jack");
        }

        @Override
        public void setSpeed(int movement) {
            super.setSpeed(movement);
            this.setSpeed(8);
        }

        @Override
        public void setEnergy(double energy) {
            super.setEnergy(energy);
            this.setEnergy(4.95);
        }

        @Override
        public void setRace(String race) {
            super.setRace(race);
            this.setRace("Human");
        }

        @Override
        public void setGender(String gender) {
            super.setGender(gender);
            this.setGender("male");
        }

        @Override
        public void setIntelligence(double intelligence) {
            super.setIntelligence(intelligence);
            this.setIntelligence(2.54);

        }
    };
}