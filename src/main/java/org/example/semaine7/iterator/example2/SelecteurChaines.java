package org.example.semaine7.iterator.example2;

class SelecteurChaines implements Iterator {
    private String[] chaines;
    private int position = 0;

    public SelecteurChaines(String[] chaines) {
        this.chaines = chaines;
    }

    @Override
    public boolean aSuivant() {
        return position < chaines.length;
    }

    @Override
    public Object suivant() {
        return chaines[position++];
    }
}
