package se.sogeti.sogeti_project.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.sogeti.sogeti_project.dto.InvitationsDto;
import se.sogeti.sogeti_project.models.Invitations;
import se.sogeti.sogeti_project.repository.InvitationsRepository;


@Service
public class InvitationsServiceImpl implements InvitationsService{

    private final ModelMapper mapper;
    private final InvitationsRepository invitationsRepository;

    @Autowired
    public InvitationsServiceImpl(ModelMapper mapper, InvitationsRepository invitationsRepository) {
        this.mapper = mapper;
        this.invitationsRepository = invitationsRepository;
    }


    @Override
    public InvitationsDto create(InvitationsDto dto) {
        Invitations saved = mapper.map(dto, Invitations.class);
        Invitations result = invitationsRepository.save(saved);
        return mapper.map(result, InvitationsDto.class);
    }

    @Override
    public InvitationsDto findById(String invitationsId) {
        return null;
    }

    @Override
    public InvitationsDto update(InvitationsDto dto) {
        return null;
    }

    @Override
    public void delete(String invitationsId) {
        invitationsRepository.delete(mapper.map(findById(invitationsId),Invitations.class));

    }
}
