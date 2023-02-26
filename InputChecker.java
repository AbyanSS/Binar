import java.util.Scanner;
// import javax.lang.model.util.ElementFilter;
// import javax.swing.ToolTipManager;
// import javax.swing.plaf.synth.SynthPasswordFieldUI;
// import javax.xml.transform.Source;

public class InputChecker{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String inputan;
        System.out.print("Masukkan bilangan atau kata : ");
        inputan = input.nextLine().toLowerCase(); //inputan diubah ke huruf kecil semua
        //deklarasi variable
        int vokal = 0, konsonan = 0, totHuruf = 0, spasi = 0, koma = 0, titik = 0, eM = 0, qM = 0, kBuka = 0, kTutup = 0, kbKurawal = 0, ktKurawal = 0;
        int totInput = inputan.length();
        char huruf;

        for(int i = 0; i < totInput; i++){//ini loop buat cek jumlah inputan
            huruf = inputan.charAt(i);

            //ini buat cek konsonan dan vokal
            if(huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                vokal++;
            }else if(huruf >= 'a' && huruf <= 'z'){//antara a sampe z selain aiueo
                konsonan++;
            }

            if(Character.isLetterOrDigit(huruf)){//total input selain karakter
                totHuruf++;
            }

            if(huruf == ' '){
                spasi++;
            }else if(huruf == ','){
                koma++;
            }else if(huruf == '.'){
                titik++;
            }else if(huruf == '!'){
                eM++;
            }else if(huruf == '?'){
                qM++;
            }else if(huruf == '('){
                kBuka++;
            }else if(huruf == ')'){
                kTutup++;
            }else if(huruf == '{'){
                kbKurawal++;
            }else if(huruf == '}'){
                ktKurawal++;
            }
        }
        //Kalau gaada karakternya gaakan di outputkan
        if(vokal > 0){
            System.out.println("Jumlah huruf vokal : "+ vokal);
        }
        if(konsonan > 0){
            System.out.println("Jumlah huruf konsonan : "+ konsonan);
        }
        if(totHuruf > 0){
            System.out.println("Jumlah huruf/angka yang diinput : " + totHuruf);
        }
        if(totInput > 0){
            System.out.println("Panjang inputan : "+ totInput);
        }
        if(spasi > 0){
            System.out.println("Jumlah spasi : "+ spasi);
        }
        if(koma > 0){
            System.out.println("Jumlah koma : "+ koma);
        }
        if(titik > 0){
            System.out.println("Jumlah titik : "+ titik);
        }
        if(eM > 0){
            System.out.println("Jumlah Exclamation Mark : "+ eM);
        }
        if(qM > 0){
            System.out.println("Jumlah Question Mark : "+ qM);
        }
        if(kBuka > 0){
            System.out.println("Jumlah kurung buka : "+ kBuka);
        }
        if(kTutup > 0){
            System.out.println("Jumlah kurung tutup : "+ kTutup);
        }
        if(kbKurawal > 0){
            System.out.println("Jumlah kurung buka kurawal : "+ kbKurawal);
        }
        if(ktKurawal > 0){
            System.out.println("Jumlah kurung tutup kurawal : "+ ktKurawal);
        }

        // System.out.println(vokal > 0 ? "Jumlah huruf vokal : " + vokal : "");
        // System.out.println(konsonan > 0 ? "Jumlah huruf konsonan : " + konsonan : "");
    }
}