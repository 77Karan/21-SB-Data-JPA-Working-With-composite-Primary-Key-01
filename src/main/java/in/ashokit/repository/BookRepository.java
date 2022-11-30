package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.MyBook;
import in.ashokit.entity.MyBook_PK;

public interface BookRepository extends JpaRepository<MyBook, MyBook_PK>
{
	

}
