void testMethod(Rectangle rectangle){
    rectangle.setWidth(20);
}
传入的对象为Square的时候，height并没有被改变

继承虽然是is-a，但是并不是真实世界中的关系
这种is-a是相同行为的时候才会使用

LSP
程序中子类替换父类后，程序行为保持不变