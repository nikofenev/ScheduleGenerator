package edu.matc.persistence;import org.apache.log4j.Logger;import org.json.*;import org.junit.Test;import javax.ws.rs.client.*;import javax.ws.rs.core.MediaType;import static org.junit.Assert.*;/** * Created on 11/10/17 at 12:16 PM * * @author nfenev */public class testHolidayAPI {    private final Logger logger = Logger.getLogger(this.getClass());    /**     * Test google api json.     *     * @throws Exception the exception     */    @Test    public void testGoogleApiJSON() throws Exception {        Client client = ClientBuilder.newClient();        WebTarget target =                client.target("https://holidayapi.com/v1/holidays?key=524bea85-1423-4ee7-97af-3d3c968b3283&country=US&year=2016&month=11");        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);        assertEquals("????", response);    }}