package de.rinderle.dhbw.wwi23b3.Patterns.Composite;

public class CustomFile implements de.rinderle.dhbw.wwi23b3.patterns.composite.FileSystemComponent {
    private String name;
    private int size;

    public CustomFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}