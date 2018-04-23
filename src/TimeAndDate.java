import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld/time")
public class TimeAndDate {

  @GET
  // The Java method will produce content identified by the MIME Media type "text/plain"
  @Produces("text/plain; charset=UTF-8")
  public String getClichedMessage() throws ParseException {

    // (1) get today's date
    Date today = Calendar.getInstance().getTime();

    // (2) create a date "formatter" (the date format we want)
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");

    // (3) create a new String using the date format we want
    String actualDateFormated = formatter.format(today);

    return actualDateFormated;
  }
}
