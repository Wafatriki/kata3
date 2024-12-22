package es.ulpgc.dis;


import es.ulpgc.dis.control.HistogramGenerator;
import es.ulpgc.dis.control.TitleReader;
import es.ulpgc.dis.control.TsvTitleReader;
import es.ulpgc.dis.model.Histogram;
import es.ulpgc.dis.model.Title;
import es.ulpgc.dis.view.MainFrame;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Proporcione la ruta al archivo TSV como argumento");
            System.exit(1);
        }

        TitleReader reader = new TsvTitleReader(new File(args[0]), true);
        Histogram histogramData = generateHistograms(reader);
        display(histogramData);

    }

    private static void display(Histogram histogramData) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.put(histogramData);
        mainFrame.setVisible(true);
    }

    private static Histogram generateHistograms(TitleReader reader) throws IOException {
        List<Title> titles = reader.read();
        return new HistogramGenerator().generate(titles);
    }
}