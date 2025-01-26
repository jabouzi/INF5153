package org.example.semaine4.grasp.cohesion_elevee;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Article> articles;

    public Blog() {
        this.articles = new ArrayList<>();
    }

    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    public void supprimerArticle(Article article) {
        articles.remove(article);
    }
}

