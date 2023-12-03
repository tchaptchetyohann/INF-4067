package adapterexemple2;

public class DListImpStack implements Stack {
DList dist= new DList();
public void push(Object o) {
	dist.insertTail(o);
}
public Object pop() {
	return dist.removeTail();
};
public Object top() {
	return dist.getTail();
}
}
