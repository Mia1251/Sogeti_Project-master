package se.sogeti.sogeti_project.service;

import se.sogeti.sogeti_project.dto.InvitationsDto;
import se.sogeti.sogeti_project.models.Invitations;

import java.util.List;

public interface InvitationsService {

    InvitationsDto create (InvitationsDto dto);
    InvitationsDto findById(String invitationsId);
    InvitationsDto update(InvitationsDto dto);
    void delete (String invitationsId);
}
