package lesson20240617.solid;

import lombok.ToString;

@ToString
public class TeslaNewVersion extends Tesla {

    @Override
    public void move() {
        throw new RuntimeException("Method 'move' not yet implemented");
    }


}
