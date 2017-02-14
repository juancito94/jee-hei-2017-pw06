package service.impl;

import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Juan on 14/02/2017.
 */

@Named
@Transactional
public class DataBaseInitializer {

    private final static Logger LOGGER = LoggerFactory.getLogger(DataBaseInitializer.class);

}
