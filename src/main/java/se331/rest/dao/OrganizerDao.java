package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;

import java.util.Optional;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);
    Organizer findById(Long id);

    Organizer save(Organizer organizer);


    Integer getOrganizerSize();

    Page<Organizer> getOrganizer(Integer pageSize, Integer page);

    Page<Organizer> getOrganizers(String title, Pageable pageable);
}

