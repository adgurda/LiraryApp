package com.example.LibraryApp.model.dto.userdto;

import java.util.List;
import com.example.LibraryApp.model.Book;
import lombok.Data;

@Data
public class UserCreateRequest {
  private Long id;
  private String name;
  private String password;
  private String email;
  private List<Book> books;


  public UserCreateRequest(Long id, String name, String password, String email, List<Book> books) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.email = email;
    this.books = books;
  }

  public UserCreateRequest(Long id, String name, String password, String email) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}