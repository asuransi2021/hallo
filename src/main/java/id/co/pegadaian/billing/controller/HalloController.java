package id.co.pegadaian.billing.controller;

import id.co.pegadaian.billing.util.Helper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hallo")
public class HalloController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @GetMapping(path = {"/list","","/"})
    public ResponseEntity<Object> hallo() {
        try {
            return ResponseEntity.ok().body(
                    "Current time is " + Helper.getNow()
            );
        } catch (
                Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
