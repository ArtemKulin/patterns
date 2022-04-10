package ru.kulinartem.patterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class JavaDeveloper implements Collection<String> {

    private String name;
    private String[] skills;

    @Override
    public Iterator<String> getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public String next() {
            return skills[index++];
        }
    }
}
