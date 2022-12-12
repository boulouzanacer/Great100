package com.xdevpro.great100.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xdevpro.great100.MainActivity;
import com.xdevpro.great100.R;
import com.xdevpro.great100.ui.MainActivityPlayer;
import com.xdevpro.great100.ui.adapters.RecyclerViewAdapter_Arabic;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by UK2015 on 02/08/2016.
 */
public class ArabicFragment extends Fragment implements RecyclerViewAdapter_Arabic.OnItemClickListener{

    private Context mContext;

    public ArabicFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_arabic, container, false);

        mContext = getActivity();
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(mLayoutManager);

        String[] videoIds = {
                "7QTpR7y9asU",
                "KdKLxwgXGos",
                "wDw6S9MHhMo",
                "7mSb3DAQk-A",
                "7kQb-hEmH80",
                "CeQE4swGF1E",
                "4ZOovVxIWfg",
                "BjBIKghQT9U",
                "HEH9CXz28UU",
                "qB3ThVGVysc",
                "-5W6cWglcSg",
                "qB3ThVGVysc",
                "xO-a8sx9uAU",
                "6bdyAG0SeCE",
                "kCzacWypimM",
                "Df8XtIKIGKQ",
                "cWmE1fr4Nws",
                "hX2_UNfKoJk",
                "RPDe1X_Q-qo",
                "0Cg7mDjCuJc",
                "6O8lWpGgkI0",
                "a6tkXcWIWUo",
                "Gbfog9RTrrk",
                "v6hiayKvyT4",
                "rVNB6ayvqRc",
                "W3BdlAJ4o24",
                "W-_LXGxJhDs",
                "rsjIx8gw55s",
                "fgimW2X6aeU",
                "JFNX3C58T78",
                "D41dX82hojw",
                "avpx1oQ1d20",
                "VF9gKkZF_n0",
                "rmSwfWEXvYE",
                "0YSbU9lNHxM",
                "umyM7Wvb1OA",
                "AvMH4yPmAsI",
                "IJNdsIuPJ6o",
                "QJ3Q4sqyzkk",
                "B8jBkl_ktMM",
                "U3Lnh8GFq_8",
                "YWBpx540-eU",
                "KCIo58KoS24",
                "9YJrX74Rb74",
                "hvr7kS3dd7M",
                "qiR0QdVsKzo",
                "kcQ01WSgdGY"
        };

        String[] videoTimes = {
                "9:39",
                "10:53",
                "10:44",
                "14:27",
                "14:29",
                "18:40",
                "31:28",
                "39:46",
                "31:05",
                "35:58",
                "16:07",
                "34:00",
                "01:04:08",
                "38:59",
                "57:00",
                "30:33",
                "31:46",
                "39:09",
                "56:48",
                "01:03:23",
                "52:32",
                "01:22:47",
                "09:21",
                "15:06",
                "28:29",
                "40:01",
                "36:53",
                "32:18",
                "51:28",
                "30:36",
                "28:51",
                "28:26",
                "08:46",
                "01:00:48",
                "16:44",
                "15:26",
                "17:44",
                "19:03",
                "32:59",
                "28:00",
                "11:46",
                "06:21",
                "15:44",
                "13:25",
                "16:24",
                "15:12",
                "25:21"
        };

        String[] videoTitles = {
                "العظماء المائة الحلقة الأولى...تقديم جهاد الترباني",
                "العظماء_المائة 2: ماذا تعرف عن تاريخك؟ جهاد الترباني",
                "العظماء المائة 3: أبو بكر الصديق \"العظيم الأول في أمة محمد ?\" ... تقديم جهاد الترباني",
                "العظماء المائة 4: أسطورة المغرب الأمير محمد بن عبد الكريم الخطابي",
                "العظماء المائة 5: عملاق الجزائر الأمير عبد القادر الجزائري... جهاد الترباني",
                "العظماء المائة 6: \"الأخوان بربروسا\" عمالقة البحرية الإسلامية. جهاد الترباني",
                "العظماء المائة7: سليمان القانوني \"المسلسل الحقيقي\"..جهاد الترباني",
                "العظماء المائة 8: الخليفة العملاق \"سليمان القانوني\" ومعركة موهاج الخالدة... جهاد الترباني",
                "العظماء_المائة 9: كيف اكتشف المسلمون أمريكا قبل كولومبس؟ جهاد الترباني",
                "العظماء_المائة 10: حكاية المكتشف الحقيقي لأمريكا \"بيري ريس\".. جهاد الترباني",
                "العظماء_المائة 11: من أمريكا إلى إندونيسياا.. جهاد الترباني",
                "العظماء_المائة 12: لؤلؤة الصحابة \"خبيب بن عدي\"... جهاد الترباني",
                "العظماء المائة 13: \"كاتم سر الرسول ولغز الجاسوس الروسي\" ... جهاد الترباني",
                "العظماء المائة 14: سليم الأول \"الخليفة القاطع\" ... جهاد الترباني",
                "العظماء المائة 15: \"سليم الأول\" منقذ قبر الرسول وموحد المسلمين ... جهاد الترباني",
                "العظماء المائة 16: بطل عُمان \"ناصر بن مرشد اليعربي\" ... جهاد الترباني",
                "العظماء المائة 17: قاهر الصليبيين \"سلطان بن سيف اليعربي\" ... جهاد الترباني",
                "العظماء المائة 18: عظيم الكويت عبد الرحمن السميط ... جهاد الترباني",
                "العظماء المائة 19:  لماذا العرب؟ ... جهاد الترباني",
                "العظماء المائة 20:  لماذا جزيرة العرب؟ ... جهاد الترباني",
                "العظماء المائة 21: آريوس - القسيس الذي غير شكل الأرض ... جهاد الترباني",
                "العظماء المائة 22: حكاية الأريسيين... الحكاية التي أخفيت عن البشرية ... جهاد الترباني",
                "العظماء المائة 23: الصعيدي الذي دعا إمبراطور اليابان للإسلام ... جهاد الترباني",
                "العظماء المائة 24: بطل الفلبين المسلم لابولابو ... جهاد الترباني",
                "العظماء المائة 25: انقلاب تركيا ج1 - بداية الحكاية ... جهاد الترباني",
                "العظماء المائة 26: انقلاب تركيا ج 2 - ما قبل العاصفة ... جهاد الترباني",
                "العظماء المائة 27:  انقلاب تركيا ج3 - (ساعة الصفر) ... جهاد الترباني",
                "العظماء المائة 28: ارطغرل - الحكاية الحقيقية ... جهاد الترباني",
                "العظماء المائة 29: عثمان بن أرطغرل - قيام الإمبراطورية  ... جهاد الترباني",
                "العظماء المائة 30: خطة سرقة قبر الرسول ?  ... جهاد الترباني",
                "العظماء المائة 31: القائد الصومالي الذي حمى قبر الرسول ?  ... جهاد الترباني",
                "العظماء المائة 32: اليمن.. بلاد الحكمة والأبطال  ... جهاد الترباني",
                "العظماء المائة 33: فتح الأندلس- القصة الحقيقية (المقدمة) ... جهاد الترباني",
                "العظماء المائة 34: فتح الأندلس \"القصة الحقيقية!\" ... جهاد الترباني",
                "العظماء المائة 35: لماذا يستهدفون البخاري؟ ... جهاد الترباني",
                "العظماء المائة 36: مكة قبل قريش ... جهاد الترباني",
                "العظماء المائة 37: أخطر الأوبئة في تاريخ البشرية ... جهاد الترباني",
                "العظماء المائة 38: الموت الأسود - أخطر جائحة عرفتها البشرية ... جهاد الترباني",
                "العظماء المائة 39: آيا صوفيا \"الحكمة الإلهية\" ... جهاد الترباني",
                "العظماء المائة 40: حرب الأيقونات ... جهاد الترباني",
                "العظماء المائة 41: حكاية القسيس النرويجي الذي أسلم ... جهاد الترباني",
                "العظماء المائة 42: بارتولومي - مذبحة فرنسا المرعبة ... جهاد الترباني",
                "العظماء المائة 43: عندما أنقذ المسلمون فرنسا من الاحتلال ... جهاد الترباني",
                "العظماء المائة 44:  المرابطون والأندلس 1 ... جهاد الترباني",
                "العظماء المائة 45:  هل هناك أمل؟! ... جهاد الترباني",
                "العظماء المائة 46:  انبعاث الملثمين ... جهاد الترباني",
                "العظماء المائة 47:  المرابطون: ميلاد الإمبراطورية ... جهاد الترباني"
        };


        RecyclerViewAdapter_Arabic recyclerViewAdapter = new RecyclerViewAdapter_Arabic(videoIds, videoTitles, videoTimes,  getActivity(), this);
        recyclerView.setAdapter(recyclerViewAdapter);
        return rootView;
    }

    @Override
    public void onItemClick(String youtube_id) {
        Intent intent = new Intent(getActivity(), MainActivityPlayer.class);
        Bundle bndl = new Bundle();
        bndl.putString("youtube_id", youtube_id);
        intent.putExtras(bndl);
        startActivity(intent);
    }
}
