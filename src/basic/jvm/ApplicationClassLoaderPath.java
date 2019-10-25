package basic.jvm;

public class ApplicationClassLoaderPath {
    public static void main(String[] args) {
        java.lang.ClassLoader loader = ApplicationClassLoaderPath.class.getClassLoader();
        System.out.println(loader.getResource("basic/jvm/ApplicationClassLoaderPath.class"));
    }
}
