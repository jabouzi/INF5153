package org.example.semaine3.objet;

//Objet:
class Point {
    private int x;
    private int y;
            
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
            
    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}