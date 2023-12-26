import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.example.task2.MailInfo;
import org.example.task2.Client;
import org.example.task2.MailSender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MailSenderTest {

    @Test
    void mailInfoGetMailStrategyByCode_ShouldReturnCorrectMailCode() {
        Client client = Client.builder().name("Test").age(25).sex("Male").email("test@example.com").build();
        MailInfo mailInfo = new MailInfo(client);
        String mailCode = mailInfo.getMailStrategyByCode("birthday", client);
        assertEquals("Test Special offer for clients older than 16 years!", mailCode);
    }
}
