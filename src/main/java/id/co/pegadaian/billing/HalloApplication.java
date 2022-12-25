package id.co.pegadaian.billing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HalloApplication {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(HalloApplication.class, args);
    }

//    @Autowired
//    ParameterRepository parameterRepository;
//
//    @Autowired
//    TransactionRepository transactionRepository;
//
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            System.out.println("initialize data");
//            try {
//                transactionRepository.deleteAll();
//                parameterRepository.deleteAll();
//
////                parameterRepository.save(ParameterItem.builder()
////                        .header("GENERAL").code("OPEN").value("2")
////                        .description("Open Time for GENERAL")
////                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
////                parameterRepository.save(ParameterItem.builder()
////                        .header("GENERAL").code("CLOSE").value("22")
////                        .description("Open Time for GENERAL")
////                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//
//                // Param for Open & Close Time
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9992").code("OPEN").value("2")
//                        .description("Open Time for PDS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9992").code("CLOSE").value("22")
//                        .description("Close Time for PDS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9994").code("OPEN").value("2")
//                        .description("Open Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9994").code("CLOSE").value("22")
//                        .description("Close Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9997").code("OPEN").value("2")
//                        .description("Open Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9997").code("CLOSE").value("22")
//                        .description("Close Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//
//                //Param for Open & Close Time End Date
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9992").code("OPEN_ENDDATE").value("2")
//                        .description("End Date Open Time for PDS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9992").code("CLOSE_ENDDATE").value("20")
//                        .description("End Date Close Time for PDS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9994").code("OPEN_ENDDATE").value("2")
//                        .description("End Date Open Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9994").code("CLOSE_ENDDATE").value("20")
//                        .description("End Date Close Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9997").code("OPEN_ENDDATE").value("2")
//                        .description("End Date Open Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//                parameterRepository.save(ParameterItem.builder()
//                        .header("9997").code("CLOSE_ENDDATE").value("20")
//                        .description("End Date Close Time for PDSS")
//                        .id(UUID.randomUUID()).createdDate(LocalDateTime.now()).build());
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        };
//    }

}
