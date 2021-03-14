package com.example.suicideideation;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;


import java.util.ArrayList;
import java.util.List;

public class Anxietyscore extends AppCompatActivity {

    AnyChartView anyChartView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anxietyscore);
        Button s2 = findViewById(R.id.button);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Therapistlist.class);
                startActivity(intent);
            }
        });
        anyChartView1 = findViewById(R.id.any_chart_view);
        setupPieChart1();
    }
    public void setupPieChart1() {
        Cartesian pie1 = AnyChart.column();
        List<DataEntry> dataEntries = new ArrayList<>();

        dataEntries.add(new ValueDataEntry("Anxiety", 60));
        pie1.data(dataEntries);
        anyChartView1.setChart(pie1);
    }
}