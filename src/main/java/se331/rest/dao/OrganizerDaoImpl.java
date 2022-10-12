package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;
import se331.rest.repository.OrganizerRepository;

import java.util.Optional;

@Repository
public class OrganizerDaoImpl implements OrganizerDao {
    @Autowired
    OrganizerRepository organizerRepository;

    @Override
    public Page<Organizer> getOrganizer(Pageable pageRequest) {
        return organizerRepository.findAll(pageRequest);
    }

    @Override

    public Organizer findById(Long id) {
         return organizerRepository.findById(id).orElse(null);

    }
    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    @Override
    public Integer getOrganizerSize() {
        return Math.toIntExact(organizerRepository.count());
    }

    @Override
    public Page<Organizer> getOrganizer(Integer pageSize, Integer page) {
        return  organizerRepository.findAll(PageRequest.of(pageSize,page-1));
    }

    @Override
    public Page<Organizer> getOrganizers(String name, Pageable page) {
        return organizerRepository.findByName(name,page);
    }
}

