package org.example.semaine11.replace_implicit_language_with_interpreter.apres;

// Étape 3: Combinateurs (AND/OR/NOT)
class AndSpec<T> implements Specification<T> {
    private Specification<T> left, right;

    public AndSpec(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T item) {
        return left.isSatisfiedBy(item) && right.isSatisfiedBy(item);
    }
}
