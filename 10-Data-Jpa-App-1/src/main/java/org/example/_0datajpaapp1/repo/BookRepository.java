package org.example._0datajpaapp1.repo;

import org.example._0datajpaapp1.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
