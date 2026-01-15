package Station;

import step.BakeStep;
import step.Step;

public class OvenStation extends Station {
    public OvenStation(String stationId, String location) {
        super(stationId, location);
    }

    @Override
    public boolean canHandle(Step step) {
        return step instanceof BakeStep;
    }
}
