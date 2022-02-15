package functional_Programming_with_Java;

public interface Trifunction <T,U,V,R> {
	R apply(T t, U u, V v);
}