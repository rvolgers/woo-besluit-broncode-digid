
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

package nl.logius.digid.eid.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nl.logius.digid.sharedlib.client.HsmClient;
import okhttp3.HttpUrl;

@Configuration
public class HsmConfig {
    @Value("${urls.internal.hsm-bsnk}")
    private String hsmBsnkUrl;

    @Value("${hsm-bsnk.timeout}")
    private int hsmBsnkTimeout;

    @Value("${urls.internal.hsm-eac}")
    private String hsmEacUrl;

    @Value("${hsm-eac.timeout}")
    private int hsmEacTimeout;

    @Value("${iapi.token}")
    private String iapiToken;

    @Bean(name="hsm-bsnk")
    public HsmClient bsnkClient() {
        return new HsmClient(HttpUrl.get(hsmBsnkUrl), iapiToken, hsmBsnkTimeout);
    }

    @Bean(name="hsm-eac")
    public HsmClient eacClient() {
        return new HsmClient(HttpUrl.get(hsmEacUrl), iapiToken, hsmEacTimeout);
    }
}