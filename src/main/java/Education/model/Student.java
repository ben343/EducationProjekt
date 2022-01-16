package Education.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString


public class Student implements Serializable {
    private String name;
    private String surname;
    private int age;
    private String email;
    private int phone;
    private Date dateOfBirth;
    private List<Lesson> lessons;

}


