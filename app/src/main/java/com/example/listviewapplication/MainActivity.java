 package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {
ListView listView ;
     String [] arr = {" Ruturaj Gaikward","Ravindra Jadeja","Ms Dhoni","Moien Ali","Devon Convway","Maheesh Tikshana","Dwaine Prtorious","Ruturaj"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);

        // This is our data source
//       String [] arr={"Ms Dhoni","Ravindra Jadeja","Moeen Ali","Ruturaj Gaikwad","Ambati Raydu","Deepak Chahar","Tusar Deshpande","Shivam Dube","Maheesh Theekhana",
//                "Rajvardhan Hangargekar","Simarjeet Singh","Devon Convey", "Dwaine Pretorius","Mitchel Santner","Subhransu Senapati","Prasant Solanki","Mukesh Choudhary",
//                "Matheesa Pathirana","Ajinkya Rahane","Ben Stokes","Shaik Rasheed","Nishant Sindhu","Kyle Jamison","Ajay Mandal","Bhagath Varma"   };





//        // We can not display the data directly so we use the adapter to set the items in a list view(Using built in array adapter)
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);

        // Using our custom adapter
BadalAdapter add = new BadalAdapter(this,R.layout.my_badal_layout,arr);
listView.setAdapter(add);

    }
}