class QueueMain {
  public static void main(String[] args) {
      arrayQueue obj = new arrayQueue();
      obj.insert(10);
      obj.insert(20);
      obj.insert(30);
      obj.insert(40);
      obj.insert(50);
      obj.insert(60);
      obj.print();
      obj.delete();
      obj.print();
  }
}