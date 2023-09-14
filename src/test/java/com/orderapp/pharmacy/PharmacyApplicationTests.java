package com.orderapp.pharmacy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.orderapp.pharmacy.security.jwt.JwtProperties;

@SpringBootTest
class PharmacyApplicationTests {

	@Autowired
    private JwtProperties yamlFooProperties;

    @Test
    public void whenFactoryProvidedThenYamlPropertiesInjected() {
		assertEquals(yamlFooProperties.getCookiename(),"cmoreno");
		assertEquals(yamlFooProperties.getSecretkey(),"o0xEXh3P*SX;mlZcT'Y)+Vd2p+}*V");
    }

}
