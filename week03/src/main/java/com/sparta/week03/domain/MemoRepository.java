package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
                //  findAll By OrderBy ModifiedAt Desc 수정된 날짜 위주로 최신순으로 정렬해줘라는 뜻 이렇게 하면 JPA가 다 알아사 짜줍니다
                //  https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    List<Memo> findAllByOrderByModifiedAtDesc();
}
