public class Sex {
    public static String MAN = "man";
    public static String WOMEN = "women";

    private String sex;

    public Sex(String sex) {
        this.sex = sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
