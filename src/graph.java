package progressive;

import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class graph extends ApplicationFrame {

    public graph(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 570));
        setContentPane(chartPanel);

    }

    private XYDataset createDataset() {

        final XYSeries series1 = new XYSeries("Existing System");
        series1.add(0, 0);
        series1.add(20.0, 2.0);
        series1.add(30.0, 2.5);
        series1.add(40.0, 3.5);
        series1.add(50.0, 4.0);
        series1.add(60.0, 3.0);
        series1.add(70.0, 3.5);
//        series1.add(80.0, 3.5); 

        final XYSeries series2 = new XYSeries("Proposed System");
        series2.add(0.8, 0.8);
        series2.add(20.0, 3.8);
        series2.add(30.0, 4.0);
        series2.add(35.0, 5.6);
        series2.add(45.0, 6.0);
        series2.add(55.0, 6.5);
        series2.add(65.0, 7.5);
        series2.add(75.0, 7.5);
//        series2.add(85.0, 7);
        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

        return dataset;

    }

    private JFreeChart createChart(final XYDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Compare Existing and Proposed System", // chart title
                "Effectiveness", // x axis label
                "", // y axis label
                dataset, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
        );

        chart.setBackgroundPaint(Color.white);

        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

//        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
//        renderer.setSeriesLinesVisible(0, false);
//        renderer.setSeriesShapesVisible(1, false);
//        plot.setRenderer(renderer);
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        return chart;
 
    }

    public static void main(final String[] args) {

        final graph demo = new graph("Effectiveness of Proposed System");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}
