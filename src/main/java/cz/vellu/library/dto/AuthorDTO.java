/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.vellu.library.dto;

import cz.vellu.library.Model.Author;

/**
 *
 * @author vellu
 */
public class AuthorDTO {
    private Author author;

    public AuthorDTO(Author author) {
        this.author = author;
    }

    public AuthorDTO() {
    }
    

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
}
