Feature: Nobel Yayin İnsan Kaynakları


  Scenario: İnsan Kaynakları Kayıt Formu Tamamen Doldurulduğunda Başarılı Kaydın Doğrulaması
    Given Nobel Yayin websitesine eriş.
    And Websayfasını aşağıya doğru kaydır.
    And Ana sayfanın site haritası kısmında yer alan İnsan Kaynakları butonuna tıkla.
    And Açılan kayıt formundaki bütün girdileri uygun bir şekilde doldur.
    Then Kayıt formunun alt kısmında yer alan Gönder butonuna tıkla.

