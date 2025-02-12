package org.example.semaine6.composite.filesystem;

public class CompositeExample {
    public static void main(String[] args) {
        Directory directory1 = new Directory("directory1");
        Directory directory2 = new Directory("directory2");

        File file1 = new File("file1", 100);
        File file2 = new File("file2", 200);
        directory1.add(file1);
        directory1.add(file2);

        File file3 = new File("file3", 300);
        File file4 = new File("file4", 400);
        directory2.add(file3);
        directory2.add(file4);


        System.out.println("Displaying directory1");
        directory1.display();
        System.out.println();

        System.out.println("Displaying file1");
        file1.display();
        System.out.println();

        System.out.println("Size in bytes for directory1 = " + directory1.getSizeInBytes());
        System.out.println("Size in bytes for file1 = " + file1.getSizeInBytes());

        Directory rootDirectory = new Directory("Racine");
        rootDirectory.add(directory1);
        rootDirectory.add(directory2);

        System.out.println("Structure du système de fichiers :");
        rootDirectory.display();

        // Calcul de la taille totale du système de fichiers
        System.out.println("Taille totale du système de fichiers : " + rootDirectory.getSizeInBytes() + " octets");
    }
}

/*
Size in bytes for directory1 = 300
Size in bytes for file1 = 100
Structure du système de fichiers :
Directory Name: Racine
Directory Name: directory1
File Name: file1
File Name: file2
Directory Name: directory2
File Name: file3
File Name: file4
Taille totale du système de fichiers : 1000 octets
 */
