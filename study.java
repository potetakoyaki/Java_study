class Study1 {
  // 比較演算
  public static void main(String[] args) {
    System.out.println(true);

    System.out.println(false);

    System.out.println(12 / 4 == 3);

    System.out.println(12 / 4 != 3);

    boolean bool = (3 * 9 == 27);

    System.out.println(bool);
  }
}

// while文
class Study2 {
  public static void main(String[] args) {
    int number = 10;
    while (number > 0) {
      System.out.println(number);
      number--;
    }
  }
}

// for文
class Study3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "回目のループです");
    }
  }
}

// break,continue
class Study4 {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      if (i % 5 == 0) {
        break;
      }
      System.out.println(i);
      i++;
    }

    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      if (j % 3 == 0) {
        continue;
      }
      System.out.println(j);
    }
  }
}

class Study5 {
  public static void main(String[] args) {
    String[] names = { "にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ" };
    System.out.println(names[0]);
    System.out.println(names[2]);
  }
}

// メソッドのについて
class Study6 {
  public static void main(String[] args) {
    hello();
  }

  public static void hello() {
    System.out.println("Hello Java");
  }
}

// メソッドの引数
class Study7 {
  public static void main(String[] args) {
    printData("kate Jones");
    printData("John Christopher Smith");
  }

  public static void printData(String name) {
    System.out.println("私の名前は" + name + "です");
  }
}

// 複数の引数
class Study8 {
  public static void main(String[] args) {
    printData("Kate Jones", 27);
    printData("John Christopher Smith", 65);
  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "です");
  }
}

// 戻り値
class Study9 {
  public static void main(String[] args) {
    int total = add(7,5);
    System.out.println(total);
  }

  public static int add(int a, int b) {
    return a + b;
  }
}