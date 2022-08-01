package com.example.WeekendTask.repositry;
import com.example.WeekendTask.model.Books;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepo extends JpaRepository<Books,Integer> {



}
