package io.practice.assignment;

import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.nio.file.Path;

/**
 * Created by bmwi on 3/13/18.
 */
public class BTBreadthSerialize<T> {


    public static void main(String args[]) throws Exception {
        Node rootNode = new Node();
        rootNode.data = 'd';
        rootNode.insert(rootNode, 'b');
        rootNode.insert(rootNode, 'f');
        rootNode.insert(rootNode, 'a');
        rootNode.insert(rootNode, 'c');
        rootNode.insert(rootNode, 'e');
        rootNode.insert(rootNode, 'g');
        rootNode.insert(rootNode, 'h');
        rootNode.insert(rootNode, 'j');


        BTBreadthSerialize<Character> ser = new BTBreadthSerialize<>();
        Node desrialiedNode = ser.desrialize(ser.serialize(rootNode));
        Node.visit(desrialiedNode);


    }

    public Path serialize(Node rootNode) throws Exception {

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(rootNode);
        int index = 0;
        Path path = Paths.get("/Users/bmwi/Documents/personal/adhoc/output/bt.txt");
        try (BufferedOutputStream st = new BufferedOutputStream(Files.newOutputStream(path, StandardOpenOption.TRUNCATE_EXISTING))) {
            while (!queue.isEmpty()) {
                if (index != 0) {
                    st.write(" ".getBytes());
                }
                Node node = queue.poll();
                if (node != null) {
                    st.write(node.data.toString().getBytes());
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    st.write("#".getBytes());
                }

                index++;
            }
            return path;

        }


    }

    public Node desrialize(Path path) throws Exception {

        LinkedList<Node> queue = new LinkedList<>();
        String input = new String(Files.readAllBytes(path), "UTF-8");
        String[] nodes = input.split(" ");
        Node root = new Node();
        root.data = nodes[0];
        int index = 1;
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node == null) {
                continue;
            }
            if (!nodes[index].equals("#")) {
                Node leftnode = new Node();
                leftnode.data = nodes[index];
                node.left = leftnode;
                queue.add(leftnode);
            } else {
                node.left = null;
                queue.add(null);
            }
            index++;

            if (!nodes[index].equals("#")) {
                Node rightnode = new Node();
                rightnode.data = nodes[index];
                node.right = rightnode;
                queue.add(rightnode);

            } else {
                node.right = null;
                queue.add(null);
            }
            index++;

        }
        return root;

    }


}
