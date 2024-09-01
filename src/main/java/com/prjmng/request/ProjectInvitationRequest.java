package com.prjmng.request;

import lombok.Data;

@Data
public class ProjectInvitationRequest {
    private Long projectId;
    private String email;
}
