package application;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class linechart1 extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");       
        
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Stock Monitoring, 2010");
                                
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        XYChart.Series series3 = new XYChart.Series();
        
        series.setName("portfolio 1");
        series2.setName("portfolio 2");
        series3.setName("portfolio 3");
        series3.getData().add(new XYChart.Data("Jan", 21));
        series3.getData().add(new XYChart.Data("Feb", 41));
        series3.getData().add(new XYChart.Data("Mar", 51));
        series3.getData().add(new XYChart.Data("Apr", 42));
        series3.getData().add(new XYChart.Data("May", 43));
        series3.getData().add(new XYChart.Data("Jun", 64));
        series3.getData().add(new XYChart.Data("Jul", 52));
        series3.getData().add(new XYChart.Data("Aug", 24));
        series3.getData().add(new XYChart.Data("Sep", 14));
        series3.getData().add(new XYChart.Data("Oct", 32));
        series3.getData().add(new XYChart.Data("Nov", 11));
        series3.getData().add(new XYChart.Data("Dec", 42));
        
        series2.getData().add(new XYChart.Data("Jan", 2));
        series2.getData().add(new XYChart.Data("Feb", 4));
        series2.getData().add(new XYChart.Data("Mar", 5));
        series2.getData().add(new XYChart.Data("Apr", 4));
        series2.getData().add(new XYChart.Data("May", 4));
        series2.getData().add(new XYChart.Data("Jun", 6));
        series2.getData().add(new XYChart.Data("Jul", 32));
        series2.getData().add(new XYChart.Data("Aug", 44));
        series2.getData().add(new XYChart.Data("Sep", 42));
        series2.getData().add(new XYChart.Data("Oct", 12));
        series2.getData().add(new XYChart.Data("Nov", 21));
        series2.getData().add(new XYChart.Data("Dec", 22));
        
        series.getData().add(new XYChart.Data("Jan", 23));
        series.getData().add(new XYChart.Data("Feb", 14));
        series.getData().add(new XYChart.Data("Mar", 15));
        series.getData().add(new XYChart.Data("Apr", 24));
        series.getData().add(new XYChart.Data("May", 34));
        series.getData().add(new XYChart.Data("Jun", 36));
        series.getData().add(new XYChart.Data("Jul", 22));
        series.getData().add(new XYChart.Data("Aug", 45));
        series.getData().add(new XYChart.Data("Sep", 43));
        series.getData().add(new XYChart.Data("Oct", 17));
        series.getData().add(new XYChart.Data("Nov", 29));
        series.getData().add(new XYChart.Data("Dec", 25));
        
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
        lineChart.getData().add(series2);
        lineChart.getData().add(series3);
        
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}