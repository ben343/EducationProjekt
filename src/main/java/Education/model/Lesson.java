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
public class Lesson implements Serializable {
    private String name;
    private int duration;
    private String lecturerNa;
    private int prince;

}