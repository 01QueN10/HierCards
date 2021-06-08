package jsh.hiercards;

import javafx.scene.control.TreeItem;

public abstract class Content {

    public String name;
    public Concept parent;
    // public abstract TreeItem<Content> getTreeItem();
    public String getParents() {
        // if (parent == null) return name;
        return parent.getParents() + " > " + name;
    }

    private Content() {

    }

    public Content(String name, Concept parent) {
        this.name = name;
        this.parent = parent;
    }

    public abstract String toString();
}
