package dev.panos.contentcalendar.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import dev.panos.contentcalendar.model.Content;
import dev.panos.contentcalendar.model.Status;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    
    List<Content> findAllByTitleContains(String keyword);

    @Query("SELECT * FROM content where status = :status")
    List<Content> listByStatus(@Param("status")Status status);
}