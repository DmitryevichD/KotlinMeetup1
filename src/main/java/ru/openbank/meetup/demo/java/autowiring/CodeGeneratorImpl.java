package ru.openbank.meetup.demo.java.autowiring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeGeneratorImpl implements CodeGeneratorService {
    private final UsedCodeRepository usedCodeRepository;
}
