package com.fermi.test.creator;

import com.fermi.desigin.creator.prototype.ConcretePrototype1;
import com.fermi.desigin.creator.prototype.ConcretePrototype2;
import com.fermi.desigin.creator.prototype.Prototype;
import com.fermi.desigin.creator.prototype.PrototypeManager;

public class ProtoTypeClient {

    /**
     * 对象的clone，这样能够避免重复创建对象的消耗。android虚拟机创建进程使用很多。
     * <p>
     * 优点：
     * 1. 原型模式允许在运行时动态改变具体的实现类型。
     * 2. 原型模式可以在运行期间，由客户来注册符合原型接口的实现类型，也可以动态地改变具体的实现类型，看起来接口没有任何变化，但其实运行的已经是另外一个类实例了。
     * 3. 因为克隆一个原型就类似于实例化一个类。
     * 缺点：
     * 1. 原型模式最主要的缺点是每一个类都必须配备一个克隆方法。
     * 2. 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类来说不是很难，而对于已经有的类不一定很容易，特别是当一个类引用不支持序列化的间接对象，或者引用含有循环结构的时候。
     */
    public static void main(String[] args) {
        try {
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("p1", p1);
            //获取原型来创建对象
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例：" + p3);
            //有人动态的切换了实现
            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("p1", p2);
            //重新获取原型来创建对象
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第二个实例：" + p4);
            //有人注销了这个原型
            PrototypeManager.removePrototype("p1");
            //再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
