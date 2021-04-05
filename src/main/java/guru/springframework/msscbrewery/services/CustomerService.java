package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

/**
 * Created by jt on 2019-04-20.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
