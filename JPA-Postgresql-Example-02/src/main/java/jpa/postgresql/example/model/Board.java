package jpa.postgresql.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {

	@Id
	@Column(name="board_seq")
	private int boardSeq;

	@Column(name="USER_SEQ")
	private int userSeq;
	
	private String title;
	
	private String content;

	@Override
	public String toString() {
		return "Board [boardSeq=" + boardSeq + ", userSeq=" + userSeq + ", title=" + title + ", content=" + content
				+ "]";
	}
}