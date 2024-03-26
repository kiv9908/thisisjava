package ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Board {
	private String subject;
	private String content;
	private String writer;
	private ch14.sec06.exam01.Calculator cal;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}