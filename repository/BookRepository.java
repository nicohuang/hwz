package com.hwz.repository;

import com.hwz.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 声明持久层接口
 * 1.不需要实现该接口
 */
public interface BookRepository extends JpaRepository<Book, Integer>
{
}
