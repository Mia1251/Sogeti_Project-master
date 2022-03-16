package se.sogeti.sogeti_project.repository;

import org.springframework.data.repository.CrudRepository;
import se.sogeti.sogeti_project.models.Invitations;

public interface InvitationsRepository extends CrudRepository<Invitations, String> {

}
