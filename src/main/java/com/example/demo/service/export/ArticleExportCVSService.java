package com.example.demo.service.export;

import com.example.demo.entity.Article;
import com.example.demo.entity.Client;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.util.List;

@Service
public class ArticleExportCVSService {

    @Autowired
    private ArticleRepository articleRepository;

    public void export(PrintWriter writer) {
        /*writer.println("Hello;WorldUNE AUTRE ESSAI");
        writer.println("guten tag");*/


        List<Article> listArticles = articleRepository.findAll();
        writer.println("Libelle;Prix;Stock;");
        for (Article article:listArticles){
            writer.println(article.getLibelle()+";"+article.getPrix()+";"+article.getStock());
        }


    }


}
