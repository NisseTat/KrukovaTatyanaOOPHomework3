import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.compareTo(o2);
    }
}
