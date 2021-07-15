package com.example2.demo.service;

import com.example2.demo.domain.Board;
import com.example2.demo.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount(){return boardMapper.boardCount();}

    public List<Board> boardList(){return boardMapper.getList();}
}
