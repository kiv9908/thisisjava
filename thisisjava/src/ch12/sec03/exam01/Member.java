package ch12.sec03.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Getter
//@Setter
@Data
@AllArgsConstructor

public class Member {

	public String member;
	public int score;

//	public Member(String name, int score) {
//		this.member = name;
//		this.score = score;
//
//	}

//	@Override
//	public String toString() {
//		return "name: " + member + " , score: " + score;
//	}
//
//	@Override
//	public boolean equals(Object m) {
//		// m.member 가 object 로 자동 형변환, 필드 접근을 위해 Member로 강제 형변환
//		if (this.member.equals(((Member) m).member) && this.score == ((Member) m).score) {
//			return true;
//		}
//
//		return false;
//	}
}
