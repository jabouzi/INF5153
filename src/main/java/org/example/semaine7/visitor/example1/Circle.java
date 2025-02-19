package org.example.semaine7.visitor.example1;

// Concrete Elements
class Circle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
