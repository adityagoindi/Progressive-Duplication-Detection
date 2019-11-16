
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



public class Evaluation extends ApplicationFrame {

    
    public Evaluation(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
         

    }

    private XYDataset createDataset() {
 final XYSeries series1 = new XYSeries("SNM");
        series1.add(1,99);
        series1.add(10,95);
        series1.add(20,90);
        series1.add(30,85);
        series1.add(40,80);
        series1.add(50,75);
        series1.add(60,70);
        series1.add(70,65);
        series1.add(80,60);
        series1.add(90,58);
        series1.add(100,55);

        final XYSeries series2 = new XYSeries("PSNM");
        series2.add(1,95);
        series2.add(10,90);
        series2.add(20,85);
        series2.add(30,81);
        series2.add(40,75);
        series2.add(50,70);
        series2.add(60,65);
        series2.add(70,60);
        series2.add(80,57);
        series2.add(90,53);
        series2.add(100,51);

        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
      
      


        return dataset;

    }

    private JFreeChart createChart(final XYDataset dataset) {

       
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "EFFECTIVENESS",      // chart title
            " Time",                      // x axis label
            " duplication ",                      // y axis label
            dataset,                  // data
            PlotOrientation.VERTICAL,
            true,                     
            true,                     
            false                     
        );

        chart.setBackgroundPaint(Color.white);
        
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
    //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0,true);
        renderer.setSeriesShapesVisible(1, true);
        plot.setRenderer(renderer);

        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setRange(50,100);//y axis
 

        return chart;

    }

    public static void main(final String[] args) {

        final Evaluation p = new Evaluation("EFFECTIVENESS");
        p.pack();
        RefineryUtilities.centerFrameOnScreen(p);
        p.setVisible(true);

    }

//    void pack() {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
//
//    void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
//
//    void pack() {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }

}
