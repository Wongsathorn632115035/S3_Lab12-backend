package se331.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Organizer;
import se331.rest.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> getAllOrganizer();
    Page<Organizer> getOrganizer(Integer page, Integer pageSize);

    Integer getOrganizerSize();

    Page<Organizer> getOrganizers(Integer pageSize, Integer page);

    Organizer getOrganizer(Long id);

    Organizer save(Organizer organizer);
    Page<Organizer> getOrganizers(String title, Pageable pageable);
}

