package org.example.semaine9.visitor.example1;

class Triangle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
