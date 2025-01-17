package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.OrganizerDao;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService{
    @Autowired
    OrganizerDao organizerDao;
    @Override
    public List<Organizer> getAllOrganizer() {
               return organizerDao.getOrganizer(Pageable.unpaged()).getContent();
           }

           @Override
    public Page<Organizer> getOrganizer(Integer page, Integer pageSize) {
              return organizerDao.getOrganizer(PageRequest.of(page,pageSize));
          }

    @Override
    public Integer getOrganizerSize() {
        return organizerDao.getOrganizerSize();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerDao.getOrganizer(pageSize,page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerDao.findById(id);
    }

    @Override
    @Transactional
    public Organizer save(Organizer org) {
        return organizerDao.save(org);
    }

    @Override
    public Page<Organizer> getOrganizers(String title, Pageable pageable) {
        return organizerDao.getOrganizers(title,pageable);
    }
}

