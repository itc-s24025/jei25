public class D52ensyu {
    public static void main(String[] args) {
        Animal tama = new Cat();       // Cat のインスタンス tama
        Animal ao = new Horse();       // Horse のインスタンス ao
        tama.bark();
        ao.bark();
    }
}

// 親クラス
class Animal {
    public void bark() {
        System.out.println("動物の鳴き声");
    }
}

// 子クラス
class Cat extends Animal {
    public void bark() {
        System.out.println("にゃーん");
    }
}

// 子クラス
class Horse extends Animal {
    public void bark() {
        System.out.println("ひひーん");
    }
}