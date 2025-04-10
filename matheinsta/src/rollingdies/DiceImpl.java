package rollingdies;

import java.util.Random;

public class DiceImpl implements IDice{

    private Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
