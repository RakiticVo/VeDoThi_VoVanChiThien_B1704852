package com.chithien.vvct.vedothi_vovanchithien_b1704852;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart2;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart3;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart4;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart5;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart6;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart7;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart8;
import com.chithien.vvct.vedothi_vovanchithien_b1704852.PieChart.pieChart9;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PieChartsActivity extends AppCompatActivity {

    EditText edtDes1, edtDes2, edtDes3, edtDes4, edtDes5, edtDes6, edtDes7, edtDes8, edtDes9;
    EditText edttitle;
    EditText edtso1, edtso2, edtso3, edtso4, edtso5, edtso6, edtso7, edtso8, edtso9;
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    TextView tvDes;
    TextView tvAmount,tvtlaytitle;
    TextView tvpt,tvTotal,tvTotalPt;
    int vitri;
    String Des1,Des2,Des3,Des4,Des5,Des6,Des7,Des8,Des9;
    double amount1,amount2,amount3,amount4,amount5,amount6,amount7,amount8,amount9;
    double amountbar1,amountbar2,amountbar3,amountbar4,amountbar5,amountbar6,amountbar7,amountbar8,amountbar9;
    double tong3,tong3pt,totalAmount;
    TableLayout tableLayout;
    LinearLayout linearLayout1,linearLayout2;
    TableRow tableRow1,tableRow2,tableRow3,tableRow4,tableRow5,tableRow6,tableRow7,tableRow8,tableRow9;
    LinearLayout linearLayout;
    PieChart pieChartMp;
    BarChart mChart;
    BarData databar2,databar3,databar4,databar5,databar6,databar7,databar8,databar9;
    Spinner spinner;
    int id;
    Button btnVeMp,btnPieChart,btnthoat,btnLineChart,btnbarChart,btnVeBar,btnFxChart,btnthoatbarChart;
    PieData data,data3,data4,data5,data6,data2,data7,data8,data9;
    Button btnsave,btnsavebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_charts);
        pieChartMp=(PieChart)findViewById(R.id.PieChartMp);
        pieChartMp.setVisibility(View.INVISIBLE);
        btnsave=(Button)findViewById(R.id.btnluu);
        edttitle=(EditText)findViewById(R.id.edtTitle);
        tvTotal=(TextView)findViewById(R.id.tvTotal1);
        tvTotalPt=(TextView)findViewById(R.id.tvTotal2);
        edtso1=(EditText)findViewById(R.id.edtAmount1);
        edtso2=(EditText)findViewById(R.id.edtAmount2);
        edtso3=(EditText)findViewById(R.id.edtAmount3);
        edtso4=(EditText)findViewById(R.id.edtAmount4);
        edtso5=(EditText)findViewById(R.id.edtAmount5);
        edtso6=(EditText)findViewById(R.id.edtAmount6);
        edtso7=(EditText)findViewById(R.id.edtAmount7);
        edtso8=(EditText)findViewById(R.id.edtAmount8);
        edtso9=(EditText)findViewById(R.id.edtAmount9);
        edtDes1=(EditText)findViewById(R.id.edtDescription1);
        edtDes2=(EditText)findViewById(R.id.edtDescription2);
        edtDes3=(EditText)findViewById(R.id.edtDescription3);
        edtDes4=(EditText)findViewById(R.id.edtDescription4);
        edtDes5=(EditText)findViewById(R.id.edtDescription5);
        edtDes6=(EditText)findViewById(R.id.edtDescription6);
        edtDes7=(EditText)findViewById(R.id.edtDescription7);
        edtDes8=(EditText)findViewById(R.id.edtDescription8);
        edtDes9=(EditText)findViewById(R.id.edtDescription9);
        tv1=(TextView)findViewById(R.id.tvphantram1);
        tv2=(TextView)findViewById(R.id.tvphantram2);
        tv3=(TextView) findViewById(R.id.tvphantram3);
        tv4=(TextView)findViewById(R.id.tvphantram4);
        tv5=(TextView)findViewById(R.id.tvphantram5);
        tv6=(TextView)findViewById(R.id.tvphantram6);
        tv7=(TextView)findViewById(R.id.tvphantram7);
        tv8=(TextView)findViewById(R.id.tvphantram8);
        tv9=(TextView)findViewById(R.id.tvphantram9);
        tvtlaytitle=(TextView)findViewById(R.id.laytitle);
        tableRow1=(TableRow)findViewById(R.id.tableRow1);
        tableRow2=(TableRow)findViewById(R.id.tableRow2);
        tableRow3=(TableRow)findViewById(R.id.tableRow3);
        tableRow4=(TableRow)findViewById(R.id.tableRow4);
        tableRow5=(TableRow)findViewById(R.id.tableRow5);
        tableRow6=(TableRow)findViewById(R.id.tableRow6);
        tableRow7=(TableRow)findViewById(R.id.tableRow7);
        tableRow8=(TableRow)findViewById(R.id.tableRow8);
        tableRow9=(TableRow)findViewById(R.id.tableRow9);
        tableLayout=(TableLayout)findViewById(R.id.tableLayout);
        btnVeMp=(Button)findViewById(R.id.btnVePieCharts);
        btnthoat=(Button)findViewById(R.id.btnthoatPieCharts);
        btnsave = (Button)findViewById(R.id.btnluu);
        btnthoat.setVisibility(View.INVISIBLE);
        btnsave.setVisibility(View.INVISIBLE);
        //tableLayout.setVisibility(View.INVISIBLE);

        //t???o bi???u tr??n
        //t???o spinner
        spinner = (Spinner) findViewById(R.id.spinnerMp);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        //????a spinner v??o ArrayAdapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new MpAndroidChart());
        //v??? ????? th??? (pieChartMp l?? th??? hi???n c???a giao di???n ????? th??? PieChartMP)
        pieChartMp.setUsePercentValues(true);
        //pieChartMp.getDescription().setEnabled(false);
        pieChartMp.setExtraOffsets(5, 10, 5, 5);
        pieChartMp.setDragDecelerationFrictionCoef(0.95f);
        pieChartMp.setCenterText(generateCenterSpannableText());
        pieChartMp.setExtraOffsets(20.f, 0.f, 20.f, 0.f);
        //t???o ???????ng tr??n ??? trong
        pieChartMp.setDrawHoleEnabled(true);
        pieChartMp.setHoleColor(Color.WHITE);
        //t???o ???????ng vi???n b??n trong h??nht tr??n
        pieChartMp.setTransparentCircleColor(Color.WHITE);
        pieChartMp.setTransparentCircleAlpha(110);
        pieChartMp.setCenterTextColor(Color.BLACK);

        pieChartMp.setHoleRadius(52f);//58
        pieChartMp.setTransparentCircleRadius(55f);//61
        pieChartMp.setDrawCenterText(true);
        pieChartMp.setRotationAngle(0);
        // enable rotation of the chart by touch
        pieChartMp.setRotationEnabled(true);
        pieChartMp.setHighlightPerTapEnabled(true);
        btnVeMp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnthoat.setVisibility(View.VISIBLE);
                btnsave.setVisibility(View.VISIBLE);
                //tableLayout.setVisibility(View.VISIBLE);
                tvtlaytitle.setVisibility(View.INVISIBLE);
                switch (vitri){
                    case 2:
                        Des1=edtDes1.getText().toString();
                        Des2=edtDes2.getText().toString();
                        //l???y title
                        String lay2=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay2);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s???th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt2=amount1+amount2;
                        double in12=((amount1/tong3pt2)*100);
                        double in22=((amount2/tong3pt2)*100);
                        String edtphantram12 = df.format(in12);
                        String edtphantram22=df.format(in22);
                        tv1.setText(edtphantram12);
                        tv2.setText(edtphantram22);
                        //t???ng s??? li???u nh???p v??o
                        double tong=amount1+amount2;
                        String togAmount=Double.toString(tong);
                        tvTotal.setText(togAmount);
                        //t???ng s??? ph???n tr??m
                        double tong2=in12+in22;
                        String tongpt=df.format(tong2);
                        tvTotalPt.setText(tongpt);
                        //t???o setData
                        setData2(2,100);
                        pieChartMp.setData(data2);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        //intent
                        Intent intent2=new Intent(PieChartsActivity.this, pieChart2.class);
                        intent2.putExtra("segment2",amount2);
                        intent2.putExtra("segment1",amount1);
                        intent2.putExtra("tendothi",lay2);
                        intent2.putExtra("Des1",Des1);
                        intent2.putExtra("Des2",Des2);
                        startActivity(intent2);
                        break;
                    case 3:
                        //l???y title
                        String lay3=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay3);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df3= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                            tong3pt=amount1+amount2+amount3;
                        double in13=((amount1/tong3pt)*100);
                        double in23=((amount2/tong3pt)*100);
                        double in33=((amount3/tong3pt)*100);
                        String edtphantram13 = df3.format(in13);
                        String edtphantram23=df3.format(in23);
                        String edtphantram33=df3.format(in33);
                        tv1.setText(edtphantram13);
                        tv2.setText(edtphantram23);
                        tv3.setText(edtphantram33);
                        //t???ng s??? li???u nh???p v??o
                        double tong3=amount1+amount2+amount3;
                        String togAmount3=Double.toString(tong3);
                        tvTotal.setText(togAmount3);
                        //t???ng s??? ph???n tr??m
                        double tong23=in13+in23+in33;
                        String tongpt3=df3.format(tong23);
                        tvTotalPt.setText(tongpt3);
                        //t???o setData
                        setData3(3,100);
                        pieChartMp.setData(data3);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent3=new Intent(PieChartsActivity.this, pieChart3.class);
                        //Bundle bundle2=new Bundle();
                        intent3.putExtra("segment2",amount2);
                        intent3.putExtra("segment1",amount1);
                        intent3.putExtra("segment3",amount3);
                        intent3.putExtra("tendothi",lay3);
                        intent3.putExtra("Des1",Des1);
                        intent3.putExtra("Des2",Des2);
                        intent3.putExtra("Des3",Des3);
                        startActivity(intent3);
                        break;
                    case 4:
                        //l???y title
                        String lay4=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay4);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df34= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt4=amount1+amount2+amount3+amount4;
                        double in134=((amount1/tong3pt4)*100);
                        double in234=((amount2/tong3pt4)*100);
                        double in334=((amount3/tong3pt4)*100);
                        double in444=((amount4/tong3pt4)*100);
                        String edtphantram134 = df34.format(in134);
                        String edtphantram234=df34.format(in234);
                        String edtphantram334=df34.format(in334);
                        String edtphantram444=df34.format(in444);
                        tv1.setText(edtphantram134);
                        tv2.setText(edtphantram234);
                        tv3.setText(edtphantram334);
                        tv4.setText(edtphantram444);
                        //t???ng s??? li???u nh???p v??o
                        double tong34=amount1+amount2+amount3+amount4;
                        String togAmount34=df34.format(tong34);
                        tvTotal.setText(togAmount34);
                        //t???ng s??? ph???n tr??m
                        double tong234=in134+in234+in334+in444;
                        String tongpt34=df34.format(tong234);
                        tvTotalPt.setText(tongpt34);
                        //t???o setData
                        setData4(4,100);
                        pieChartMp.setData(data4);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent4=new Intent(PieChartsActivity.this, pieChart4.class);
                        //Bundle bundle2=new Bundle();
                        intent4.putExtra("segment2",amount2);
                        intent4.putExtra("segment1",amount1);
                        intent4.putExtra("segment3",amount3);
                        intent4.putExtra("segment4",amount4);
                        intent4.putExtra("tendothi",lay4);
                        intent4.putExtra("Des1",Des1);
                        intent4.putExtra("Des2",Des2);
                        intent4.putExtra("Des3",Des3);
                        intent4.putExtra("Des4",Des4);
                        startActivity(intent4);
                        break;
                    case 5:
                        //l???y title
                        String lay5=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay5);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df345= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt45=amount1+amount2+amount3+amount4+amount5;
                        double in1345=((amount1/tong3pt45)*100);
                        double in2345=((amount2/tong3pt45)*100);
                        double in3345=((amount3/tong3pt45)*100);
                        double in4445=((amount4/tong3pt45)*100);
                        double in5555=((amount5/tong3pt45)*100);
                        String edtphantram1345 = df345.format(in1345);
                        String edtphantram2345=df345.format(in2345);
                        String edtphantram3345=df345.format(in3345);
                        String edtphantram4445=df345.format(in4445);
                        String edtphantram5555=df345.format(in5555);
                        tv1.setText(edtphantram1345);
                        tv2.setText(edtphantram2345);
                        tv3.setText(edtphantram3345);
                        tv4.setText(edtphantram4445);
                        tv5.setText(edtphantram5555);
                        //t???ng s??? li???u nh???p v??o
                        double tong345=amount1+amount2+amount3+amount4+amount5;
                        String togAmount345=df345.format(tong345);
                        tvTotal.setText(togAmount345);
                        //t???ng s??? ph???n tr??m
                        double tong2345=in1345+in2345+in3345+in4445+in5555;
                        String tongpt345=df345.format(tong2345);
                        tvTotalPt.setText(tongpt345);
                        //t???o setData
                        setData5(5,100);
                        pieChartMp.setData(data5);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent5=new Intent(PieChartsActivity.this, pieChart5.class);
                        //Bundle bundle2=new Bundle();
                        intent5.putExtra("segment2",amount2);
                        intent5.putExtra("segment1",amount1);
                        intent5.putExtra("segment3",amount3);
                        intent5.putExtra("segment4",amount4);
                        intent5.putExtra("segment5",amount5);
                        intent5.putExtra("tendothi",lay5);
                        intent5.putExtra("Des1",Des1);
                        intent5.putExtra("Des2",Des2);
                        intent5.putExtra("Des3",Des3);
                        intent5.putExtra("Des4",Des4);
                        intent5.putExtra("Des5",Des5);
                        startActivity(intent5);
                        break;
                    case 6:
                        //l???y title
                        String lay6=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay6);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df3456= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt456=amount1+amount2+amount3+amount4+amount5+amount6;
                        double in13456=((amount1/tong3pt456)*100);
                        double in23456=((amount2/tong3pt456)*100);
                        double in33456=((amount3/tong3pt456)*100);
                        double in44456=((amount4/tong3pt456)*100);
                        double in55556=((amount5/tong3pt456)*100);
                        double in66666=((amount6/tong3pt456)*100);
                        String edtphantram13456 = df3456.format(in13456);
                        String edtphantram23456=df3456.format(in23456);
                        String edtphantram33456=df3456.format(in33456);
                        String edtphantram44456=df3456.format(in44456);
                        String edtphantram55556=df3456.format(in55556);
                        String edtphantram66666=df3456.format(in66666);
                        tv1.setText(edtphantram13456);
                        tv2.setText(edtphantram23456);
                        tv3.setText(edtphantram33456);
                        tv4.setText(edtphantram44456);
                        tv5.setText(edtphantram55556);
                        tv6.setText(edtphantram66666);
                        //t???ng s??? li???u nh???p v??o
                        double tong3456=amount1+amount2+amount3+amount4+amount5+amount6;
                        String togAmount3456=df3456.format(tong3456);
                        tvTotal.setText(togAmount3456);
                        //t???ng s??? ph???n tr??m
                        double tong23456=in13456+in23456+in33456+in44456+in55556+in66666;
                        String tongpt3456=df3456.format(tong23456);
                        tvTotalPt.setText(tongpt3456);
                        //t???o setData
                        setData6(6,100);
                        pieChartMp.setData(data6);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent6=new Intent(PieChartsActivity.this, pieChart6.class);
                        //Bundle bundle2=new Bundle();
                        intent6.putExtra("segment2",amount2);
                        intent6.putExtra("segment1",amount1);
                        intent6.putExtra("segment3",amount3);
                        intent6.putExtra("segment4",amount4);
                        intent6.putExtra("segment5",amount5);
                        intent6.putExtra("segment6",amount6);
                        intent6.putExtra("tendothi",lay6);
                        intent6.putExtra("Des1",Des1);
                        intent6.putExtra("Des2",Des2);
                        intent6.putExtra("Des3",Des3);
                        intent6.putExtra("Des4",Des4);
                        intent6.putExtra("Des5",Des5);
                        intent6.putExtra("Des6",Des6);
                        startActivity(intent6);
                        break;
                    case 7:
                        //l???y title
                        String lay7=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay7);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        amount7=Double.parseDouble(edtso7.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df34567= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double
                                tong3pt4567=amount1+amount2+amount3+amount4+amount5+amount6+amount7;
                        double in134567=((amount1/tong3pt4567)*100);
                        double in234567=((amount2/tong3pt4567)*100);
                        double in334567=((amount3/tong3pt4567)*100);
                        double in444567=((amount4/tong3pt4567)*100);
                        double in555567=((amount5/tong3pt4567)*100);
                        double in666667=((amount6/tong3pt4567)*100);
                        double in777777=((amount7/tong3pt4567)*100);
                        String edtphantram134567 = df34567.format(in134567);
                        String edtphantram234567=df34567.format(in234567);
                        String edtphantram334567=df34567.format(in334567);
                        String edtphantram444567=df34567.format(in444567);
                        String edtphantram555567=df34567.format(in555567);
                        String edtphantram666667=df34567.format(in666667);
                        String edtphantram777777=(df34567.format(in777777));
                        tv1.setText(edtphantram134567);
                        tv2.setText(edtphantram234567);
                        tv3.setText(edtphantram334567);
                        tv4.setText(edtphantram444567);
                        tv5.setText(edtphantram555567);
                        tv6.setText(edtphantram666667);
                        tv7.setText(edtphantram777777);
                        //t???ng s??? li???u nh???p v??o
                        double
                                tong34567=amount1+amount2+amount3+amount4+amount5+amount6+amount7;
                        String togAmount34567=df34567.format(tong34567);
                        tvTotal.setText(togAmount34567);
                        //t???ng s??? ph???n tr??m
                        double
                                tong234567=in134567+in234567+in334567+in444567+in555567+in666667+in777777;
                        String tongpt34567=df34567.format(tong234567);
                        tvTotalPt.setText(tongpt34567);
                        //t???o setData
                        setData7(7,100);
                        pieChartMp.setData(data7);
                        pieChartMp.setVisibility(View.VISIBLE);
                        Intent intent7=new Intent(PieChartsActivity.this, pieChart7.class);
                        //Bundle bundle2=new Bundle();
                        intent7.putExtra("segment2",amount2);
                        intent7.putExtra("segment1",amount1);
                        intent7.putExtra("segment3",amount3);
                        intent7.putExtra("segment4",amount4);
                        intent7.putExtra("segment5",amount5);
                        intent7.putExtra("segment6",amount6);
                        intent7.putExtra("segment7",amount7);
                        intent7.putExtra("tendothi",lay7);
                        intent7.putExtra("Des1",Des1);
                        intent7.putExtra("Des2",Des2);
                        intent7.putExtra("Des3",Des3);
                        intent7.putExtra("Des4",Des4);
                        intent7.putExtra("Des5",Des5);
                        intent7.putExtra("Des6",Des6);
                        intent7.putExtra("Des7",Des7);
                        startActivity(intent7);
                        break;
                    case 8:
                        //l???y title
                        String lay8=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay8);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        amount7=Double.parseDouble(edtso7.getText().toString());
                        amount8=Double.parseDouble(edtso8.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df345678= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double
                                tong3pt45678=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8;
                        double in1345678=((amount1/tong3pt45678)*100);
                        double in2345678=((amount2/tong3pt45678)*100);
                        double in3345678=((amount3/tong3pt45678)*100);
                        double in4445678=((amount4/tong3pt45678)*100);
                        double in5555678=((amount5/tong3pt45678)*100);
                        double in6666678=((amount6/tong3pt45678)*100);
                        double in7777778=((amount7/tong3pt45678)*100);
                        double in8888888=((amount8/tong3pt45678)*100);
                        String edtphantram1345678 = df345678.format(in1345678);
                        String edtphantram2345678=df345678.format(in2345678);
                        String edtphantram3345678=df345678.format(in3345678);
                        String edtphantram4445678=df345678.format(in4445678);
                        String edtphantram5555678=df345678.format(in5555678);
                        String edtphantram6666678=df345678.format(in6666678);
                        String edtphantram7777778=(df345678.format(in7777778));
                        String edtphantram8888888=(df345678.format(in8888888));
                        tv1.setText(edtphantram1345678);
                        tv2.setText(edtphantram2345678);
                        tv3.setText(edtphantram3345678);
                        tv4.setText(edtphantram4445678);
                        tv5.setText(edtphantram5555678);
                        tv6.setText(edtphantram6666678);
                        tv7.setText(edtphantram7777778);
                        tv8.setText(edtphantram8888888);
                        //t???ng s??? li???u nh???p v??o
                        double
                                tong345678=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8;
                        String togAmount345678=df345678.format(tong345678);
                        tvTotal.setText(togAmount345678);
                        //t???ng s??? ph???n tr??m
                        double
                                tong2345678=in1345678+in2345678+in3345678+in4445678+in5555678+in6666678+in7777778+in8888888
                                ;
                        String tongpt345678=df345678.format(tong2345678);
                        tvTotalPt.setText(tongpt345678);
                        //t???o setData
                        setData8(8,100);
                        pieChartMp.setData(data8);
                        pieChartMp.setVisibility(View.VISIBLE);
                        Intent intent8=new Intent(PieChartsActivity.this, pieChart8.class);
                        //Bundle bundle2=new Bundle();
                        intent8.putExtra("segment2",amount2);
                        intent8.putExtra("segment1",amount1);
                        intent8.putExtra("segment3",amount3);
                        intent8.putExtra("segment4",amount4);
                        intent8.putExtra("segment5",amount5);
                        intent8.putExtra("segment6",amount6);
                        intent8.putExtra("segment7",amount7);
                        intent8.putExtra("segment8",amount8);
                        intent8.putExtra("tendothi",lay8);
                        intent8.putExtra("Des1",Des1);
                        intent8.putExtra("Des2",Des2);
                        intent8.putExtra("Des3",Des3);
                        intent8.putExtra("Des4",Des4);
                        intent8.putExtra("Des5",Des5);
                        intent8.putExtra("Des6",Des6);
                        intent8.putExtra("Des7",Des7);
                        intent8.putExtra("Des8",Des8);
                        startActivity(intent8);
                        break;
                    case 9:
                        //l???y title
                        String lay9=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay9);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        amount7=Double.parseDouble(edtso7.getText().toString());
                        amount8=Double.parseDouble(edtso8.getText().toString());
                        amount9=Double.parseDouble(edtso9.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df3456789= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double
                                tong3pt456789=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8+amount9;
                        double in13456789=((amount1/tong3pt456789)*100);
                        double in23456789=((amount2/tong3pt456789)*100);
                        double in33456789=((amount3/tong3pt456789)*100);
                        double in44456789=((amount4/tong3pt456789)*100);
                        double in55556789=((amount5/tong3pt456789)*100);
                        double in66666789=((amount6/tong3pt456789)*100);
                        double in77777789=((amount7/tong3pt456789)*100);
                        double in88888889=((amount8/tong3pt456789)*100);
                        double in99999999=((amount9/tong3pt456789)*100);
                        String edtphantram13456789 = df3456789.format(in13456789);
                        String edtphantram23456789=df3456789.format(in23456789);
                        String edtphantram33456789=df3456789.format(in33456789);
                        String edtphantram44456789=df3456789.format(in44456789);
                        String edtphantram55556789=df3456789.format(in55556789);
                        String edtphantram66666789=df3456789.format(in66666789);
                        String edtphantram77777789=df3456789.format(in77777789);
                        String edtphantram88888889=df3456789.format(in88888889);
                        String edtphantram99999999=df3456789.format(in99999999);
                        tv1.setText(edtphantram13456789);
                        tv2.setText(edtphantram23456789);
                        tv3.setText(edtphantram33456789);
                        tv4.setText(edtphantram44456789);
                        tv5.setText(edtphantram55556789);
                        tv6.setText(edtphantram66666789);
                        tv7.setText(edtphantram77777789);
                        tv8.setText(edtphantram88888889);
                        tv9.setText(edtphantram99999999);
                        //t???ng s??? li???u nh???p v??o
                        double
                                tong3456789=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8+amount9;
                        String togAmount3456789=Double.toString(tong3456789);
                        tvTotal.setText(togAmount3456789);
                        //t???ng s??? ph???n tr??m
                        double
                                tong23456789 = in13456789+in23456789+in33456789+in44456789+in55556789+in66666789+in77777789+in88888889+in99999999;
                        String tongpt3456789=df3456789.format(tong23456789);
                        tvTotalPt.setText(tongpt3456789);
                        //t???o setData
                        setData9(9,100);
                        pieChartMp.setData(data9);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent9=new Intent(PieChartsActivity.this, pieChart9.class);
                        //Bundle bundle2=new Bundle();
                        intent9.putExtra("segment2",amount2);
                        intent9.putExtra("segment1",amount1);
                        intent9.putExtra("segment3",amount3);
                        intent9.putExtra("segment4",amount4);
                        intent9.putExtra("segment5",amount5);
                        intent9.putExtra("segment6",amount6);
                        intent9.putExtra("segment7",amount7);
                        intent9.putExtra("segment8",amount8);
                        intent9.putExtra("segment9",amount9);
                        intent9.putExtra("tendothi",lay9);
                        intent9.putExtra("Des1",Des1);
                        intent9.putExtra("Des2",Des2);
                        intent9.putExtra("Des3",Des3);
                        intent9.putExtra("Des4",Des4);
                        intent9.putExtra("Des5",Des5);
                        intent9.putExtra("Des6",Des6);
                        intent9.putExtra("Des7",Des7);
                        intent9.putExtra("Des8",Des8);
                        intent9.putExtra("Des9",Des9);
                        startActivity(intent9);
                        break;
                }
            }
        });
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pieChartMp.saveToPath("Hinh Pie2","");
                Toast.makeText(PieChartsActivity.this,"L??u h??nh ???nh pie th??nh c??ng",Toast.LENGTH_LONG).show();
            }
        });
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setTextSize(12);
        l.setDrawInside(false);
        l.setEnabled(true);
        // X??? l??? nut Tho??t
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        btnVeMp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (vitri){
                    case 2:
                        Des1=edtDes1.getText().toString();
                        Des2=edtDes2.getText().toString();
                        //l???y title
                        String lay2=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay2);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt2=amount1+amount2;
                        double in12=((amount1/tong3pt2)*100);
                        double in22=((amount2/tong3pt2)*100);
                        String edtphantram12 = df.format(in12);
                        String edtphantram22=df.format(in22);
                        tv1.setText(edtphantram12);
                        tv2.setText(edtphantram22);
                        //t???ng s??? li???u nh???p v??o
                        double tong=amount1+amount2;
                        String togAmount=Double.toString(tong);
                        tvTotal.setText(togAmount);
                        //t???ng s??? ph???n tr??m
                        double tong2=in12+in22;
                        String tongpt=df.format(tong2);
                        tvTotalPt.setText(tongpt);
                        //t???o setData
                        setData2(2,100);
                        pieChartMp.setData(data2);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        //intent
                        Intent intent2=new Intent(PieChartsActivity.this,pieChart2.class);
                        intent2.putExtra("segment2",amount2);
                        intent2.putExtra("segment1",amount1);
                        intent2.putExtra("tendothi",lay2);
                        intent2.putExtra("Des1",Des1);
                        intent2.putExtra("Des2",Des2);
                        startActivity(intent2);
                        break;
                    case 3:
                        //l???y title
                        String lay3=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay3);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df3= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                            tong3pt=amount1+amount2+amount3;
                        double in13=((amount1/tong3pt)*100);
                        double in23=((amount2/tong3pt)*100);
                        double in33=((amount3/tong3pt)*100);
                        String edtphantram13 = df3.format(in13);
                        String edtphantram23=df3.format(in23);
                        String edtphantram33=df3.format(in33);
                        tv1.setText(edtphantram13);
                        tv2.setText(edtphantram23);
                        tv3.setText(edtphantram33);
                        //t???ng s??? li???u nh???p v??o
                        double tong3=amount1+amount2+amount3;
                        String togAmount3=Double.toString(tong3);
                        tvTotal.setText(togAmount3);
                        //t???ng s??? ph???n tr??m
                        double tong23=in13+in23+in33;
                        String tongpt3=df3.format(tong23);
                        tvTotalPt.setText(tongpt3);
                        //t???o setData
                        setData3(3,100);
                        pieChartMp.setData(data3);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent3=new Intent(PieChartsActivity.this,pieChart3.class);
                        //Bundle bundle2=new Bundle();
                        intent3.putExtra("segment2",amount2);
                        intent3.putExtra("segment1",amount1);
                        intent3.putExtra("segment3",amount3);
                        intent3.putExtra("tendothi",lay3);
                        intent3.putExtra("Des1",Des1);
                        intent3.putExtra("Des2",Des2);
                        intent3.putExtra("Des3",Des3);
                        startActivity(intent3);
                        break;
                    case 4:
                        //l???y title
                        String lay4=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay4);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df34= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt4=amount1+amount2+amount3+amount4;
                        double in134=((amount1/tong3pt4)*100);
                        double in234=((amount2/tong3pt4)*100);
                        double in334=((amount3/tong3pt4)*100);
                        double in444=((amount4/tong3pt4)*100);
                        String edtphantram134 = df34.format(in134);
                        String edtphantram234=df34.format(in234);
                        String edtphantram334=df34.format(in334);
                        String edtphantram444=df34.format(in444);
                        tv1.setText(edtphantram134);
                        tv2.setText(edtphantram234);
                        tv3.setText(edtphantram334);
                        tv4.setText(edtphantram444);
                        //t???ng s??? li???u nh???p v??o
                        double tong34=amount1+amount2+amount3+amount4;
                        String togAmount34=df34.format(tong34);
                        tvTotal.setText(togAmount34);
                        //t???ng s??? ph???n tr??m
                        double tong234=in134+in234+in334+in444;
                        String tongpt34=df34.format(tong234);
                        tvTotalPt.setText(tongpt34);
                        //t???o setData
                        setData4(4,100);
                        pieChartMp.setData(data4);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent4=new Intent(PieChartsActivity.this,pieChart4.class);
                        //Bundle bundle2=new Bundle();
                        intent4.putExtra("segment2",amount2);
                        intent4.putExtra("segment1",amount1);
                        intent4.putExtra("segment3",amount3);
                        intent4.putExtra("segment4",amount4);
                        intent4.putExtra("tendothi",lay4);
                        intent4.putExtra("Des1",Des1);
                        intent4.putExtra("Des2",Des2);
                        intent4.putExtra("Des3",Des3);
                        intent4.putExtra("Des4",Des4);
                        startActivity(intent4);
                        break;
                    case 5:
                        //l???y title
                        String lay5=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay5);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df345= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt45=amount1+amount2+amount3+amount4+amount5;
                        double in1345=((amount1/tong3pt45)*100);
                        double in2345=((amount2/tong3pt45)*100);
                        double in3345=((amount3/tong3pt45)*100);
                        double in4445=((amount4/tong3pt45)*100);
                        double in5555=((amount5/tong3pt45)*100);
                        String edtphantram1345 = df345.format(in1345);
                        String edtphantram2345=df345.format(in2345);
                        String edtphantram3345=df345.format(in3345);
                        String edtphantram4445=df345.format(in4445);
                        String edtphantram5555=df345.format(in5555);
                        tv1.setText(edtphantram1345);
                        tv2.setText(edtphantram2345);
                        tv3.setText(edtphantram3345);
                        tv4.setText(edtphantram4445);
                        tv5.setText(edtphantram5555);
                        //t???ng s??? li???u nh???p v??o
                        double tong345=amount1+amount2+amount3+amount4+amount5;
                        String togAmount345=df345.format(tong345);
                        tvTotal.setText(togAmount345);
                        //t???ng s??? ph???n tr??m
                        double tong2345=in1345+in2345+in3345+in4445+in5555;
                        String tongpt345=df345.format(tong2345);
                        tvTotalPt.setText(tongpt345);
                        //t???o setData
                        setData5(5,100);
                        pieChartMp.setData(data5);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent5=new Intent(PieChartsActivity.this,pieChart5.class);
                        //Bundle bundle2=new Bundle();
                        intent5.putExtra("segment2",amount2);
                        intent5.putExtra("segment1",amount1);
                        intent5.putExtra("segment3",amount3);
                        intent5.putExtra("segment4",amount4);
                        intent5.putExtra("segment5",amount5);
                        intent5.putExtra("tendothi",lay5);
                        intent5.putExtra("Des1",Des1);
                        intent5.putExtra("Des2",Des2);
                        intent5.putExtra("Des3",Des3);
                        intent5.putExtra("Des4",Des4);
                        intent5.putExtra("Des5",Des5);
                        startActivity(intent5);
                        break;
                    case 6:
                        //l???y title
                        String lay6=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay6);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df3456= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double tong3pt456=amount1+amount2+amount3+amount4+amount5+amount6;
                        double in13456=((amount1/tong3pt456)*100);
                        double in23456=((amount2/tong3pt456)*100);
                        double in33456=((amount3/tong3pt456)*100);
                        double in44456=((amount4/tong3pt456)*100);
                        double in55556=((amount5/tong3pt456)*100);
                        double in66666=((amount6/tong3pt456)*100);
                        String edtphantram13456 = df3456.format(in13456);
                        String edtphantram23456=df3456.format(in23456);
                        String edtphantram33456=df3456.format(in33456);
                        String edtphantram44456=df3456.format(in44456);
                        String edtphantram55556=df3456.format(in55556);
                        String edtphantram66666=df3456.format(in66666);
                        tv1.setText(edtphantram13456);
                        tv2.setText(edtphantram23456);
                        tv3.setText(edtphantram33456);
                        tv4.setText(edtphantram44456);
                        tv5.setText(edtphantram55556);
                        tv6.setText(edtphantram66666);
                        //t???ng s??? li???u nh???p v??o
                        double tong3456=amount1+amount2+amount3+amount4+amount5+amount6;
                        String togAmount3456=df3456.format(tong3456);
                        tvTotal.setText(togAmount3456);
                        //t???ng s??? ph???n tr??m
                        double tong23456=in13456+in23456+in33456+in44456+in55556+in66666;
                        String tongpt3456=df3456.format(tong23456);
                        tvTotalPt.setText(tongpt3456);
                        //t???o setData
                        setData6(6,100);
                        pieChartMp.setData(data6);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent6=new Intent(PieChartsActivity.this,pieChart6.class);
                        //Bundle bundle2=new Bundle();
                        intent6.putExtra("segment2",amount2);
                        intent6.putExtra("segment1",amount1);
                        intent6.putExtra("segment3",amount3);
                        intent6.putExtra("segment4",amount4);
                        intent6.putExtra("segment5",amount5);
                        intent6.putExtra("segment6",amount6);
                        intent6.putExtra("tendothi",lay6);
                        intent6.putExtra("Des1",Des1);
                        intent6.putExtra("Des2",Des2);
                        intent6.putExtra("Des3",Des3);
                        intent6.putExtra("Des4",Des4);
                        intent6.putExtra("Des5",Des5);
                        intent6.putExtra("Des6",Des6);
                        startActivity(intent6);
                        break;
                    case 7:
                        //l???y title
                        String lay7=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay7);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        amount7=Double.parseDouble(edtso7.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df34567= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double
                                tong3pt4567=amount1+amount2+amount3+amount4+amount5+amount6+amount7;
                        double in134567=((amount1/tong3pt4567)*100);
                        double in234567=((amount2/tong3pt4567)*100);
                        double in334567=((amount3/tong3pt4567)*100);
                        double in444567=((amount4/tong3pt4567)*100);
                        double in555567=((amount5/tong3pt4567)*100);
                        double in666667=((amount6/tong3pt4567)*100);
                        double in777777=((amount7/tong3pt4567)*100);
                        String edtphantram134567 = df34567.format(in134567);
                        String edtphantram234567=df34567.format(in234567);
                        String edtphantram334567=df34567.format(in334567);
                        String edtphantram444567=df34567.format(in444567);
                        String edtphantram555567=df34567.format(in555567);
                        String edtphantram666667=df34567.format(in666667);
                        String edtphantram777777=(df34567.format(in777777));
                        tv1.setText(edtphantram134567);
                        tv2.setText(edtphantram234567);
                        tv3.setText(edtphantram334567);
                        tv4.setText(edtphantram444567);
                        tv5.setText(edtphantram555567);
                        tv6.setText(edtphantram666667);
                        tv7.setText(edtphantram777777);
                        //t???ng s??? li???u nh???p v??o
                        double
                                tong34567=amount1+amount2+amount3+amount4+amount5+amount6+amount7;
                        String togAmount34567=df34567.format(tong34567);
                        tvTotal.setText(togAmount34567);
                        //t???ng s??? ph???n tr??m
                        double
                                tong234567=in134567+in234567+in334567+in444567+in555567+in666667+in777777;
                        String tongpt34567=df34567.format(tong234567);
                        tvTotalPt.setText(tongpt34567);
                        //t???o setData
                        setData7(7,100);
                        pieChartMp.setData(data7);
                        pieChartMp.setVisibility(View.VISIBLE);
                        Intent intent7=new Intent(PieChartsActivity.this,pieChart7.class);
                        //Bundle bundle2=new Bundle();
                        intent7.putExtra("segment2",amount2);
                        intent7.putExtra("segment1",amount1);
                        intent7.putExtra("segment3",amount3);
                        intent7.putExtra("segment4",amount4);
                        intent7.putExtra("segment5",amount5);
                        intent7.putExtra("segment6",amount6);
                        intent7.putExtra("segment7",amount7);
                        intent7.putExtra("tendothi",lay7);
                        intent7.putExtra("Des1",Des1);
                        intent7.putExtra("Des2",Des2);
                        intent7.putExtra("Des3",Des3);
                        intent7.putExtra("Des4",Des4);
                        intent7.putExtra("Des5",Des5);
                        intent7.putExtra("Des6",Des6);
                        intent7.putExtra("Des7",Des7);
                        startActivity(intent7);
                        break;
                    case 8:
                        //l???y title
                        String lay8=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay8);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        amount7=Double.parseDouble(edtso7.getText().toString());
                        amount8=Double.parseDouble(edtso8.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df345678= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3ch??? s??? th???p ph??n,
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double
                                tong3pt45678=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8;
                        double in1345678=((amount1/tong3pt45678)*100);
                        double in2345678=((amount2/tong3pt45678)*100);
                        double in3345678=((amount3/tong3pt45678)*100);
                        double in4445678=((amount4/tong3pt45678)*100);
                        double in5555678=((amount5/tong3pt45678)*100);
                        double in6666678=((amount6/tong3pt45678)*100);
                        double in7777778=((amount7/tong3pt45678)*100);
                        double in8888888=((amount8/tong3pt45678)*100);
                        String edtphantram1345678 = df345678.format(in1345678);
                        String edtphantram2345678=df345678.format(in2345678);
                        String edtphantram3345678=df345678.format(in3345678);
                        String edtphantram4445678=df345678.format(in4445678);
                        String edtphantram5555678=df345678.format(in5555678);
                        String edtphantram6666678=df345678.format(in6666678);
                        String edtphantram7777778=(df345678.format(in7777778));
                        String edtphantram8888888=(df345678.format(in8888888));
                        tv1.setText(edtphantram1345678);
                        tv2.setText(edtphantram2345678);
                        tv3.setText(edtphantram3345678);
                        tv4.setText(edtphantram4445678);
                        tv5.setText(edtphantram5555678);
                        tv6.setText(edtphantram6666678);
                        tv7.setText(edtphantram7777778);
                        tv8.setText(edtphantram8888888);
                        //t???ng s??? li???u nh???p v??o
                        double
                                tong345678=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8;
                        String togAmount345678=df345678.format(tong345678);
                        tvTotal.setText(togAmount345678);
                        //t???ng s??? ph???n tr??m
                        double
                                tong2345678=in1345678+in2345678+in3345678+in4445678+in5555678+in6666678+in7777778+in8888888
                                ;
                        String tongpt345678=df345678.format(tong2345678);
                        tvTotalPt.setText(tongpt345678);
                        //t???o setData
                        setData8(8,100);
                        pieChartMp.setData(data8);
                        pieChartMp.setVisibility(View.VISIBLE);
                        Intent intent8=new Intent(PieChartsActivity.this,pieChart8.class);
                        //Bundle bundle2=new Bundle();
                        intent8.putExtra("segment2",amount2);
                        intent8.putExtra("segment1",amount1);
                        intent8.putExtra("segment3",amount3);
                        intent8.putExtra("segment4",amount4);
                        intent8.putExtra("segment5",amount5);
                        intent8.putExtra("segment6",amount6);
                        intent8.putExtra("segment7",amount7);
                        intent8.putExtra("segment8",amount8);
                        intent8.putExtra("tendothi",lay8);
                        intent8.putExtra("Des1",Des1);
                        intent8.putExtra("Des2",Des2);
                        intent8.putExtra("Des3",Des3);
                        intent8.putExtra("Des4",Des4);
                        intent8.putExtra("Des5",Des5);
                        intent8.putExtra("Des6",Des6);
                        intent8.putExtra("Des7",Des7);
                        intent8.putExtra("Des8",Des8);
                        startActivity(intent8);
                        break;
                    case 9:
                        //l???y title
                        String lay9=edttitle.getText().toString();
                        tvtlaytitle.setText("????? th???:"+lay9);
                        //l???y d??? li???u
                        amount1=Double.parseDouble(edtso1.getText().toString());
                        amount2=Double.parseDouble(edtso2.getText().toString());
                        amount3=Double.parseDouble(edtso3.getText().toString());
                        amount4=Double.parseDouble(edtso4.getText().toString());
                        amount5=Double.parseDouble(edtso5.getText().toString());
                        amount6=Double.parseDouble(edtso6.getText().toString());
                        amount7=Double.parseDouble(edtso7.getText().toString());
                        amount8=Double.parseDouble(edtso8.getText().toString());
                        amount9=Double.parseDouble(edtso9.getText().toString());
                        //t??nh s??? ph???n tr??m t???ng ph???n
                        DecimalFormat df3456789= new DecimalFormat("0.0");
                        // l??m tr??n v???i 3 ch??? s??? th???p ph??n
                        // mu???n bao nhi??u ch??? s??? sau d???u ph???y th?? th??m b???y nhi??u s??? 0.
                        double
                                tong3pt456789=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8+amount9;
                        double in13456789=((amount1/tong3pt456789)*100);
                        double in23456789=((amount2/tong3pt456789)*100);
                        double in33456789=((amount3/tong3pt456789)*100);
                        double in44456789=((amount4/tong3pt456789)*100);
                        double in55556789=((amount5/tong3pt456789)*100);
                        double in66666789=((amount6/tong3pt456789)*100);
                        double in77777789=((amount7/tong3pt456789)*100);
                        double in88888889=((amount8/tong3pt456789)*100);
                        double in99999999=((amount9/tong3pt456789)*100);
                        String edtphantram13456789 = df3456789.format(in13456789);
                        String edtphantram23456789=df3456789.format(in23456789);
                        String edtphantram33456789=df3456789.format(in33456789);
                        String edtphantram44456789=df3456789.format(in44456789);
                        String edtphantram55556789=df3456789.format(in55556789);
                        String edtphantram66666789=df3456789.format(in66666789);
                        String edtphantram77777789=df3456789.format(in77777789);
                        String edtphantram88888889=df3456789.format(in88888889);
                        String edtphantram99999999=df3456789.format(in99999999);
                        tv1.setText(edtphantram13456789);
                        tv2.setText(edtphantram23456789);
                        tv3.setText(edtphantram33456789);
                        tv4.setText(edtphantram44456789);
                        tv5.setText(edtphantram55556789);
                        tv6.setText(edtphantram66666789);
                        tv7.setText(edtphantram77777789);
                        tv8.setText(edtphantram88888889);
                        tv9.setText(edtphantram99999999);
                        //t???ng s??? li???u nh???p v??o
                        double
                                tong3456789=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8+amount9;
                        String togAmount3456789=Double.toString(tong3456789);
                        tvTotal.setText(togAmount3456789);
                        //t???ng s??? ph???n tr??m
                        double
                                tong23456789=in13456789+in23456789+in33456789+in44456789+in55556789+in66666789+in77777789+in88888889+in99999999;
                        String tongpt3456789=df3456789.format(tong23456789);
                        tvTotalPt.setText(tongpt3456789);
                        //t???o setData
                        setData9(9,100);
                        pieChartMp.setData(data9);
                        pieChartMp.setVisibility(View.INVISIBLE);
                        Intent intent9=new Intent(PieChartsActivity.this,pieChart9.class);
                        //Bundle bundle2=new Bundle();
                        intent9.putExtra("segment2",amount2);
                        intent9.putExtra("segment1",amount1);
                        intent9.putExtra("segment3",amount3);
                        intent9.putExtra("segment4",amount4);
                        intent9.putExtra("segment5",amount5);
                        intent9.putExtra("segment6",amount6);
                        intent9.putExtra("segment7",amount7);
                        intent9.putExtra("segment8",amount8);
                        intent9.putExtra("segment9",amount9);
                        intent9.putExtra("tendothi",lay9);
                        intent9.putExtra("Des1",Des1);
                        intent9.putExtra("Des2",Des2);
                        intent9.putExtra("Des3",Des3);
                        intent9.putExtra("Des4",Des4);
                        intent9.putExtra("Des5",Des5);
                        intent9.putExtra("Des6",Des6);
                        intent9.putExtra("Des7",Des7);
                        intent9.putExtra("Des8",Des8);
                        intent9.putExtra("Des9",Des9);
                        startActivity(intent9);
                        break;
                }
            }
        });
    }
    //C??c class v?? method ngo??i onCreate
    private void setData2(int count, float range) {
        //Des3=edtDes3.getText().toString();
        String[] mParties = new String[] {Des1,Des2};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // ArrayList<PieEntry> entries = new ArrayList<PieEntry>();
        // NOTE: The order of the entries when being added to the entries array determines their position around the center of
        // the chart.
        double tong2=amount1+amount2;
        double[] yData2={amount1,amount2};
        for (int i = 0; i < count; i++) {
            yEntrys .add(new PieEntry((float) (yData2[i]/tong2)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        dataSet.setSliceSpace(3f);
        //dataSet.setIconsOffset(new MPPointF(0, 40)); xem l???i
        dataSet.setSelectionShift(5f);
        dataSet.setValueTextColor(Color.BLACK);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data2 = new PieData(dataSet);
        data2.setValueFormatter(new PercentFormatter());
        data2.setValueTextSize(12f);
        data2.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData3(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        tong3= amount1+amount2+amount3;
        double[] yData3={amount1,amount2,amount3};
        for (int i = 0; i < count; i++) {
            // yEntrys.add(new PieEntry((float)()
            yEntrys .add(new PieEntry((float) (yData3[i]/tong3)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
        dataSet.setValueLineColor(Color.BLACK);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        colors.add(ColorTemplate.getHoloBlue());

        dataSet.setColors(colors);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data3 = new PieData(dataSet);
        data3.setValueFormatter(new PercentFormatter());
        data3.setValueTextSize(12f);
        data3.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData4(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        Des4=edtDes4.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3,Des4};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // NOTE: The order of the entries when being added to the entries array determines their position
        // around the center of the chart.
        double tong4=amount1+amount2+amount3+amount4;
        double[] yData4={amount1,amount2,amount3,amount4};
        for (int i = 0; i < count; i++) {
            yEntrys .add(new PieEntry((float) (yData4[i]/tong4)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data4 = new PieData(dataSet);
        data4.setValueFormatter(new PercentFormatter());
        data4.setValueTextSize(12f);
        data4.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData5(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        Des4=edtDes4.getText().toString();
        Des5=edtDes5.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3,Des4,Des5};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // NOTE: The order of the entries when being added to the entries array determines their position
        // around the center of the chart.
        double tong5=amount1+amount2+amount3+amount4+amount5;
        double[] yData5={amount1,amount2,amount3,amount4,amount5};
        for (int i = 0; i < count; i++) {
            yEntrys .add(new PieEntry((float) (yData5[i]/tong5)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
//dataSet.setDrawIcons(false);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
// add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data5 = new PieData(dataSet);
        data5.setValueFormatter(new PercentFormatter());
        data5.setValueTextSize(12f);
        data5.setValueTextColor(Color.BLACK);
// undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData6(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        Des4=edtDes4.getText().toString();
        Des5=edtDes5.getText().toString();
        Des6=edtDes6.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3,Des4,Des5,Des6};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // ArrayList<PieEntry> entries = new ArrayList<PieEntry>();
        // NOTE: The order of the entries when being added to the entries array determines their position
        // around the center of the chart.
        double tong6=amount1+amount2+amount3+amount4+amount5+amount6;
        double[] yData6={amount1,amount2,amount3,amount4,amount5,amount6};
        for (int i = 0; i < count; i++) {
        // yEntrys.add(new PieEntry((float)()
            yEntrys .add(new PieEntry((float) (yData6[i]/tong6)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data6 = new PieData(dataSet);
        data6.setValueFormatter(new PercentFormatter());
        data6.setValueTextSize(12f);
        data6.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData7(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        Des4=edtDes4.getText().toString();
        Des5=edtDes5.getText().toString();
        Des6=edtDes6.getText().toString();
        Des7=edtDes7.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3,Des4,Des5,Des6,Des7};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // ArrayList<PieEntry> entries = new ArrayList<PieEntry>();
        // NOTE: The order of the entries when being added to the entries array determines their position
        // around the center of the chart.
        double tong7=amount1+amount2+amount3+amount4+amount5+amount6+amount7;
        double[] yData7={amount1,amount2,amount3,amount4,amount5,amount6,amount7};
        for (int i = 0; i < count; i++) {
        // yEntrys.add(new PieEntry((float)()
            yEntrys .add(new PieEntry((float) (yData7[i]/tong7)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        //dataSet.setDrawIcons(false);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        colors.add(ColorTemplate.getHoloBlue());

        dataSet.setColors(colors);

        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data7 = new PieData(dataSet);
        data7.setValueFormatter(new PercentFormatter());
        data7.setValueTextSize(12f);
        data7.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData8(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        Des4=edtDes4.getText().toString();
        Des5=edtDes5.getText().toString();
        Des6=edtDes6.getText().toString();
        Des7=edtDes7.getText().toString();
        Des8=edtDes8.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3,Des4,Des5,Des6,Des7,Des8};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // NOTE: The order of the entries when being added to the entries array determines their position
        // around the center of the chart.
        double tong8=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8;
        double[] yData8={amount1,amount2,amount3,amount4,amount5,amount6,amount7,amount8};
        for (int i = 0; i < count; i++) {
            yEntrys .add(new PieEntry((float) (yData8[i]/tong8)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        //dataSet.setDrawIcons(false);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.RED);
        colors.add(Color.YELLOW);
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
        colors.add(ColorTemplate.getHoloBlue());

        dataSet.setColors(colors);

        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data8 = new PieData(dataSet);
        data8.setValueFormatter(new PercentFormatter());
        data8.setValueTextSize(12f);
        data8.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setTextSize(10);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void setData9(int count, float range) {
        Des1=edtDes1.getText().toString();
        Des2=edtDes2.getText().toString();
        Des3=edtDes3.getText().toString();
        Des4=edtDes4.getText().toString();
        Des5=edtDes5.getText().toString();
        Des6=edtDes6.getText().toString();
        Des7=edtDes7.getText().toString();
        Des8=edtDes8.getText().toString();
        Des9=edtDes9.getText().toString();
        String[] mParties = new String[] {Des1,Des2,Des3,Des4,Des5,Des6,Des7,Des8,Des9};
        float mult = range;
        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        // NOTE: The order of the entries when being added to the entries array determines their position
        // around the center of the chart.
        double
                tong9=amount1+amount2+amount3+amount4+amount5+amount6+amount7+amount8+amount9;
        double[]yData9={amount1,amount2,amount3,amount4,amount5,amount6,amount7,amount8,amount9};
        for (int i = 0; i < count; i++) {
            yEntrys .add(new PieEntry((float) (yData9[i]/tong9)*100,
                    mParties[i % mParties.length]));
        }
        PieDataSet dataSet = new PieDataSet(yEntrys,null);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);
        // add a lot of colors
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        colors.add(ColorTemplate.getHoloBlue());

        dataSet.setColors(colors);

        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data9 = new PieData(dataSet);
        data9.setValueFormatter(new PercentFormatter());
        data9.setValueTextSize(12f);
        data9.setValueTextColor(Color.BLACK);
        // undo all highlights
        pieChartMp.invalidate();
        Legend l = pieChartMp.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);
        l.setTextSize(10);
        l.setEnabled(true);
    }
    private SpannableString generateCenterSpannableText() {
        SpannableString s = new SpannableString("PieChartAndroid");
        s.setSpan(new RelativeSizeSpan(1.5f), 0, 15, 0);
        s.setSpan(new StyleSpan(Typeface.ITALIC), s.length() - 15, s.length(), 0);
        s.setSpan(new ForegroundColorSpan(ColorTemplate.getHoloBlue()), s.length() - 15,s.length(), 0);
        return s;
    }
    //
    class MpAndroidChart implements
            AdapterView.OnItemSelectedListener {
        //Khi c?? ch???n l???a th?? v??o h??m n??y
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            vitri = arg2;
            switch (arg2) {
                case 0:
                    pieChartMp.setVisibility(View.INVISIBLE);
                    tvTotal.setText("0");
                    tvTotalPt.setText("0");
                    tableRow1.setVisibility(View.INVISIBLE);
                    tableRow2.setVisibility(View.INVISIBLE);
                    tableRow3.setVisibility(View.INVISIBLE);
                    tableRow4.setVisibility(View.INVISIBLE);
                    tableRow5.setVisibility(View.INVISIBLE);
                    tableRow6.setVisibility(View.INVISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    Toast.makeText(PieChartsActivity.this,"Xin vui l??ng ch???n s??? ph???n t??? t??? 2 ?????n 9",Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    pieChartMp.setVisibility(View.INVISIBLE);
                    tvTotal.setText("0");
                    tvTotalPt.setText("0");
                    Toast.makeText(PieChartsActivity.this,"Xin vui l??ng ch???n s??? ph???n t??? t??? 2 ?????n 9",Toast.LENGTH_LONG).show();
                    tableRow1.setVisibility(View.INVISIBLE);
                    tableRow2.setVisibility(View.INVISIBLE);
                    tableRow3.setVisibility(View.INVISIBLE);
                    tableRow4.setVisibility(View.INVISIBLE);
                    tableRow5.setVisibility(View.INVISIBLE);
                    tableRow6.setVisibility(View.INVISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.INVISIBLE);
                    tableRow4.setVisibility(View.INVISIBLE);
                    tableRow5.setVisibility(View.INVISIBLE);
                    tableRow6.setVisibility(View.INVISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.INVISIBLE);
                    tableRow5.setVisibility(View.INVISIBLE);
                    tableRow6.setVisibility(View.INVISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.VISIBLE);
                    tableRow5.setVisibility(View.INVISIBLE);
                    tableRow6.setVisibility(View.INVISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 5:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.VISIBLE);
                    tableRow5.setVisibility(View.VISIBLE);
                    tableRow6.setVisibility(View.INVISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 6:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.VISIBLE);
                    tableRow5.setVisibility(View.VISIBLE);
                    tableRow6.setVisibility(View.VISIBLE);
                    tableRow7.setVisibility(View.INVISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 7:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.VISIBLE);
                    tableRow5.setVisibility(View.VISIBLE);
                    tableRow6.setVisibility(View.VISIBLE);
                    tableRow7.setVisibility(View.VISIBLE);
                    tableRow8.setVisibility(View.INVISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 8:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.VISIBLE);
                    tableRow5.setVisibility(View.VISIBLE);
                    tableRow6.setVisibility(View.VISIBLE);
                    tableRow7.setVisibility(View.VISIBLE);
                    tableRow8.setVisibility(View.VISIBLE);
                    tableRow9.setVisibility(View.INVISIBLE);
                    break;
                case 9:
                    tableRow1.setVisibility(View.VISIBLE);
                    tableRow2.setVisibility(View.VISIBLE);
                    tableRow3.setVisibility(View.VISIBLE);
                    tableRow4.setVisibility(View.VISIBLE);
                    tableRow5.setVisibility(View.VISIBLE);
                    tableRow6.setVisibility(View.VISIBLE);
                    tableRow7.setVisibility(View.VISIBLE);
                    tableRow8.setVisibility(View.VISIBLE);
                    tableRow9.setVisibility(View.VISIBLE);
                    break;
            }
        }
        //N???u kh??ng ch???n g?? c???
        public void onNothingSelected(AdapterView<?> arg0) {
            //selection.setText("");
        }
    }
}
