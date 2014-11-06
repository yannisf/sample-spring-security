package fraglab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    private static final Logger LOG = LoggerFactory.getLogger(ResourceController.class);

    @RequestMapping(method = RequestMethod.GET)
    public Message view() {
        LOG.info("Request: GET");
        return new Message("REST controller response for view");
    }

    @RequestMapping(method = RequestMethod.POST)
    public Message edit() {
        LOG.info("Request: POST");
        return new Message("REST controller response for edit");
    }

    public static class Message implements Serializable {
        String message;

        public Message() { }

        public Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}

