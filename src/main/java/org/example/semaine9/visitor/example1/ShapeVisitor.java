package org.example.semaine9.visitor.example1;

// Visitor interface
interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Square square);

    void visit(Triangle triangle);
}
