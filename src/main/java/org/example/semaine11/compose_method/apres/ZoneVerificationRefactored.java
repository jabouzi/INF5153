package org.example.semaine11.compose_method.apres;

import org.example.semaine11.compose_method.common.CardComponent;

import java.awt.*;

public class ZoneVerificationRefactored {
    private int[] coords; // [x1, y1, x2, y2]

    public ZoneVerificationRefactored(int[] coords) {
        this.coords = coords;
    }

    public boolean contains(Component c) {
        return isCompletelyWithin(c) || isPartiallyWithin(c);
    }

    private boolean isCompletelyWithin(Component c) {
        Point p = c.getLocation();
        return (p.x >= coords[0] &&
                p.y >= coords[1] &&
                (p.x + CardComponent.WIDTH) <= coords[2] &&
                (p.y + CardComponent.HEIGHT) <= coords[3]);
    }

    private boolean isPartiallyWithin(Component c) {
        Point p = c.getLocation();
        int rightEdge = p.x + CardComponent.WIDTH;
        int bottomEdge = p.y + CardComponent.HEIGHT;

        return (rightEdge > coords[0] &&
                bottomEdge > coords[1] &&
                rightEdge < coords[2] &&
                bottomEdge < coords[3]);
    }
}