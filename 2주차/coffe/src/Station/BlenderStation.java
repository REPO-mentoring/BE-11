package Station;

import step.BlendStep;
import step.Step;

public class BlenderStation extends Station {
    public BlenderStation(String stationId, String location) {
        super(stationId, location);
    }

    @Override
    public boolean canHandle(Step step) {
        return step instanceof BlendStep;
    }

}

