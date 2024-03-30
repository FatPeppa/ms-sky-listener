package org.skyhigh.msskylistener.model.DTO.getUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRequestGetUserDTO {
    @NotEmpty
    private String userMadeRequestId;
}