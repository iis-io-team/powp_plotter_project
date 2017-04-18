package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.SpecialAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Figure Joe 1")) {
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        else if(e.getActionCommand().equals("Figure Joe 2")) {
            FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        else if(e.getActionCommand().equals("Figure Jane 1")) {
            FiguresJane.figureScript(new SpecialAdapter(0,0));
        }

    }
}
