package wint.webchat.entities.conversation.type_message;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import wint.webchat.entities.conversation.Message;

import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class MediaMessage implements Serializable{
        @Id
        private Long id;
        private String url;

        @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
        @JoinColumn(name = "messageId")
        private Message messageMedia;
}