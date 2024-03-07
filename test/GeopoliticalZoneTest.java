import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeopoliticalZoneTest {
    @Test
    public void testToGetStates(){
        GeopoliticalZone zone = GeopoliticalZone.NORTH_EAST;

        GeopoliticalZone zone1 = GeopoliticalZone.NORTH_CENTRAL;
        zone1.setStates("Ogudu");
        GeopoliticalZone zone2 = GeopoliticalZone.NORTH_WEST;
        GeopoliticalZone zone3 = GeopoliticalZone.SOUTH_SOUTH;
        GeopoliticalZone zone4 = GeopoliticalZone.SOUTH_EAST;
        GeopoliticalZone zone5= GeopoliticalZone.SOUTH_WEST;
        System.out.print(Arrays.toString(GeopoliticalZone.values()));



    }
}
