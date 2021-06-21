//課題1-1
class Main1 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      sum += i;
    }

    System.out.println(sum);
  }
}

// 課題1-２
class Main2 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}
