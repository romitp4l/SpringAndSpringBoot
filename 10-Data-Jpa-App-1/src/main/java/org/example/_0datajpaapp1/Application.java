package org.example._0datajpaapp1;

import org.example._0datajpaapp1.entity.Book;
import org.example._0datajpaapp1.repo.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        BookRepository bean = context.getBean(BookRepository.class);

        System.out.println(bean.getClass().getName());

        Book b = new Book();
        b.setBookName("Python complete reference book");
        b.setBookId(102);
        b.setBookPrice(12083.50);

        bean.save(b);
      //  System.out.println(bean.findAll().iterator().toString());
    }

}
