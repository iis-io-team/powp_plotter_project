package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

/**
 * Created by Maciek on 18.04.2017.
 */
public class SpecialAdapter extends AbstractPlotter {

    private IPlotter iPlotter;

    public SpecialAdapter(int x, int y) {
        super(x, y);
        this.iPlotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
    }

    @Override
    public void drawTo(int x, int y) {
        iPlotter.drawTo(x,y);
    }
}
