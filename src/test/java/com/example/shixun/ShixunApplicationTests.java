package com.example.shixun;

import com.example.shixun.entity.Book;
import com.example.shixun.entity.Worker;
import com.example.shixun.mapper.BookMapper;
import com.example.shixun.mapper.WorkerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShixunApplicationTests {
	@Autowired
	WorkerMapper workerMapper;
	BookMapper bookMapper;

	@Test
	void contextLoads() {
	}
	@Test
	void insert(){
		Worker worker =new Worker();
		worker.setAge("44");
		worker.setBu_men("art");
		workerMapper.insertWorker(worker);
	}


	@Test
	void update(){
		Worker worker =new Worker();
		worker.setJob_number("201928024119");
		worker.setName("test");
		workerMapper.updateWorker(worker);
	}
	//@Test
	void insertBook(){
		Book book =new Book();
		book.setBook_name("mysql");
		book.setBook_number(78);
		book.setAuthor("jsw");
		book.setIsbn(789464);
		book.setPrice(90);
		bookMapper.insertBook(book);
	}
}
