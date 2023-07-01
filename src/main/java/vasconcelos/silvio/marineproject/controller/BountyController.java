package vasconcelos.silvio.marineproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vasconcelos.silvio.marineproject.data.Bounty;
import vasconcelos.silvio.marineproject.data.Pirate;
import vasconcelos.silvio.marineproject.repository.PirateRepository;

import static java.lang.Thread.sleep;

@RestController
@RequestMapping("/api/bounty")
@AllArgsConstructor
public class BountyController {

    private PirateRepository pirateRepository;

    @GetMapping("/{pirateName}")
    public Bounty getBounty(@PathVariable String pirateName) throws InterruptedException {
        sleep(2000);
        return pirateRepository.findById(pirateName).map(this::generateBounty).orElse(null);
    }

    public Bounty generateBounty(Pirate pirate) {
        return new Bounty(pirate.getName(), pirate.getBounty());
    }


}
