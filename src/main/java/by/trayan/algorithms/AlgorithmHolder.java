package by.trayan.algorithms;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class AlgorithmHolder {

    private static final Logger logger = LoggerFactory.getLogger(AlgorithmHolder.class);
    private final List<Algorithm> algorithmList;

    @Autowired
    public AlgorithmHolder(List<Algorithm> algorithmList) {
        this.algorithmList = algorithmList;
    }

    @PostConstruct
    public void init() {
        final int randomIndex = ThreadLocalRandom.current().nextInt(algorithmList.size());
        logger.warn("Random algo is : " + algorithmList
                .get(randomIndex)
                .getClass()
                .getSimpleName());
    }
}
