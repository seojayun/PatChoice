package com.example.patchoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch check1;
    TextView tvTitle;
    RadioGroup rGroup1;
//    RadioButton rdodog,rdocat,rdorabbit;
    RadioButton rdoAndroid[]=new RadioButton[3];
    Integer rdoAndroidID[] = {R.id.dog1,R.id.cat1,R.id.rabbit1};
    Integer imgAndroidID[] = {R.drawable.nougat, R.drawable.oreo, R.drawable.pie};
    //라디오 버튼 부분//이미지 부분을 배열로 처리함
//    Button btn1;
    ImageView imge1;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check1=(Switch) findViewById(R.id.check1);
        tvTitle=(TextView)findViewById(R.id.whats1);
        rGroup1=(RadioGroup)findViewById(R.id.rdog1);
        for (int i=0; i<rdoAndroidID.length; i++){
            rdoAndroid[i]=(RadioButton)findViewById(rdoAndroidID[i]);
        }
//        rdodog=(RadioButton)findViewById(R.id.dog1);
//        rdocat=(RadioButton)findViewById(R.id.cat1);
//        rdorabbit=(RadioButton)findViewById(R.id.rabbit1);
//        btn1=(Button)findViewById(R.id.btn1);
        imge1=(ImageView)findViewById(R.id.answer1);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);


        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // ▼if(isChecked) {} 하고 같다
                if(check1.isChecked()==true){
                    tvTitle.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
//                    btn1.setVisibility(View.VISIBLE);
                    imge1.setVisibility(View.VISIBLE);
                    btn1.setVisibility((View.VISIBLE));
                    btn2.setVisibility(View.VISIBLE);
                }else {
                    tvTitle.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
//                    btn1.setVisibility(View.INVISIBLE);
                    imge1.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                }
            }
        });

//        rdodog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                imge1.setImageResource(R.drawable.nougat);
//            }
//
//        });
//        rdocat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                imge1.setImageResource(R.drawable.oreo);
//            }
//        });
//        rdorabbit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                imge1.setImageResource(R.drawable.pie);
//            }
//        });

        for ( int i=0; i<imgAndroidID.length; i++){
            final int index;
            index =i;
            //            final int index;
            //            index =i;    이 두 구문은 반드시 외워두자!  final 인덱스가 for문에 맞춰서 계속 생성된다.

            rdoAndroid[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imge1.setImageResource(imgAndroidID[index]);
                }
            });
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imge1.setImageResource(0);
                rGroup1.clearCheck();
                //.clearCheck(); 는 라디오 그룹 안에 있는 전부를 다 해제 시켜준다.
                //배열을 이용하여제작.

//                tvTitle.setVisibility(View.INVISIBLE);
//                rGroup1.setVisibility(View.INVISIBLE);
//                imge1.setVisibility(View.INVISIBLE);
//                btn1.setVisibility(View.INVISIBLE);
//                btn2.setVisibility(View.INVISIBLE);
                check1.setChecked(false);
            }
        });

        // 맨 마지막 버튼2구문 설명
        //

//                switch (rGroup1.getCheckedRadioButtonId()){
//                    case R.id.dog1:
//                        imge1.setImageResource(R.drawable.dog);
//                        break;
//                    case R.id.cat1:
//                        imge1.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.rabbit1:
//                        imge1.setImageResource(R.drawable.rabbit);
//                        break;
//                        default:
//                            Toast.makeText(getApplicationContext(),"동물을 먼저 선택하세요.",Toast.LENGTH_SHORT).show();



                }







    }

