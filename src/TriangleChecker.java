public class TriangleChecker {
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh tam giác phải lớn hơn 0.");
        } else{
            throw new IllegalTriangleException("Tổng của 2 cạnh phải lớn hơn cạnh thứ 3.");
        }
    }
}
