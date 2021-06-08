package jsh.hiercards;

import javafx.scene.control.TreeItem;

public class Property extends Content {

    public String description;
    public int lastLearned;
    public int stage;

    public Property(String name, Concept parent, String description) {
        super(name, parent);
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " : " + description;
    }

    /*
    @Override
    public TreeItem<Content> getTreeItem() {
        return new TreeItem<Content>(name + ": " + description);
    } */
}
