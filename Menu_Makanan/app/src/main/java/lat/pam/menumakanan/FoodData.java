package lat.pam.menumakanan;

import android.annotation.SuppressLint;
import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    @SuppressLint("UseCompatLoadingForDrawables")
    public static ArrayList<Food> getData(Context context) {    //List from foods with price and description
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Nasi Goreng", "Masasakan khas burjo idaman Nasi Goreng Spesial", 12000, context.getDrawable(R.drawable.nasgor)));
        list.add(new Food("Nasi Ayam Bali", "Nasi Ayan Bali khas dari bali, menu spesial yang sangat enak", 14000, context.getDrawable(R.drawable.nasyambali)));
        list.add(new Food("Magelangan", "Makanan khas bali yang disediakan di burjo dengan campuran orak arik nasi dan mie goreng", 11000, context.getDrawable(R.drawable.magelangan)));
        list.add(new Food("Mie Dogdog", "Mie kuah yang disajikan dengan kuah merah dan sedikit pedas dan sangat enak", 10000, context.getDrawable(R.drawable.miedogdog)));
        list.add(new Food("Nasi Omelet", "Campuran mie dan telur yang dicampur dan dibumbui kemudian digoreng, kemudian disajukan dengan nasi, yang merupakan makanan tinggi karbohidrat yang nikmat", 12000, context.getDrawable(R.drawable.omelet)));
        list.add(new Food("Mie Goreng", "Mie tanpa kuah yang digoreng dengan bumbu bumbu yang sangat lezat dan mengenyangkan perut", 12000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Kopi Hitam", "Kopi yg Hitam tanpa disaring yang sangat pahit dan bikin melek 1x24 jam dengan harga yang murah", 5000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Bubur Cangjo", "Bubur andalan burjo dengan gabungan kacang hijau, ketan, dan santan yang sangat nikmat", 9000, context.getDrawable(R.drawable.cangjo)));
        list.add(new Food("Caphuchino", "Caphuchino, menu minuman kopi pahit yang menyegarkan mata", 8000, context.getDrawable(R.drawable.kapucino)));
        list.add(new Food("Es Teh", "Es Teh segar dan manis", 3000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}