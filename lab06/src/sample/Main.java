package sample;

import javafx.application.Application;
import javafx.scene.chart.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab 6 Solution");
        double[] avgHousingPricesByYear = { 247381.0,264171.4,287715.3,294736.1, 308431.4,322635.9,340253.0,363153.7};
        double[] avgCommercialPricesByYear = { 1121585.3,1219479.5,1246354.2,1295364.8, 1335932.6,1472362.0,1583521.9,1613246.3};

        String[] ageGroups = { "18-25", "26-35", "36-45", "46-55", "56-65", "65+"};
        int[] purchasesByAgeGroup = { 648, 1021, 2453, 3173, 1868, 2247};
        Color[] pieColours = { Color.AQUA, Color.GOLD, Color.DARKORANGE, Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM};

        CategoryAxis xBar = new CategoryAxis();
        xBar.setLabel("Years");
        NumberAxis yBar = new NumberAxis();
        yBar.setLabel("Prices ($)");
        BarChart data = new BarChart(xBar, yBar);

        XYChart.Series priceData1 = new XYChart.Series();
        priceData1.setName("House Prices");


        priceData1.getData().add(new XYChart.Data("Year 1", avgHousingPricesByYear[0]));
        priceData1.getData().add(new XYChart.Data("Year 2", avgHousingPricesByYear[1]));
        priceData1.getData().add(new XYChart.Data("Year 3", avgHousingPricesByYear[2]));
        priceData1.getData().add(new XYChart.Data("Year 4", avgHousingPricesByYear[3]));
        priceData1.getData().add(new XYChart.Data("Year 5", avgHousingPricesByYear[4]));
        priceData1.getData().add(new XYChart.Data("Year 6", avgHousingPricesByYear[5]));
        priceData1.getData().add(new XYChart.Data("Year 7", avgHousingPricesByYear[6]));
        priceData1.getData().add(new XYChart.Data("Year 8", avgHousingPricesByYear[7]));


        XYChart.Series priceData2 = new XYChart.Series();
        priceData2.setName("Commercial Prices");

        priceData2.getData().add(new XYChart.Data("Year 1", avgCommercialPricesByYear[0]));
        priceData2.getData().add(new XYChart.Data("Year 2", avgCommercialPricesByYear[1]));
        priceData2.getData().add(new XYChart.Data("Year 3", avgCommercialPricesByYear[2]));
        priceData2.getData().add(new XYChart.Data("Year 4", avgCommercialPricesByYear[3]));
        priceData2.getData().add(new XYChart.Data("Year 5", avgCommercialPricesByYear[4]));
        priceData2.getData().add(new XYChart.Data("Year 6", avgCommercialPricesByYear[5]));
        priceData2.getData().add(new XYChart.Data("Year 7", avgCommercialPricesByYear[6]));
        priceData2.getData().add(new XYChart.Data("Year 8", avgCommercialPricesByYear[7]));

        data.getData().add(priceData1);
        data.getData().add(priceData2);
        VBox displayBar = new VBox(data);

        PieChart data2 = new PieChart();
        PieChart.Data arc1 = new PieChart.Data(ageGroups[0], purchasesByAgeGroup[0]);
        PieChart.Data arc2 = new PieChart.Data(ageGroups[1], purchasesByAgeGroup[1]);
        PieChart.Data arc3 = new PieChart.Data(ageGroups[2], purchasesByAgeGroup[2]);
        PieChart.Data arc4 = new PieChart.Data(ageGroups[3], purchasesByAgeGroup[3]);
        PieChart.Data arc5 = new PieChart.Data(ageGroups[4], purchasesByAgeGroup[4]);
        PieChart.Data arc6 = new PieChart.Data(ageGroups[5], purchasesByAgeGroup[5]);

        data2.getData().addAll(arc1, arc2, arc3, arc4, arc5, arc6);
        VBox displayPie = new VBox(data2);

        HBox display = new HBox(displayBar, displayPie);

        primaryStage.setScene(new Scene(display, 1200, 550));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
