package mydogcherry.kr.gongcha.entities.menu;

public class BingsuEntity { //빙수 정보를 저장하는 Entity

    private int index; //순서
    private String menu; //메뉴
    private int price; //가격
    private int amount; //양
    private int kcal; //칼로리
    private int sugars; //당류
    private int protein; //단백질
    private double saturatedFat; //포화지방
    private int natrium; //나트륨
    private String content; //메뉴 설명
    private String imageFile; //메뉴 이미지 파일

    public BingsuEntity() {} //빈 생성자

    public BingsuEntity(int index, String menu, int price, int amount, int kcal, int sugars, int protein, double saturatedFat,
                        int natrium, String content, String imageFile) { //모든 변수를 담는 생성자
        this.index = index;
        this.menu = menu;
        this.price = price;
        this.amount = amount;
        this.kcal = kcal;
        this.sugars = sugars;
        this.protein = protein;
        this.saturatedFat = saturatedFat;
        this.natrium = natrium;
        this.content = content;
        this.imageFile = imageFile;
    }

    //각 변수들의 getter / setter 생성
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public int getSugars() {
        return sugars;
    }

    public void setSugars(int sugars) {
        this.sugars = sugars;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public int getNatrium() {
        return natrium;
    }

    public void setNatrium(int natrium) {
        this.natrium = natrium;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
}
