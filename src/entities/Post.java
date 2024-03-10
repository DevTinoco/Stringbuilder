package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moments;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comments> comment = new ArrayList<>();
	
	//CRIANDO OS CONTRUTORES, PRIMEIRO GENERATE CONSTRUCTOR USING FIELDS E APOS GENERATE:
	public Post() {
		
	}

	public Post(Date moments, String title, String content, Integer likes) {
		
		this.moments = moments;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoments() {
		return moments;
	}

	public void setMoments(Date moments) {
		this.moments = moments;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comments> getComment() {
		return comment;
	}

	public void setComment(List<Comments> comment) {
		this.comment = comment;
	}
	
	
	
}
