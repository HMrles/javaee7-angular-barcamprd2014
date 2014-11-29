/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ecabrerar.examples.javaee7.booklibrary.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.ecabrerar.examples.javaee7.booklibrary.entities.Book;
import org.ecabrerar.examples.javaee7.booklibrary.services.BookService;

/**
 *
 * @author ecabrerar
 */
@Path("/book")
public class BookRestService {
    
    @Inject
    BookService bookService;
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Book entity) {
        bookService.createBook(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Book entity) {
        bookService.editBook(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        bookService.deleteBook(id);
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Book find(@PathParam("id") Integer id) {
        return bookService.getBook(id);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Book> findAll() {
        return bookService.findAllBooks();
    }

 
    
}
