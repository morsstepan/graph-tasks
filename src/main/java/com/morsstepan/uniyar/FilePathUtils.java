//package com.morsstepan.uniyar;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//public final class FilePathUtils {
//
//    public FilePathUtils() {
//
//    }
//
//    private String readFromInputStream(InputStream inputStream)
//            throws IOException {
//        StringBuilder resultStringBuilder = new StringBuilder();
//        try (BufferedReader br
//                     = new BufferedReader(new InputStreamReader(inputStream))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                resultStringBuilder.append(line).append("\n");
//            }
//        }
//        return resultStringBuilder.toString();
//    }
//
//    public Graph readGraphFromFile(String filename) {
//        ClassLoader classLoader = getClass().getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream(filename);
//        String data = "";
//        Graph graph = new Graph();
////        List<Node> graph = new ArrayList<>();
//
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            while(reader.ready()) {
//                Node node = new Node();
//                String line = reader.readLine();
//                if(line.contains("n =")) {
//                    graph.setNumberOfNodes(
//                            Integer.parseInt(line.substring(line.lastIndexOf("=") + 2))
//                    );
//                } else {
//                    String[] strings = line.split("\\s+");
//                    node.setId(strings[0]);
//                    node.setPoint(new Point(
//                            Integer.parseInt(strings[1]),
//                            Integer.parseInt(strings[2]))
//                    );
//                    graph.addNode(node);
//
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return graph;
//    }
//}
