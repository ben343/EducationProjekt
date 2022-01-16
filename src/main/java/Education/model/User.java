package Education.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class User implements Serializable {
    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType type;


}