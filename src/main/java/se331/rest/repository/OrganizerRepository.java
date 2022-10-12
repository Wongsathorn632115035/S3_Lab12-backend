package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Organizer;
import se331.rest.entity.Organizer;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
    List<Organizer> findAll();
    Page<Organizer> findByName(String title, Pageable pageRequest);
}

