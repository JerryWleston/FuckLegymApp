package fucklegym.top.entropy;

import java.util.ArrayList;
import java.util.Random;

public class PathGenerator {
    private static final double[] latitude = {30.74900133367409,30.74898688255651,30.74896815188424,30.748940007385624,30.74890075884211,30.748858269547515,30.74881181869255,30.748767052700018,30.74871888049938,30.74867331788709,30.748623451489145,30.74857920474307,30.74853030713002,30.748481211584117,30.748429527137464,30.748383421657277,30.748333985232744,30.74828811599811,30.748235951285466,30.748191096023184,30.748142175480325,30.748097550703548,30.748058617728123,30.748018544501814,30.747980211939076,30.747947191065723,30.74791292078947,30.747890330417512,30.74787416782794,30.74786240621775,30.747856523760166,30.74785980010884,30.74785690800689,30.747865959569513,30.747875314209224,30.747908380679696,30.747926722451464,30.74797856162601,30.7479974271559,30.748031924278937,30.748067004124913,30.748103603148873,30.748137991505164,30.748181086323175,30.748213615032288,30.748256225717085,30.74829499944973,30.74832378615495,30.7483531090519,30.748389993183903,30.748432167277432,30.74846407370112,30.74849832952399,30.748540586821097,30.748583705215964,30.74862533577733,30.748666868496855,30.748708004494137,30.74875759253553,30.748795589174925,30.74882992478308,30.748871139113955,30.748905943676657,30.74894293072605,30.748983362714043,30.74902341708968,30.749063701911755,30.74909634844098,30.749133504479673,30.749167350515883,30.749198730460648,30.74922822967705,30.749257753706267,30.74928112423463,30.749302023272534,30.74931730877049,30.749329927264625,30.749337665026857,30.74933932563312,30.74933726330152,30.749331236584325,30.749321107949623,30.749308419600716,30.749293066016048,30.749276217255073,30.749254621112684,30.74922907315558,30.749195509767382,30.749160259494236,30.749126420245425,30.7490910564646,30.749056590717725,30.749025114532795,30.7490045709538};
    private static final double[] lontitude = {103.9359940899701,103.93599145457326,103.93599066232734,103.93599055090571,103.93599157105098,103.935993222198,103.93599519375348,103.93598593505452,103.93598757593618,103.93598097200996,103.93598729128452,103.93598433401458,103.9359894511563,103.93598906833532,103.93599740117877,103.93598897392566,103.9359951128949,103.93599098343176,103.9359992962188,103.93599759118769,103.9360076673111,103.93601323546063,103.93603907058,103.936065116064,103.93609798404005,103.93613011095266,103.9361700520723,103.93621270872048,103.93625148866946,103.93630326259604,103.93635229189177,103.93640412683638,103.93645220475928,103.9365054628182,103.93655375189736,103.93660181169626,103.93664484170414,103.93668806360834,103.936719642683,103.93674682436205,103.93677564913912,103.93679649927348,103.93681764988912,103.93681962541316,103.93682109955142,103.93682041012326,103.93681629418852,103.93681084535568,103.93682315941174,103.93681997511848,103.93681491758907,103.93681503919755,103.93681392862815,103.93681103510718,103.93680859245802,103.936808153451,103.93680922723829,103.93681268541958,103.93680773841793,103.93680587662148,103.93680458572246,103.93680687173809,103.9368046992286,103.936803468556,103.93681127474932,103.93680713883496,103.93679637066526,103.93678943926372,103.93677373183826,103.93674544103804,103.93672067667796,103.93669605252474,103.936667831773,103.93663244760168,103.9365899703367,103.93654697195876,103.93650001629362,103.93645421263544,103.9364055335529,103.93635606297768,103.93631878460998,103.93628158627824,103.93623848715006,103.93619960567376,103.93616458122015,103.93613304295478,103.93610161476654,103.93606921451588,103.9360395692364,103.93601712710708,103.93599905284368,103.93598628824404,103.93597916398726,103.93597697914348};

    private static final double base_lat = 30.75231973150331,base_lon = 103.93098944486947;
    public static ArrayList<Pair<Double,Double>> genPointsInUESTC(int count){
        ArrayList<Pair<Double,Double>> points = new ArrayList<>();
        Random rad = new Random(System.currentTimeMillis());
        for(int i = 1;i<=count;i++){
            points.add(new Pair(base_lat + rad.nextInt(10000) / 1000000.0/2.0,base_lon + rad.nextInt(10000) / 1000000.0/2.0));
        }
        return points;
    }
    public static ArrayList<Pair<Double,Double>> genRegularRoutine(int count){
        ArrayList<Pair<Double,Double>> points = new ArrayList<>();
        Random rad = new Random(System.currentTimeMillis());
        for(int i = 0;i<=count;i++){
            points.add(new Pair(latitude[i%latitude.length]+rad.nextInt(20)*1e-13,lontitude[i%latitude.length]+rad.nextInt(10)*1e-14));
        }
        return points;
    }

}