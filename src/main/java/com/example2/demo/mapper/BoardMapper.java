package com.example2.demo.mapper;

import com.example2.demo.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BoardMapper {

    int boardCount();

    List<Board> getList();
}
