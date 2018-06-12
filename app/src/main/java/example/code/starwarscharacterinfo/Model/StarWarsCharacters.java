package example.code.starwarscharacterinfo.Model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StarWarsCharacters implements Parcelable {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    public final static Parcelable.Creator<StarWarsCharacters> CREATOR = new Creator<StarWarsCharacters>() {


        @SuppressWarnings({
                "unchecked"
        })
        public StarWarsCharacters createFromParcel(Parcel in) {
            return new StarWarsCharacters(in);
        }

        public StarWarsCharacters[] newArray(int size) {
            return (new StarWarsCharacters[size]);
        }

    }
            ;

    protected StarWarsCharacters(Parcel in) {
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.next = ((String) in.readValue((String.class.getClassLoader())));
        this.previous = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.results, (Result.class.getClassLoader()));
    }

    public StarWarsCharacters() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(count);
        dest.writeValue(next);
        dest.writeValue(previous);
        dest.writeList(results);
    }

    public int describeContents() {
        return 0;
    }

}
