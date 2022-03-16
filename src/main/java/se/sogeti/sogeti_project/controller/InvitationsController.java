package se.sogeti.sogeti_project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.sogeti.sogeti_project.dto.InvitationsDto;
import se.sogeti.sogeti_project.models.Invitations;
import se.sogeti.sogeti_project.service.InvitationsService;


@RestController
@RequestMapping(path = "/event/api/vi/invitations")
public class InvitationsController {



    private final InvitationsService invitationsService;

    public InvitationsController(InvitationsService invitationsService) {
        this.invitationsService = invitationsService;
    }


    @PostMapping
        public ResponseEntity<InvitationsDto> create(@RequestBody InvitationsDto dto){
            return ResponseEntity.status(HttpStatus.CREATED).body(invitationsService.create(dto));
        }





}
