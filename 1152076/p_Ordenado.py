#numeros = [10754,89734,11391,88630,11699,88007,12778,86400,12940,86367,12995,86109,13449,83910,13586,83278,13686,81364,15709,80292,16208,79229,16829,78836,17084,78689,17620,78010,17918,77303,19468,76941,19788,75594,19872,74509,20292,74379,20778,71314,21448,70566,22204,70098,22827,69737,23947,67912,24459,67520,25145,66909,25891,66187,28594,65141,29294,64167,31008,64106,31288,63437,33317,63281,33792,62969,34493,61887,36772,61665,37637,61396,37803,60932,40249,59608,40785,58786,41325,56579,42667,56557,44595,55453,44664,54486,44787,52702,44836,51717,45805,50623,47058,50498,47245,50259,47999,49780,48105,48750]
#numeros.sort()
#numeros
#print("Arreglo de números original:")
#print(numeros)
#seleccion(numeros)
#print("Arreglo de números ordenado: ")
#print(numeros)
import time
inicio = time.time()
#numeros = [10754,89734,11391,88630,11699,88007,12778,86400,12940,86367,12995,86109,13449,83910,13586,83278,13686,81364,15709,80292,16208,79229,16829,78836,17084,78689,17620,78010,17918,77303,19468,76941,19788,75594,19872,74509,20292,74379,20778,71314,21448,70566,22204,70098,22827,69737,23947,67912,24459,67520,25145,66909,25891,66187,28594,65141,29294,64167,31008,64106,31288,63437,33317,63281,33792,62969,34493,61887,36772,61665,37637,61396,37803,60932,40249,59608,40785,58786,41325,56579,42667,56557,44595,55453,44664,54486,44787,52702,44836,51717,45805,50623,47058,50498,47245,50259,47999,49780,48105,48750]
numeros = [10228,89991,10236,89961,10266,89938,10392,89818,10417,89685,10507,89651,10582,89637,10617,89441,10654,89267,10782,89063,10852,88952,10959,88884,11027,88795,11072,88516,11082,88376,11123,88127,11128,88105,11144,88104,11186,88085,11265,87844,11357,87790,11433,87769,11511,87667,11523,87659,11547,87594,11559,87587,11694,87581,11707,87520,11884,87396,11918,87353,11930,87301,11965,87237,12070,87166,12081,87054,12084,87016,12177,87015,12192,86920,12287,86875,12320,86822,12372,86780,12549,86650,12598,86625,12636,86571,12656,86349,12658,86281,12729,86124,12841,86045,12955,86044,13219,85954,13337,85951,13567,85871,13844,85823,13894,85700,14030,85686,14175,85641,14251,85588,14303,85588,14442,85581,14531,85576,14604,85498,14604,85392,14630,85371,14667,85202,14787,85021,14794,84995,14957,84994,14992,84888,14995,84808,15019,84781,15033,84709,15074,84657,15087,84600,15099,84588,15168,84564,15219,84527,15305,84463,15345,84375,15360,84372,15363,84275,15435,84254,15496,84064,15568,83991,15569,83935,15653,83924,15682,83847,15806,83687,15843,83664,15923,83664,16114,83466,16227,83440,16244,83417,16329,83355,16523,83214,16598,83176,16602,83019,16694,82903,16721,82896,17081,82884,17084,82873,17172,82740,17304,82710,17459,82532,17531,82506,17619,82426,17885,82241,17919,82239,18093,82216,18155,82172,18216,82077,18280,81825,18454,81784,18527,81616,18592,81356,18623,81189,18645,81023,18777,80991,18804,80974,18845,80956,18847,80922,18864,80660,18909,80339,19088,80149,19186,80012,19426,79937,19490,79915,19626,79913,19680,79821,19745,79602,19762,79537,19864,79427,19866,79321,19883,79294,19885,79223,19893,79162,20145,78777,20201,78675,20245,78419,20256,78372,20485,78331,20717,78013,20756,77893,20805,77866,20909,77832,20927,77819,20997,77809,21120,77740,21162,77605,21324,77573,21425,77422,21427,76871,21622,76830,21730,76603,21829,76596,21925,76557,22029,76545,22103,76367,22153,76339,22169,76269,22171,76215,22229,76204,22527,76057,22660,75862,22821,75671,22945,75599,23034,75413,23216,75390,23245,75160,23285,74987,23396,74911,23398,74748,23632,74575,23671,74515,23776,74418,23884,74304,23982,74232,24004,74205,24023,74193,24172,74138,24241,74088,24255,73965,24319,73846,24644,73775,24746,73754,24839,73726,24911,73684,24919,73629,25016,73447,25160,73287,25702,73240,25709,73239,25729,72996,25877,72656,25878,72615,25900,72458,26179,72455,26382,72355,26389,72241,26461,72128,26480,72087,26716,71882,26756,71746,26764,71681,26959,71409,27054,71359,27072,71316,27122,71226,27203,71225,27211,71202,27382,71200,27646,71154,27664,71070,27695,71015,27834,70933,27941,70876,27995,70863,28040,70778,28080,70721,28116,70475,28121,70444,28126,70314,28197,70273,28209,70273,28402,70263,28442,70243,28505,70237,28541,70180,28594,70170,28619,69989,28650,69963,28651,69670,28688,69596,28759,69568,28876,69424,28877,69397,28927,69388,28943,69326,28954,69295,29055,69138,29127,69067,29128,69039,29169,69015,29293,68969,29323,68943,29326,68920,29520,68900,29541,68716,29548,68701,29732,68462,29831,68334,29967,68284,29973,68156,30053,68036,30054,67862,30088,67726,30155,67683,30170,67620,30215,67579,30221,67427,30383,67421,30422,67339,30477,67181,30498,67083,30566,66953,30638,66900,30650,66528,30786,66312,30786,66306,30903,66241,30922,66126,30946,65897,30957,65852,30969,65824,31018,65753,31027,65725,31133,65720,31203,65600,31300,65507,31307,65317,31454,65217,31460,65048,31501,64957,31540,64943,31584,64900,31588,64889,31631,64818,31678,64558,31849,64267,31852,64261,31892,64204,31961,64161,31979,63952,32013,63853,32016,63737,32061,63639,32218,63636,32274,63540,32776,63437,32841,63410,32889,63265,32954,63254,32974,63146,33098,63019,33157,63005,33164,62952,33209,62858,33274,62806,33284,62699,33299,62608,33472,62593,33740,62507,33759,62450,34177,62328,34279,62271,34361,62188,34525,62187,34599,62127,34654,62009,34658,61978,34741,61805,34799,61761,34861,61739,34908,61641,34917,61619,35068,61532,35124,61530,35165,61518,35295,61428,35377,61394,35524,61372,35574,61290,35645,61214,35681,61100,35705,61078,35830,61016,35843,61009,35882,60763,35890,60695,35934,60544,35973,60526,36090,60491,36154,60486,36230,60482,36374,60401,36399,60314,36428,60104,36456,60052,36466,60044,36506,60024,36594,59974,36648,59957,36683,59730,36686,59541,36850,59496,36860,59440,36905,59332,36936,59315,37087,58966,37151,58936,37219,58839,37234,58679,37310,58489,37467,58370,37498,58348,37626,58217,37634,58105,37710,58094,37734,57997,37826,57990,37880,57878,37941,57617,38000,57603,38028,57506,38033,57469,38059,57434,38112,57368,38357,57326,38393,57280,38432,57263,38524,57248,38598,57230,38603,57147,38695,57123,38697,56851,38724,56699,38793,56699,38848,56687,38899,56343,38958,56103,38968,56025,38978,55981,38980,55916,39304,55915,39518,55912,39657,55906,39688,55845,39779,55842,39852,55819,39904,55790,39916,55777,39960,55752,39996,55534,40109,55534,40111,55496,40116,55404,40244,55139,40377,54984,40427,54968,40532,54913,40535,54845,40543,54829,40561,54825,40635,54728,40921,54587,40926,54345,41086,54316,41295,54283,41329,54221,41448,54174,41477,54051,41588,53886,41669,53641,41685,53565,41742,53356,41767,53155,41823,53118,41883,53058,42089,52836,42152,52669,42225,52581,42245,52476,42381,52430,42464,52420,42492,52391,42526,52368,42530,52365,42581,52321,42612,52262,42713,52226,42828,52191,42845,52031,42868,51950,42921,51805,43059,51759,43070,51600,43076,51315,43167,51309,43220,51290,43270,51279,43335,51236,43408,51103,43434,51068,43438,50937,43536,50836,43541,50797,43597,50743,43734,50621,43799,50489,43818,50301,43957,50058,43997,50047,44352,49992,44366,49959,44403,49937,44421,49918,44452,49795,44509,49759,44530,49749,44597,49703,44785,49648,44899,49589,45045,49589,45237,49466,45242,49329,45420,49280,45685,49185,45705,49091,45887,48947,45952,48939,45955,48903,46102,48840,46202,48689,46246,48593,46290,48554,46327,48320,46389,48263,46404,48153,46419,48127,46449,48127,46559,47928,46671,47658,46676,47575,46748,47543,46789,47522,46878,47452,46905,47449,46922,47425,46934,47256,46947,47216,47029,47190,47057,47061]
#numeros = []
#print("Lista desordenada: ", numeros)
numeros.sort()
print("Lista Ordenada: ", numeros)
final = time.time()
delta = final - inicio
print("el tiempo que se demoro fue de: {:.3f}s.".format(delta))
