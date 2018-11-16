import com.sun.prism.shader.Solid_ImagePattern_Loader;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



public class Rustemval_bot extends TelegramLongPollingBot {

    public static void main(String[] args) {

    }

    public void onUpdateReceived(Update update) {



        String command=update.getMessage().getText();

        SendMessage message = new SendMessage();

        if (command.equals("/myname")){
            System.out.println(update.getMessage().getFrom().getFirstName());

            message.setText(update.getMessage().getFrom().getFirstName());
        }

        if (command.equals("/mylastname")){
            System.out.println(update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getLastName());
        }

        if (command.equals("/myfullname")){
            System.out.println(update.getMessage().getFrom().getFirstName() +" "+ update.getMessage().getFrom().getLastName());

       message.setText(update.getMessage().getFrom().getFirstName() +" "+ update.getMessage().getFrom().getLastName());
        }

        message.setChatId(update.getMessage().getChatId());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public String getBotUsername() {
        return "rustemval_bot";
    }

    public String getBotToken() {
        return "694933672:AAFhMeb08dWZuDqoZnOSqBhI5BoIpsKYnr8";
    }
}
