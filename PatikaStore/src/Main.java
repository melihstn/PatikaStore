import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> brandNames = new ArrayList<>(Arrays.asList("samsung", "lenovo", "apple", "huawei", "casper", "asus", "hp", "xiaomi", "monster"));
        List<MobilePhone> telephones = addMobilePhone();
        List<Notebook> notebooks = addNotebook();




        String  islemler = "1. Notebook işlemleri \n"
                        +  "2. Cep telefonu işlemleri \n"
                        +  "3. Marka işlemleri \n"
                        +  "4. Ürün ekle \n"
                        +  "5. Ürün sil \n"
                        +  "0. Çıkış yap\n";



        Scanner scan = new Scanner(System.in);
        System.out.println(islemler);




        while(true) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
            int islem = scan.nextInt();

            if (islem == 1) {

                ListedNotebook(notebooks);


            } else if (islem == 2) {

                ListedMobilePhone(telephones);



            } else if (islem == 3) {

                listedBrands(brandNames);





            }else if (islem == 4){

                addProduct(brandNames,telephones,notebooks);




            } else if (islem == 5) {

                delete(telephones,notebooks);


            } else if(islem == 0){

                System.out.println("Program sonlandırılıyor...");
                break;
            }else {
                System.out.println("lütfen seçinizi kontrol ediniz!");
            }
        }
    }
    private static void listedBrands(List<String> brandNames) {
        List<Brand> brands = new ArrayList<>();
        for (int i = 0; i < brandNames.toArray().length; i++) {
            brands.add(new Brand(brandNames.get(i)));
        }
        Collections.sort(brands);
        for (Brand b : brands) {
            System.out.println("-" + b.getName().toUpperCase());
        }
    }

    private static List<MobilePhone> addMobilePhone(){

        List<MobilePhone> mobilePhones = new ArrayList<>();

        mobilePhones.add(new MobilePhone(1,"Samsung",8999,15,40,"A54",64,5.2,2,4000,"siyah"));
        mobilePhones.add(new MobilePhone(2,"Apple",8999,15,40,"X",64,5.2,2,4000,"beyaz"));
        mobilePhones.add(new MobilePhone(3,"XIAOMI",8999,15,40,"RED MI",64,5.2,2,4000,"mavi"));


        return mobilePhones;
    }
    private static void ListedMobilePhone(List<MobilePhone> mobilePhones){
        System.out.format("%-5s %-8s %-25s %-14s %-10s %-10s %-10s %-10s\n", "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|Hafıza|", "|Bellek|", "|Size|", "|Renk|");
        System.out.println("___________________________________________________________________________________________");
        for (MobilePhone m : mobilePhones){
            System.out.format(" %-4s %-10s %-23s %-15s %-10s %-10s %-10s %-10s\n", m.getId(), m.getMarka(), m.getName(), m.getFiyat() + " TL", m.getHafiza() + " GB", m.getRam() + " GB", m.getEkranBoyutu()+"`"+ m.getRenk());

        }
    }
    private static List<Notebook> addNotebook(){
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook(1,"Xcalibur",28000,15,30,"Casper",512,18,4000,16,"siyah"));
        notebooks.add(new Notebook(2,"Asus10",15000,15,30,"Asus",512,18,4000,16,"siyah"));
        notebooks.add(new Notebook(3,"Hpx",20000,15,30,"HP",512,18,4000,16,"siyah"));

        return notebooks;
    }
    private static void ListedNotebook(List<Notebook> notebooks) {
        System.out.format("%-5s %-8s %-22s %-11s %-10s %-10s %-10s\n", "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|Hafıza|", "|Bellek|", "|Size|");
        System.out.println("______________________________________________________________________________________________");
        for (Notebook n : notebooks) {
            System.out.format(" %-4s %-8s %-21s %-13s %-10s %-10s %-10s\n", n.getId(), n.getMarka(), n.getName(), n.getFiyat() + " TL", n.getHafiza() + " GB", n.getRam() + " GB", +n.getEkranBoyutu() + "`");

        }
    }
    private static void delete(List<MobilePhone> mobilePhones,List<Notebook> notebooks){
        Scanner scanner = new Scanner(System.in);
        System.out.println("telefon silmek için 1 e bilgisayar silmek için 2 ye basınız.");
        int select = scanner.nextInt();

        if (select == 1){
            addMobilePhone();
            System.out.println("silmek istediğiniz ürünün kodunu giriniz :");
            int id = scanner.nextInt();
            mobilePhones.removeIf(mobilePhone -> mobilePhone.getId()== id);
        }

        if (select == 2) {
            addNotebook();
            System.out.println("silmek istediğiniz ürünün kodunu giriniz :");
            int id = scanner.nextInt();
            notebooks.removeIf(notebook -> notebook.getId() == id);
        }

    }



    public static void addProduct(List<String> markaAdı, List<MobilePhone> mobilePhones, List<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen eklemek istediğiniz ürünü seçiniz (Telefon için 1 e Notebook için 2 ye basınız) : ");
        List<String> values = new ArrayList<>();
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                String[] brands = new String[]{"Marka", "Model", "Fiyat", "İndirim", "Stok", "Hafıza", "Boyut", "Pil", "Ram", "Color"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = scanner.next();
                    while (brand.equals("Marka") && !markaAdı.contains(value.toLowerCase())) {
                        System.out.print(brand + "`ı tekrar gir" + ": ");
                        value = scanner.next();
                    }
                    values.add(value);

                }
            case 2:
                String[] brands2 = new String[]{"Marka", "Model", "Fiyat", "İndirim", "Stok", "Hafıza", "Boyut", "Ram"};
                for (String brand : brands2) {
                    System.out.print(brand + ": ");
                    String value = scanner.next();
                    while (brand.equals("Marka") && !markaAdı.contains(value.toLowerCase())) {
                        System.out.print(brand + "`ı tekrar gir" + ": ");
                        value = scanner.next();
                    }
                    values.add(value);


                }


        }
    }
}































