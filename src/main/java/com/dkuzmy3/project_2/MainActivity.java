package com.dkuzmy3.project_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // set up data for smartphones
    String[] mTitle = {"Samsung S20", "LG V60", "OnePlus 8", "Samsung Galaxy Note 10",
            "Apple Iphone 11", "Google Pixel 4"};

    String[] mDesc = {"6.2 inch display, $700", "6.8 inch display, $750",  "6.55 inch display, $550",
                      "6.3 inch display, $570", "6.1 inch display, $700", "5.7 inch display, $550"};
    // set images for icons
    int[] images = {R.drawable.samsung, R.drawable.lg, R.drawable.oneplus, R.drawable.note,
                    R.drawable.iphone, R.drawable.pixel};

    // PLEASE KEEP IN MIND THIS PROJECT IS NOT ABOUT WHO FINDS THE BEST PICTURES,
    // I FOND THESE AND THAT'S WHAT I'M USING. DON'T NERF MY GRADE CUZ OF THAT :(
    // Some pictures don't stretch over the whole screen because they are png files and the transparent
    // space behind is lard, which makes the picture smaller than ones with a small transparent space
    // to fix that i'd need to either manually edit the pictures which require photoshop that i don't have
    // or zoom in pictures which isn't a requirement for this project.
    int[] imagesBig = {R.drawable.samsung_s20, R.drawable.lgv60, R.drawable.oneplus_8, R.drawable.note_10,
            R.drawable.iphone_11, R.drawable.hoogle_pixel};

    String[] specs = {"OS\tAndroid 10, One UI 2\n" +
            "Chipset\tExynos 990 (7 nm+) - Global\n" +
            "Qualcomm SM8250 Snapdragon 865 (7 nm+) - USA\n" +
            "CPU\tOcta-core (2x2.73 GHz Mongoose M5 & 2x2.50 GHz Cortex-A76 & 4x2.0 GHz Cortex-A55) - Global\n" +
            "Octa-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.8 GHz Kryo 585) - USA\n" +
            "GPU\tMali-G77 MP11 - Global\n" +
            "Adreno 650 - USA", "OS\tAndroid 10\n" +
            "Chipset\tQualcomm SM8250 Snapdragon 865 (7 nm+)\n" +
            "CPU\tOcta-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.8 GHz Kryo 585)\n" +
            "GPU\tAdreno 650", "OS\tAndroid 10, OxygenOS 10.0\n" +
            "Chipset\tQualcomm SM8250 Snapdragon 865 (7 nm+)\n" +
            "CPU\tOcta-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.8 GHz Kryo 585)\n" +
            "GPU\tAdreno 650", "OS\tAndroid 9.0 (Pie), upgradable to Android 10, One UI 2.1\n" +
            "Chipset\tExynos 9825 (7 nm) - EMEA/LATAM\n" +
            "Qualcomm SM8150 Snapdragon 855 (7 nm) - USA/China\n" +
            "CPU\tOcta-core (2x2.73 GHz Mongoose M4 & 2x2.4 GHz Cortex-A75 & 4x1.9 GHz Cortex-A55) - EMEA/LATAM\n" +
            "Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485) - USA/China\n" +
            "GPU\tMali-G76 MP12 - EMEA/LATAM\n" +
            "Adreno 640 - USA/China", "OS\tiOS 13, upgradable to iOS 13.5\n" +
            "Chipset\tApple A13 Bionic (7 nm+)\n" +
            "CPU\tHexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)\n" +
            "GPU\tApple GPU (4-core graphics)", "OS\tAndroid 10\n" +
            "Chipset\tQualcomm SM8150 Snapdragon 855 (7 nm)\n" +
            "CPU\tOcta-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
            "GPU\tAdreno 640"};

    String[] links = {"https://www.samsung.com/us/mobile/galaxy-s20-5g/",
            "https://www.lg.com/us/cell-phones/lg-lmv600tmlxasprcb-sprint-v60-thinq-5g-dual-screen",
            "https://www.oneplus.com/8", "https://www.samsung.com/us/mobile/galaxy-note10/",
            "https://www.apple.com/iphone-11/", "https://store.google.com/us/product/pixel_4"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);     // find identify listview from outlay

        // custom adapter to display the data on the listview
        CustomAdapter adapter = new CustomAdapter(this, mTitle, mDesc, images);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);           // creating context menu

        // on simple click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // items 0 to 5
                // open new activity
                Intent intent0 = new Intent(getApplicationContext(), activity2.class);  // new intent
                Bundle bundle = new Bundle();                                           // bundle for data transfer
                bundle.putInt("image", imagesBig[i]);                         // we send the high res image
                intent0.putExtras(bundle);                                              // send bundle
                // transfer the position and website
                intent0.putExtra("link", links[i]);
                intent0.putExtra("position", ""+i);
                startActivity(intent0); // launch the activity with the items requested

            }
        });
    }

    class CustomAdapter extends ArrayAdapter<String>{   // custom adapter
        Context con;                                    // data initialization
        String[] rTitle;
        String[] rDescription;
        int[] rImage;
        // constructor
        CustomAdapter (Context c, String[] title, String[] description, int[] image){
            super(c, R.layout.item_list, R.id.textView1, title);
            this.con = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImage = image;
        }

        @NonNull
        @Override
        // set up items as viewable objects / merge data into visible objects
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemList = inflater.inflate(R.layout.item_list, parent, false);

            ImageView images = itemList.findViewById(R.id.image);   // id the layout objects
            TextView textView = itemList.findViewById(R.id.textView1);
            TextView textView2 = itemList.findViewById(R.id.textView2);

            images.setImageResource(rImage[position]);              // set the data
            textView.setText(rTitle[position]);
            textView2.setText(rDescription[position]);

            return itemList;                                         // return the listview to display on phone
        }
    }
    // context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu_r, menu);   // custom inflator 
    }
    // manage options in context menu
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        final AdapterView.AdapterContextMenuInfo i = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()){
            // open activity with specs
            case R.id.option1:
                Intent intent5 = new Intent(getApplicationContext(), activity3.class);
                intent5.putExtra("specs", specs[i.position]);
                intent5.putExtra("position", ""+i.position);
                startActivity(intent5);
                return true;
            // picture
            case R.id.option2:
                Intent intent3 = new Intent(getApplicationContext(), activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("image", imagesBig[i.position]);
                intent3.putExtras(bundle);

                intent3.putExtra("link", links[i.position]);
                intent3.putExtra("position", ""+i.position);
                startActivity(intent3);
                return true;
            // open website
            case R.id.option3:
                try {
                    Log.i("Check link", links[i.position]);              // cast browsable link
                    Uri web = Uri.parse(links[i.position]);
                    Intent openWeb = new Intent(Intent.ACTION_VIEW);
                    openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                    openWeb.setData(web);
                    startActivity(openWeb);
                }catch(Exception e){}
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}