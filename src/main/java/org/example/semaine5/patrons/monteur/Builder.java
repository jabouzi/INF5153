package org.example.semaine5.patrons.monteur;

// Interface Builder
interface Builder {
    void construireMurs();

    void construireSol();

    void construirePorte();

    void construireFenetres();

    void construireToit();

    void construireJardin();

    void construirePiscine();

    Maison getResultat();
}
