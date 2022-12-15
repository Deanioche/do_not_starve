package hello.hellospring.service;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test2")
@Entity
public class Memo {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    @Column(length = 200, nullable = false)
    private String memoText;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}