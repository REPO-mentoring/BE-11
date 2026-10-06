package Station;

import step.ExtractEspressoStep;
import step.GrindBeansStep;
import step.SteamMilkStep;
import step.Step;

public class EspressoStation extends Station {
    public EspressoStation(String id, String loc) { super(id, loc); }

    @Override
    public boolean canHandle(Step step) {
        return step instanceof GrindBeansStep ||
                step instanceof ExtractEspressoStep ||
                step instanceof SteamMilkStep;
    }
}
