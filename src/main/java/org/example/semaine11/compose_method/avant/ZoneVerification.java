package org.example.semaine11.compose_method.avant;


import org.example.semaine11.compose_method.common.CardComponent;

import java.awt.*;

public class ZoneVerification {
    private int[] coords; // [x1, y1, x2, y2]

    public ZoneVerification(int[] coords) {
        this.coords = coords;
    }

    public boolean contains(Component c) {
        Point p = c.getLocation();
        int locX = Double.valueOf(p.getX()).intValue();
        int locY = Double.valueOf(p.getY()).intValue();

        boolean completelyWithin = (locX >= coords[0] &&
                locY >= coords[1] &&
                (locX + CardComponent.WIDTH) <= coords[2] &&
                (locY + CardComponent.HEIGHT) <= coords[3]);

        if (completelyWithin) return true;

        locX = locX + CardComponent.WIDTH;
        locY = locY + CardComponent.HEIGHT;

        boolean partiallyWithin = (locX > coords[0] &&
                locY > coords[1] &&
                (locX < coords[2]) &&
                (locY < coords[3]));

        return partiallyWithin;
    }
}

