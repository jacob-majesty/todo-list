package com.majesty.todo_list.repository;


import com.majesty.todo_list.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
