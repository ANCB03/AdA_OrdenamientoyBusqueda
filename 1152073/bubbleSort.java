/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tarea;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class bubbleSort {

    /**
     * @param args the command line arguments
     */
 // Bubble sort in Java



class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int size = array.length;
    
    // loop to access each array element
    for (int i = 0; i < size - 1; i++)
    
      // loop to compare array elements
      for (int j = 0; j < size - i - 1; j++)

        // compare two adjacent elements
        // change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      int[] data ={15019,41588,43734,12549,49091,36860,14787,46389,59315,23884,54283,16602,29831,55496,47216,47029,48689,28759,63005,41767,85954,42530,55777,81616,39657,10959,49959,14030,14251,43270,70721,46878,33274,46559,10236,38393,20256,24255,54825,72656,89685,10507,81825,19426,70314,82710,62507,29326,36648,37941,82884,25702,76603,11265,31678,12070,62699,33209,80974,40535,55404,30477,61805,31584,31961,69295,53565,31892,84709,55845,58489,84588,28650,14667,16329,27054,36456,56699,61978,28619,51236,50047,69424,46419,41448,73447,21120,11965,51068,57280,69568,11144,42492,85588,84657,25877,77740,48127,55842,32013,68462,38112,39688,49795,36850,22229,54845,36154,57878,82241,33759,41086,79294,31460,52476,40111,73684,79915,36683,82532,78777,50058,55915,28876,28943,33098,36428,79223,37626,89818,34525,38978,69039,89991,81784,47190,46789,49589,73726,35068,41742,20717,35705,18216,54051,51290,12841,47449,59974,57147,45685,30903,75671,71316,57506,11128,82426,22103,55752,47543,51950,50743,85588,25016,14604,37467,57990,89441,62952,65217,60052,68701,49703,38793,66528,43076,15305,53886,87844,30054,42089,84564,44352,36399,57248,84994,11707,54174,76545,57326,32274,41477,15653,67427,11027,82896,43059,28121,43541,52365,60491,35934,43070,43799,30053,56343,71154,58839,51805,27941,54221,86822,41669,27211,11082,86044,18280,29520,80149,30498,67620,17084,47057,42845,88376,70273,49589,74138,79937,27122,65600,38848,28927,80922,15806,73965,14957,52368,11123,79537,10582,61372,87353,87301,71070,64267,26764,83687,48947,12372,31501,33740,49749,12955,27072,18864,11547,45242,43957,71359,56699,52836,63254,84995,20145,21162,15087,24911,17919,88884,61428,55819,67683,87054,41685,62450,39779,65852,23776,23671,49918,61619,76339,75160,59957,70876,61078,80956,48554,64161,71015,82239,47061,71746,21829,55916,85700,43167,84064,72355,49280,14604,71681,52669,63636,60314,57368,36090,38695,68156,27834,24004,11072,49329,54984,12658,61518,41295,72458,50937,78419,77605,29967,10782,36594,87594,57434,20927,28954,66312,56025,54345,19864,35973,34799,89063,58348,39996,89267,74193,76269,61394,43438,57617,31203,87166,63265,75862,14794,17885,18454,61290,14442,83664,26389,30383,39960,24319,63437,60401,30957,17459,44509,85021,46748,18623,52321,42612,61761,62009,69067,80991,15496,28877,35295,51279,65720,86124,85823,70863,60482,31027,22169,35645,37710,30969,12192,76596,84888,31454,47928,67862,23982,47256,69397,40116,39904,83440,36936,28594,32974,54587,48840,15843,39852,11884,72996,51315,37634,76204,35377,88105,19762,40926,48127,83355,50836,76215,44366,12636,39916,66241,79913,15569,38697,35524,31852,52420,86625,25709,35165,70933,31588,84463,48903,79427,44530,22029,56687,41329,87769,45420,20805,12729,33157,14995,20485,58966,84254,59440,38958,32889,86875,74304,83176,70243,37219,73239,18909,42225,75390,54913,65753,73240,38724,61009,29293,32841,68920,17619,42713,37151,43408,17172,52430,87587,38603,49466,21730,63540,36230,68334,52581,29127,62593,36374,65824,12081,68900,19490,11930,33472,28402,46922,46934,15682,72615,10617,26756,69326,60486,22527,57123,11918,74911,83417,60763,48939,25160,55139,51759,32218,64558,85371,83924,79321,88104,60024,44403,20909,70180,41823,27646,67726,43434,10417,30422,17304,73846,53118,34361,70170,66953,86650,83847,48263,37880,18777,35830,45887,66306,51103,38980,83214,66900,32016,71200,58370,52191,15568,49992,11186,42526,87520,40561,46202,44597,42868,55790,38899,13219,85498,12177,89651,71202,62806,61641,79162,53641,80012,12598,62127,76057,35890,34279,19088,27382,61532,22945,52391,63019,46290,24839,32776,19866,29973,68036,68284,40543,82077,76367,16598,11511,16694,57469,78675,69670,77866,48320,43997,83664,84808,69963,15074,15923,44899,77832,11433,85392,26382,17081,87790,50797,14303,58094,51600,37087,30170,36506,69388,73775,42381,52262,38028,57997,14175,18093,12084,15345,13844,29169,43597,11559,39518,64900,65048,22171,44785,45705,74575,16721,45045,76830,54728,82903,42245,76871,40635,29732,60695,15033,27995,38059,47425,65317,29541,47452,61100,18845,53155,34917,14992,57263,15099,59730,30221,72128,14630,16523,15360,50489,37234,22153,21324,61739,20201,45955,11357,23396,75413,82506,30088,34658,54968,69596,11523,32061,84781,83019,30786,21925,54316,37734,26179,30155,71882,60544,55534,51309,70263,65507,40427,20756,19883,67339,73754,72455,28442,65725,31018,27203,27664,42464,34741,62271,46947,34861,83991,58217,87659,86780,53058,38432,78372,82216,46671,89961,17531,15219,84372,74205,48153,28197,30922,20997,61214,12287,28080,18155,43536,36905,39304,10654,26480,63952,82873,24023,57230,33299,56103,29323,70273,77573,19893,34177,72087,33284,64818,78331,85641,88516,63146,77809,87015,52226,63853,79821,34599,31133,74088,60044,37826,26716,62188,21427,45237,43335,18592,52031,86045,46905,31307,38000,74748,19626,18804,87016,13337,66126,40377,86920,71225,23245,18645,64889,45952,70237,22660,74232,84600,84275,85576,55912,55534,34654,85202,12320,59496,47658,84527,14531,74515,89938,73629,70475,16114,40921,27695,87237,24746,19745,28126,80339,77893,46327,61530,13894,53356,88952,38524,44421,31979,32954,40244,67083,62858,64261,83935,35681,15435,64943,31540,62187,13567,49759,31849,71409,37498,81356,31300,19680,56851,58105,87396,81189,75599,55906,63737,67181,67579,37310,58679,30786,29548,67421,85686,69015,30946,42581,86571,30638,46449,74987,40109,64957,69138,46246,46102,85871,80660,19186,12656,76557,68716,28116,29055,22821,60104,43220,38598,38033,28209,83466,35882,47522,19885,16244,41883,30566,43818,58936,24919,86349,85581,69989,57603,49937,88127,70444,61016,42152,10852,33164,73287,29128,10392,28541,10266,34908,35124,82740,38968,15363,42921,46404,35843,42828,23632,25900,15168,87581,28651,72241,28040,44452,49185,86281,49648,78013,50621,62608,24172,28688,35574,21622,26959,18527,36466,28505,68943,68969,71226,88085,30650,59332,88795,55981,38357,59541,21425,77819,24241,60526,84375,25729,18847,23398,63410,25878,89637,10228,40532,81023,63639,87667,74418,23216,23285,16227,77422,26461,65897,62328,30215,50301,24644,31631,79602,54829,64204,85951,47575,70778,11694,48593,20245,46676,23034,82172,36686};
    // call method using class name
    Main.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
}