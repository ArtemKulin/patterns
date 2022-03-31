package ru.kulinartem.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Project implements Copiable {

    private int id;
    private String projectName;
    private String sourceCode;

    @Override
    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }
}
