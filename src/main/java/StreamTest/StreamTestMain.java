package StreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestMain {
    public static void main(String[] args) {
        DTO d1 = new DTO("aa", "aa");
        DTO d2 = new DTO("bb", "bb");
        DTO d3 = new DTO("cc", "cc");
        List<DTO> list = Arrays.asList(d1, d2, d3);

        list.stream().map(dto -> new VO(dto.name, dto.value)).forEach(VO::toString);

    }
}
