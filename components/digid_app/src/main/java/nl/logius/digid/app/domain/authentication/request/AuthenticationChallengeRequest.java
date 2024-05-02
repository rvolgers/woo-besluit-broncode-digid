
/*
  Deze broncode is openbaar gemaakt vanwege een Woo-verzoek zodat deze
  gericht is op transparantie en niet op hergebruik. Hergebruik van 
  de broncode is toegestaan onder de EUPL licentie, met uitzondering 
  van broncode waarvoor een andere licentie is aangegeven.
  
  Het archief waar dit bestand deel van uitmaakt is te vinden op:
    https://github.com/MinBZK/woo-besluit-broncode-digid
  
  Eventuele kwetsbaarheden kunnen worden gemeld bij het NCSC via:
    https://www.ncsc.nl/contact/kwetsbaarheid-melden
  onder vermelding van "Logius, openbaar gemaakte broncode DigiD" 
  
  Voor overige vragen over dit Woo-besluit kunt u mailen met open@logius.nl
  
  This code has been disclosed in response to a request under the Dutch
  Open Government Act ("Wet open Overheid"). This implies that publication 
  is primarily driven by the need for transparence, not re-use.
  Re-use is permitted under the EUPL-license, with the exception 
  of source files that contain a different license.
  
  The archive that this file originates from can be found at:
    https://github.com/MinBZK/woo-besluit-broncode-digid
  
  Security vulnerabilities may be responsibly disclosed via the Dutch NCSC:
    https://www.ncsc.nl/contact/kwetsbaarheid-melden
  using the reference "Logius, publicly disclosed source code DigiD" 
  
  Other questions regarding this Open Goverment Act decision may be
  directed via email to open@logius.nl
*/

package nl.logius.digid.app.domain.authentication.request;

import io.swagger.v3.oas.annotations.media.Schema;
import nl.logius.digid.app.shared.request.AuthSessionRequest;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class AuthenticationChallengeRequest extends AuthSessionRequest {
    @NotBlank
    @Valid
    @Schema(description = "A valid user app id in uuid format", example = "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP")
    private String userAppId;

    @NotBlank
    @Valid
    @Schema(description = "A valid instance id in uuid format", example = "550e8400-e29b-41d4-a716-099999470000")
    private String instanceId;

    @Valid
    @Schema(description = "Valid app session", example = "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP")
    private String appSessionId;

    @Schema(description = "A valid user app id in uuid format", example = "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP")
    public String getUserAppId() {
        return userAppId;
    }

    public void setUserAppId(String userAppId) {
        this.userAppId = userAppId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAppSessionId() {
        return appSessionId;
    }

    public void setAppSessionId(String appSessionId) {
        this.appSessionId = appSessionId;
    }


}