package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Created by Maciek on 18.04.2017.
 */
public class SpecialAdapter extends AbstractPlotter {

    public SpecialAdapter(int x, int y) {
        super(x, y);
    }

    @Override
    public void drawTo(int x, int y) {
        ILine line = LineFactory.getDottedLine();
        line.setStartCoordinates(getX(), getY());
        line.setEndCoordinates(x, y);

        setPosition(x,y);

        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }
}
