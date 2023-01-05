# todoListJava
 Todo List Java Spring
<hr>
Todo uygulaması
Bu uygulama, kullanıcıların günlük yapacaklarını takip etmelerine yardımcı olan bir Todo listesi uygulamasıdır. Kullanıcılar, yapacaklarını ekleyebilir, düzenleyebilir ve tamamlanan görevleri silme işlemini gerçekleştirebilirler.
</hr>
Kurulum
Öncelikle, bu uygulamayı çalıştırmak için Java ve Spring Boot kurulu bir bilgisayara ihtiyacınız olacak.

Uygulamayı indirin ve bir kod editörüyle açın.

Veritabanı bağlantısı için, projenin "src/main/resources/application.properties" dosyasındaki "spring.datasource.username" ve "spring.datasource.password" değişkenlerini kendi MySQL kullanıcı adınız ve şifrenizle değiştirin.

Proje kök dizininde, "mvn spring-boot:run" komutunu çalıştırarak uygulamayı çalıştırın.

Uygulama, varsayılan olarak "http://localhost:8080" adresinde çalışmaya başlayacaktır.

Kullanım
Uygulamaya giriş yaptıktan sonra, aşağıdaki işlemleri gerçekleştirebilirsiniz:

Yapılacaklar listesine yeni bir görev eklemek için, "Yeni görev ekle" butonuna tıklayın ve görev açıklamasını yazın.

Bir görevi düzenlemek için, o görevin yanındaki "Düzenle" butonuna tıklayın ve görev açıklamasını güncelleyin.

Bir görevi tamamlamak için, o görevin yanındaki "Tamamla" kutusunu işaretleyin. Tamamlanan görevler, yapılacaklar listesinin altında "Tamamlanan görevler" başlığı altında gösterilecektir.

Tamamlanan bir görevi silmek için,o tamamlanan görevin yanındaki "Sil" butonuna tıklayın.

Özellikler
Kullanıcıların günlük yapacaklarını takip etmelerine yardımcı olan bir Todo listesi.
Yapılacaklar listesine yeni görevler ekleyebilme.
Görevleri düzenleyebilme ve tamamlanan görevleri silme.
Ekran Görüntüleri
Ana ekran:

Ana ekran

Yeni görev ekleme ekranı:

Yeni görev ekleme ekranı

Görev düzenleme ekranı:

Görev düzenleme ekranı

Tamamlanan görevler:

Tamamlanan görevler:
