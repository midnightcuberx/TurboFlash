import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

class Main extends JFrame {

    public static void main(String[] args) {
        // ArrayList<ArrayList<ArrayList<Integer>>> a = new ArrayList<>();
        // for (int i = 0; i)
        // GraphGenerator gg = new GraphGenerator();
        // gg.createGraph(GraphType.Directed, 6);
        // System.out.println(gg.getGraphs().get(0).toString());
        /*
         * Graph g = new SimpleGraph();
         * BFSManager m = new BFSManager(g);
         * m.bfs();
         * System.out.println(Arrays.toString(m.getBfsOrder()));
         * System.out.println(g.getAdjList());
         */
        // System.out.println(Double.POSITIVE_INFINITY > Double.POSITIVE_INFINITY - 1);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

    public Main() {
        super("TurboFlash");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        // add(setup(), BorderLayout.NORTH);
        // add(mainSetup(), BorderLayout.EAST);
        // add(infoSetup(), BorderLayout.WEST);
        setVisible(true);
    }
}