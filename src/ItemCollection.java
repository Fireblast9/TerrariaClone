package src;

import java.awt.image.BufferedImage;
import java.io.Serializable;

public class ItemCollection implements Serializable {

    String type;
    short[] ids;
    short[] nums;
    short[] durs;
    transient BufferedImage image;
    double fuelp = 0;
    double smeltp = 0;
    boolean fOn = false;
    short recipeNum;

    public ItemCollection(String type, short[] ids, short[] nums, short[] durs) {
        this.type = type;
        this.ids = ids;
        this.nums = nums;
        this.durs = durs;
    }
}
