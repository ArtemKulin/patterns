package ru.kulinartem.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class ProjectFactory {

    Project project;

    public Project cloneProject() {
        return (Project) project.copy();
    }
}
