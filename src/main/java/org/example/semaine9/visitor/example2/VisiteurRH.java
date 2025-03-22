package org.example.semaine9.visitor.example2;

class VisiteurRH implements Visiteur {
    @Override
    public void visiter(Employe employe) {
        System.out.println("Visite de l'employe : " + employe.getNom());
    }
}
