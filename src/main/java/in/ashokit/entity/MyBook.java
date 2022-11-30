package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="My_Book")
@IdClass(value=MyBook_PK.class)
public class MyBook 
{
	@Id
	private Integer bookId;
	@Id
	private String bookIsbn;
	
	private String bookName;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "MyBook [bookId=" + bookId + ", bookIsbn=" + bookIsbn + ", bookName=" + bookName + "]";
	}
	
	
	
	
	

}
