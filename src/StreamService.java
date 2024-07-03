import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    private List<Stream> streams;

    public List<Stream> getSortedStreamList() {
        List<Stream> soretedStreams = new ArrayList<>(streams);
        soretedStreams.sort(new StreamComparator());
        return soretedStreams;
    }
}
