package org.example;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String fileName = "beers.csv";
        String currentDir = System.getProperty("user.dir");
        String filePath = Paths.get(currentDir).resolve(fileName).toString();

        SparkSession spark = SparkSession
                .builder()
                .appName("Lab10.1")
                .master("local")
                .getOrCreate();

        Dataset<Row> df = spark.read()
                .option("header", true)
                .option("inferSchema", true)
                .csv(filePath);
        df.createOrReplaceTempView("beers");

        spark.sql("SELECT * FROM beers").show();
        spark.sql("SELECT * FROM beers WHERE abv IS NOT null ORDER BY abv ASC ").show();
        spark.sql("SELECT * FROM beers WHERE abv < 0.03").show();
        spark.sql("SELECT abv, name FROM beers WHERE abv = 0.09 OR abv = 0.08").show();
        spark.sql("SELECT * FROM beers WHERE style = 'Cider'").show();
        spark.sql("SELECT name, style, ounces FROM beers WHERE style = 'Cider' ORDER BY ounces DESC ").show();
        spark.sql("SELECT abv, name, style FROM beers WHERE name LIKE '%Cider%' ").show();
        spark.sql("SELECT abv, name FROM beers WHERE name LIKE '%Cider%' AND abv = 0.06 ").show();
        spark.sql("SELECT name, brewery_id FROM beers WHERE brewery_id = 154 ").show();
        spark.sql("SELECT name, brewery_id FROM beers WHERE brewery_id = 154 AND  name NOT LIKE '%Cider%'").show();

    }
}