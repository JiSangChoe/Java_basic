package practice;

class Connection {
    private static Connection _inst = null;
    private int count = 0;

    static public Connection get() {
        if (_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class test4 {
    public static void main(String[] args) {
        Connection conn1 = Connection.get();
        conn1.count();
        Connection conn2 = Connection.get();
        conn2.count();
        Connection conn3 = Connection.get();
        conn3.count();

        System.out.println(conn1.getCount());
    }
}

// 이 코드는 Singleton 디자인 패턴의 예입니다. Connection 클래스는 자신의 private static 인스턴스와 이 인스턴스를 가져오는 get() 메소드를 가지고 있습니다. 인스턴스가 존재하지 않으면 생성됩니다. 이것은 애플리케이션 전체에서 Connection 클래스의 인스턴스가 하나만 있도록 보장합니다.

// count() 메소드는 카운터를 증가시키고, getCount()는 현재 카운트를 반환합니다.

// test4 클래스의 main 메소드에서는 Connection의 인스턴스를 세 번 가져와서 각각 카운트를 증가시킵니다. Connection이 싱글톤이므로 conn1, conn2, conn3는 모두 같은 인스턴스이므로 카운트는 그들 사이에서 공유됩니다.

// conn1.getCount()를 출력하면, conn1, conn2, conn3 각각에서 카운트를 증가시켰으므로 3이 출력됩니다. 이것이 이 코드의 실행 결과입니다. 이렇게 되는 이유는 Connection 클래스가 싱글톤 디자인 패턴을 사용하고 있기 때문입니다. 이 패턴은 클래스의 인스턴스가 하나만 생성되도록 보장하며, 이 인스턴스는 애플리케이션 전체에서 공유됩니다. 따라서 conn1, conn2, conn3는 모두 같은 인스턴스를 참조하고 있으므로, count() 메소드를 호출할 때마다 동일한 카운트 변수가 증가합니다. 이것이 왜 conn1.getCount()가 3을 출력하는지에 대한 설명입니다
