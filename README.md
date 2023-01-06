# Todo List Spring Boot Uygulaması

Bu, bir Spring Boot uygulaması olarak geliştirilen bir Todo List uygulamasıdır. Uygulama, veritabanından veri okuma, veri ekleme, veri güncelleme ve veri silme gibi işlemleri yaparak kullanıcılara todo görevlerini yönetme imkanı verir.

## Önkoşullar

Uygulamayı çalıştırabilmek için aşağıdaki yazılımların yüklü olması gerekir:

- Java 8 veya üstü
- Apache Maven

## Nasıl Çalıştırılır?

Uygulamayı çalıştırmak için aşağıdaki adımları izleyin:

1. Projeyi bilgisayarınıza indirin ve bir komut istemi penceresi açın.
2. Projenin olduğu dizine gidin.
3. `mvn package` komutunu çalıştırın. Bu komut, projeyi derleyip bir jar dosyası oluşturacaktır.
4. `java -jar target/todo-list-0.0.1-SNAPSHOT.jar` komutunu çalıştırın. Bu komut, uygulam projeyi başlatacaktır.
5. Uygulama, varsayılan olarak `http://localhost:8080` adresinde çalışmaya başlayacaktır. Bu adresi web tarayıcınızın adres çubuğuna yazıp uygulamayı açabilirsiniz.
6. Uygulamada, yeni bir todo görevi eklemek için "Add a todo" yazısının yanındaki boş alana görev adını yazın ve "Add" düğmesine tıklayın.
7. Eklenen todo görevi, görevler listesinin altında görüntülenecektir.
8. Görevi tamamlamak için görev adının yanındaki onay kutusuna tıklayın. Tamamlanan görev, liste içinde mavi renkte görüntülenecektir.
9. Görevi silmek için görev adının yanındaki çöp kutusuna tıklayın.
10. Tüm görevleri silmek için "Delete All" düğmesine tıklayın.

