package de.rinderle.dhbw.wwi23b3.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CustomDirectory implements de.rinderle.dhbw.wwi23b3.patterns.composite.FileSystemComponent {
    private String name;
    private List<de.rinderle.dhbw.wwi23b3.patterns.composite.FileSystemComponent> components = new ArrayList<>();

    public CustomDirectory(String name) {
        this.name = name;
    }

    public void addComponent(de.rinderle.dhbw.wwi23b3.patterns.composite.FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(de.rinderle.dhbw.wwi23b3.patterns.composite.FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public int getSize() {
        int result = 0;
        for (de.rinderle.dhbw.wwi23b3.patterns.composite.FileSystemComponent component : components) {
            result += component.getSize();
        }
        return result;
    }
}