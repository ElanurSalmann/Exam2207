# Exam2207
//Sual 3: 
Primary constructor class adını təyin edərkən class adının yanında olur və yalnız class-daki dəyişənlərə ilkin qiymətlər vermək üçün istifadə olunur. Biz primary konstruktorda kod yaza bilmirik.
**Case 1: Basic Primary Constructor:**
class Person(val name: String, val age: Int) {
    // Class body
}
**Case 2: Primary constructor with access modifiers****
class Employee private constructor(val id: Int, val name: String) {
    // Class body
}
**Case 3: Primary constructor with initialization blocks:**
class Car(val make: String, val model: String) {
    init {
        // Initialization block executed during object creation
        println("New car created: $make $model")
    }
}
**Case 4: Primary constructor with default parameter values:**
class Student(val name: String, val age: Int = 18) {
    // Class body
}

//Sual 4:
Kotlin dilində "data class" verilənləri saxlayan və onları uyğun metodlarla birlikdə təmin edən bir sinif tipidir. Kotlin'də "data class" yaratmaq üçün sadəcə "data" açar sözünü class-dan əvvəl istifadə edirik. Beləliklə, class daxilində sadəcə verilənlər təyin edilir:
data class Person(val name:String, var age:Int)
 Yuxarıdakı nümunədə, Person adlı "data class" yaradılır. Bu sinifin sadəcə name və age adlı verilənləri vardır. Kotlin avtomatik olaraq bu verilənlər üçün "getter" və "setter" metodlarını yaradır, buna görə də onları koddan əlavə etmək lazım deyil. Bununla yanaşı, "data class" üçün "toString", "equals", "hashCode" və "copy" metodu da avtomatik olaraq təyin edilir.
Bu avtomatik təyin edilmiş metodlar sayəsində "data class" obyektləri dəyərlərini yoxlamaq, kopyalamaq və göstərmək üçün daha rahat istifadə edilir. 

//Sual 5:
1. Using arrayOf function:
val numbers=arrayOf(1,2,3,4,5)
2.Using List and toTypedArray:
val list=listOf("apple", "banana","orange")
val fruitsArray=list.toTypedArray()

//Sual 6:
var - Dəyişdirilə bilər (mutable) verilən təyin etmək üçün istifadə olunur. Bir dəyişkən var açar sözü ilə təyin olunduğu zaman, onun dəyəri daha sonra dəyişdirilə bilər: 
var age=25
age=30

val - Dəyişdirilə bilməyən (immutable) verilən təyin etmək üçün istifadə olunur. val açar sözü ilə təyin olunan dəyişkənlərin dəyəri bir dəfə təyin edildikdən sonra daha sonra dəyişdirilə bilməz: 
val name="Elanur"
//name="Elya" will create an error

//Sual 7:
+ operatorunu istifadə etmək:
  val name="Elanur"
  val surname="Salmanzade"
  vall fullname=name+ " " + surname
  println(fullname)

//Sual 8:
Kotlin dilində, ? işarəsi "nullable" (boş ola bilən) olaraq adlandırılan dəyişənləri ifadə edir. "Nullable" dəyişənlər dəyər daşıyabilir və ya "null" qiymətini özündə əks etdirə bilər.
Bir dəyişənin nullable olduğunu bildirmək üçün dəyişən tipinin sonuna ? işarəsi əlavə edilir.
var age: Int? = null
Yuxarıdakı nümunədə, age dəyişəni Int tipindədir, lakin ? işarəsi ilə nullable edilib. Bu deməkdir ki, age dəyişəni bir tam ədəd daşıya bilər və ya heç bir dəyəri olmayaraq (null) qala bilər.

//Sual 11:
1.	onCreate: Activity ilk işə düşəndə yaranır. Bu mərhəldə "onCreate" metodu çağırılır. Hər bir app-də olmalı olan önəmli metodlardan biridir.
2.	onStart: Application-u açanda onCreate() methodundan sonra işə düşən metoddur.Bura istifadəçinin gördüyü UI olan hissədir.Bu metod çok sürətli şəkildə baş verib, davamında onResume() metoduna öz yerini verir.
3.	onResume: Activity onResume() metoduna girdiyində application ön plana gəlir.Bu metod istifadəçi ilə qarşılıqlı əlaqədə olmağa imkan verir.
4.	onPause: Sistem application-un hər hansı bir səbəbdən bağlandığını bildirdiyi zaman işə düşür.Yəni app-imiz arxaplana atıldığı zaman ,zəng gəldiyi zaman ya da başqa bir app açıldığı zaman bu method işə düşür.
5.	onStop:  sistem arxaplandan silindiyində ya da başqa bir səbəbdən bağlandığında onStop() metodu işə düşür.
7.	onDestroy: Activity artıq app-in bir hissəsi olmur və sistem tərəfindən dağıdılır. Bu mərhələdə "onDestroy" metodu çağırılır. Burada activity ilə bağlı bütün yaddaş və buna bənzər resurslar təmizlənir.

//Sual 12: 
AndroidManifest, Android-in əsas konfiqurasiya faylıdır. Bu faylda, app-in tələbləri və digər məlumatları təyin edilir. AndroidManifest.xml adı altında "xml" formatında yaradılır. AndroidManifest, app-in sistem və digər application-larla uyğun şəkildə fasiləsiz işləyə biləcəyi mühit təmin edir. Bu faylda aşağıdakı əsas elementlər mövcuddur:
1.	package: App-in adıdır və Android cihazında tətbiqi birbaşa təyin edir.
2.	uses-sdk:App-in tələb etdiyi minimal və maximal Android API səviyyəsini bildirir.
3.	application: App-in əsas tənzimləmələrini və xüsusiyyətlərini təyin edir. Burada icra zamanı icazələri, tema və stilleri, loqo, app məlumatları kimi məlumatlar yer alır.
4.	activity: App-də bir activity-nin təyinatı, adı, iconu, icazələri, mövcudluğu və daha çox məlumatı təyin edir. 
5.	service: App-də bir servisin təyinatı, adı, iconu, icazələri, mövcudluğu və daha çox məlumatı təyin edir. 

//Sual 13: 
Intent, Android application-larında fərqli activity-ler və ya proseslər arasında məlumatların ötürülməsi üçün istifadə olunan bir obyektdir. 
İki növ Intent mövcuddur:
1.	Explicit Intent : Bu tip Intent, tətbiq daxilində bir activity başlatmaq və ya bir servisə əmr göndərmək üçün istifadə olunur. Intent-də activity və ya servisin adı açıq şəkildə təyin edilir və məqsəd müəyyən bir activity-dən başqa bir activity-ə keçid etməkdir.
2.	Implicit Intent : Bu tip Intent,tətbiq içindən xarici bir komponenti çağırmaq üçün istifadə olunur. 
Intent-lər məlumatları təmsil etmək üçün putExtra və getExtra metodları ilə birləşdirilə bilər. Məsələn, bir activity-dən başqa bir activity-ə məlumat ötürmək üçün, bir Intent yaradılır və putExtra metodları vasitəsilə məlumatlar Intent-ə əlavə edilir. Sonra, Intent activity başlatmaq üçün startActivity metodu ilə tətbiq olunur.

//Sual 14: 
1.	LinearLayout : Bu layout elementləri sıralı bir xətt üzərində düzəldir. Elementlər, təyin olunan sıra ilə yanaşı (üfüqi) və ya alt-alta (şaquli olaraq) düzəlir.
2.	RelativeLayout : Bu layout-da elementlər ekranın üstündə, solunda, sağında və ya altında başqa elementlərə nisbətən təyin edilir.
3.	ConstraintLayout : Bu layout elementləri kənarlama xüsusiyyətləri ilə müəyyənləşdirərək düzəldir. Elementlər, digər elementlərə, ekranın kənarlarına və ya bir-biri ilə müəyyən məsafələrə görə təyin edilir.
4.	FrameLayout: Bu layout elementləri üst-üstə qoymağa imkan verir. 
5.	GridLayout: Bu layout elementləri bir cədvəl şəklində düzəldir. Elementlər cədvəlin sətirlərində və sütunlarında düzəlir.
6.	CoordinatorLayout: Bu layout elementlər arasında "Coordinator" funksiyonunu yerinə yetirmək üçün istifadə olunur. Scrolling və digər kompleks interaktiv fəaliyyətlər üçün istifadə edilir.


