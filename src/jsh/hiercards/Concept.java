package jsh.hiercards;

import javafx.scene.control.TreeItem;

import java.util.ArrayList;
import java.util.List;

public class Concept extends Content {

    public List<Content> children = new ArrayList<>();

    public Concept(String name, Concept parent) {
        super(name, parent);
    }

    @Override
    public String toString() {
        return name;
    }

    /*
    @Override
    public TreeItem<Content> getTreeItem() {
        TreeItem<Content> root = new TreeItem<Content>(name);

        for (Content content : children) {
            root.getChildren().add(content.getTreeItem());
        }

        return root;
    } */
}
