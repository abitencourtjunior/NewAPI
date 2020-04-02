
package br.com.search.news.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News implements Serializable {

	private static final long serialVersionUID = -1941846979845881959L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String address;
	private String source;
	private String content;
	private String time;
	private Boolean searched = false;
	private LocalDateTime localDateTime = LocalDateTime.now();
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(final String title) {
		this.title = title;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(final String address) {
		this.address = address;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(final String source) {
		this.source = source;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(final String content) {
		this.content = content;
	}
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	
	public void setLocalDateTime(final LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Long getId() {
		return id;
	}

	public void setSearched(final Boolean searched) {
		this.searched = searched;
	}

	public Boolean getSearched() {
		return searched;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(final String time) {
		this.time = time;
	}
}
