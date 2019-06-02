package jpa.postgresql.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="board", schema="public") // https://stackoverflow.com/questions/45782327/org-postgresql-util-psqlexception-error-column-user0-id-does-not-exist-hibe
public class Board {

	@Id
	@Column(name="board_seq")
	private int boardSeq;

	@ManyToOne
    @JoinColumn(name = "user_seq") 
	private User user;
	
	private String title;
	
	private String content;

	public int getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Board [boardSeq=" + boardSeq + ", user=" + user + ", title=" + title + ", content=" + content + "]";
	}
	
}