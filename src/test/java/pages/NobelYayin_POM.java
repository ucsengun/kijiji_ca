package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

import java.util.List;

public class NobelYayin_POM extends MyMethods {
    public NobelYayin_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/h-ontario/9004\"]")
    private WebElement ontario;
    @FindBy(xpath = "//a[@href=\"/h-hamilton/80014\"]")
    private WebElement hamilton;
    @FindBy(xpath = "//a[@class=\"button-open next\" and @id=\"LocUpdate\"]")
    private WebElement goButton;
    @FindBy(xpath = "//a[@id='cat-menu-item-27']")
    private WebElement carsAndVehicles;
    @FindBy(xpath = "//span[normalize-space()='Cars & Trucks']")
    private WebElement carsAndTrucks;
    @FindBy(xpath = "//input[@id='minPrice']")
    private WebElement price1;
    @FindBy(xpath = "//input[@id='maxPrice']")
    private WebElement price2;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    private WebElement searchVehicles;
    @FindBy(xpath = "//a[normalize-space()='2007 Volkswagen Golf City 2.0']")
    private WebElement car;
    @FindBy(xpath = "//input[@name='meslek']")
    private WebElement meslek;
    @FindBy(xpath = "//input[@name='dtarihi']")
    private WebElement dogumTarihi;
    @FindBy(xpath = "//input[@value='Evli']")
    private WebElement medeniHal;
    @FindBy(xpath = "//input[@name='eposta']")
    private WebElement ePosta;
    @FindBy(xpath = "//input[@name='ogrenimLise']")
    private WebElement okulAdiLise;
    @FindBy(xpath = "//input[@name='ogrenimLiseBolum']")
    private WebElement bolumLise;
    @FindBy(xpath = "//input[@name='ogrenimLiseTarih']")
    private WebElement baslamaBitisTarihiLise;
    @FindBy(xpath = "//input[@name='ogrenimLisans']")
    private WebElement okulAdiLisans;
    @FindBy (xpath = "//input[@name='ogrenimLisansBolum']")
    private WebElement bolumLisans;
    @FindBy(xpath = "//input[@name='ogrenimLisansTarih']")
    private WebElement baslamaBitisTarihiLisans;
    @FindBy(xpath = "//input[@name='isyeri_adi']")
    private WebElement isyeriAdi;
    @FindBy(xpath = "//input[@name='gorev']")
    private WebElement gorev;
    @FindBy(xpath = "//input[@name='net_gelir']")
    private WebElement netGelir;
    @FindBy(xpath = "//input[@name='girisCikisTarihi']")
    private WebElement girisCikisTarihi;
    @FindBy(xpath = "//input[@name='neden']")
    private WebElement ayrilikNedeni;
    @FindBy(xpath = "//input[@name='dil']")
    private WebElement dil;

    @FindBy(xpath = "//select[@name='okuma']//option[@value='İyi'][contains(text(),'İyi')]")
    private WebElement okuma;


    @FindBy(xpath = "//select[@name='yazma']//option[@value='İyi'][contains(text(),'İyi')]")
    private  WebElement yazma;

    @FindBy(xpath = "//select[@name='konusma']//option[@value='İyi'][contains(text(),'İyi')]")
    private WebElement konusma;

    @FindBy(xpath = "//input[@name='programlama']")
    private WebElement programlamaDilleri;

    @FindBy(xpath = "//input[@name='veritabani']")
    private WebElement veriTabani;
    @FindBy(xpath = "//input[@name='paketprogram']")
    private  WebElement paketProgramlar;

    @FindBy(xpath = "//input[@name='digerprogram']")
    private WebElement diger;

    @FindBy(xpath = "//td[contains(text(),'Ehliyetiniz Var m')]//input[2]")
    private WebElement varEhliyet;

    @FindBy(xpath = "//input[@name='ehliyet_grubu']")
    private  WebElement ehliyetSinifi;

    @FindBy(xpath = "//td[normalize-space()='Var']//input[@name='ehliyet_deneyim']")
    private WebElement varSoforlukDeneyimi;

    @FindBy(css = "input[value='Yok'][name='saglik']")
    private WebElement yokSaglikSorunu;

    @FindBy(css = "input[value='Yok'][name='seyehat']")
    private WebElement yokSeyahatEngeli;
    @FindBy(css = "input[value='Yaptı']")
    private  WebElement yaptiAskerlikDurumu;

    @FindBy(xpath = "//input[@name='sigara']")
    private WebElement sigaraKullaniyorMusunuz;

    @FindBy(xpath = "//input[@name='alkol']")
    private  WebElement alkolKullaniyorMusunuz;

    @FindBy(xpath = "//input[@name='hassas']")
    private WebElement hassasOldugunuzKonu;

    @FindBy(xpath = "//input[@name='hobiler']")
    private WebElement hobileriniz;

    @FindBy(xpath = "//input[@name='yetenek']")
    private WebElement ozelYeteneginiz;
    @FindBy(xpath = "//input[@name='referans_adi']")
    private  WebElement referansAdSoyad;

    @FindBy(xpath = "//input[@name='referans_meslegi']")
    private WebElement referansMeslegi;

    @FindBy(xpath = "//input[@name='referans_adresi']")
    private  WebElement referansAdresi;

    @FindBy(xpath = "//input[@name='referans_telefonu']")
    private WebElement referansTelefonu;

    @FindBy(xpath = "//input[@name='departman']")
    private WebElement calismakIstediginizDepartman;

    @FindBy(xpath = "//input[@name='ucret_talep']")
    private WebElement talepEttiginizUcret;
    @FindBy(xpath = "//textarea[@name='tanim']")
    private  WebElement kendiniziNasilTanimlarsiniz;

    @FindBy(xpath = "//textarea[@name='aciklama']")
    private WebElement aciklama;
    public WebElement getOntario() {
        return ontario;
    }

    public WebElement getHamilton() {
        return hamilton;
    }

    public WebElement getGoButton() {
        return goButton;
    }

    public WebElement getCarsAndVehicles() {
        return carsAndVehicles;
    }

    public WebElement getCarsAndTrucks() {
        return carsAndTrucks;
    }


    public WebElement getPrice1() {
        return price1;
    }

    public WebElement getPrice2() {
        return price2;
    }

    public WebElement getSearchVehicles() {
        return searchVehicles;
    }

    public WebElement getCar() {
        return car;
    }

    public WebElement getMeslek() {
        return meslek;
    }

    public WebElement getDogumTarihi() {
        return dogumTarihi;
    }

    public WebElement getMedeniHal() {
        return medeniHal;
    }

    public WebElement getePosta() {
        return ePosta;
    }

    public WebElement getOkulAdiLise() {
        return okulAdiLise;
    }

    public WebElement getBolumLise() {
        return bolumLise;
    }

    public WebElement getBaslamaBitisTarihiLise() {
        return baslamaBitisTarihiLise;
    }

    public WebElement getOkulAdiLisans() {
        return okulAdiLisans;
    }

    public WebElement getBolumLisans() {
        return bolumLisans;
    }

    public WebElement getBaslamaBitisTarihiLisans() {
        return baslamaBitisTarihiLisans;
    }

    public WebElement getIsyeriAdi() {
        return isyeriAdi;
    }

    public WebElement getGorev() {
        return gorev;
    }

    public WebElement getNetGelir() {
        return netGelir;
    }

    public WebElement getGirisCikisTarihi() {
        return girisCikisTarihi;
    }

    public WebElement getAyrilikNedeni(){
        return ayrilikNedeni;
    }

    public WebElement getDil() {
        return dil;
    }

    public WebElement getOkuma() {
        return okuma;
    }

    public WebElement getYazma() {
        return yazma;
    }

    public WebElement getKonusma() {
        return konusma;
    }

    public WebElement getProgramlamaDilleri() {
        return programlamaDilleri;
    }

    public WebElement getPaketProgramlar() {
        return paketProgramlar;
    }

    public WebElement getVeriTabani() {
        return veriTabani;
    }

    public WebElement getDiger() {
        return diger;
    }

    public WebElement getVarEhliyet() {
        return varEhliyet;
    }

    public WebElement getEhliyetSinifi() {
        return ehliyetSinifi;
    }

    public WebElement getVarSoforlukDeneyimi() {
        return varSoforlukDeneyimi;
    }

    public WebElement getYokSaglikSorunu() {
        return yokSaglikSorunu;
    }

    public WebElement getYokSeyahatEngeli() {
        return yokSeyahatEngeli;
    }

    public WebElement getYaptiAskerlikDurumu() {
        return yaptiAskerlikDurumu;
    }

    public WebElement getSigaraKullaniyorMusunuz() {
        return sigaraKullaniyorMusunuz;
    }

    public WebElement getAlkolKullaniyorMusunuz() {
        return alkolKullaniyorMusunuz;
    }

    public WebElement getHassasOldugunuzKonu() {
        return hassasOldugunuzKonu;
    }

    public WebElement getHobileriniz() {
        return hobileriniz;
    }

    public WebElement getOzelYeteneginiz() {
        return ozelYeteneginiz;
    }

    public WebElement getReferansAdSoyad() {
        return referansAdSoyad;
    }

    public WebElement getReferansMeslegi() {
        return referansMeslegi;
    }

    public WebElement getReferansAdresi() {
        return referansAdresi;
    }

    public WebElement getReferansTelefonu() {
        return referansTelefonu;
    }

    public WebElement getCalismakIstediginizDepartman() {
        return calismakIstediginizDepartman;
    }

    public WebElement getTalepEttiginizUcret() {
        return talepEttiginizUcret;
    }

    public WebElement getKendiniziNasilTanimlarsiniz() {
        return kendiniziNasilTanimlarsiniz;
    }

    public WebElement getAciklama() {
        return aciklama;
    }


}
