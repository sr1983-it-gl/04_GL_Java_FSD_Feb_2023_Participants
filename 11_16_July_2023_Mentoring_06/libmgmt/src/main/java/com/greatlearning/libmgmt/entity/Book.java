package com.greatlearning.libmgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BOOK")

@Getter
@Setter
@Data
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "ID")
	private int id;
	
	@Column(name =  "TITLE")	
	private String title;
	
	@Column(name =  "AUTHOR")	
	private String author;
	
	@Column(name =  "CATEGORY")	
	private String category;
	
	
	public Book() {}
	
	public Book(String title, String category, String author) {
		
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
