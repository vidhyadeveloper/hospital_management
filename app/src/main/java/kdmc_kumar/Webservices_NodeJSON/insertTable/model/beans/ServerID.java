/*
  File generated by Magnet rest2mobile 1.1 - Nov 2, 2017 12:56:35 PM

  @see {@link http://developer.magnet.com}
 */

package kdmc_kumar.Webservices_NodeJSON.insertTable.model.beans;


/**
 * Generated from json example
 {
 "Id" : 334
 }

 */

public class ServerID {


    @com.google.gson.annotations.SerializedName("Id")
    private Integer id = null;

    public ServerID() {
    }

    public final Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Builder for ServerID
     **/
    public static class ServerIDBuilder {
        private final ServerID toBuild = new ServerID();

        public ServerIDBuilder() {
        }

        public final ServerID build() {
            return toBuild;
        }

        public final ServerIDBuilder id(Integer value) {
            toBuild.setId(value);
            return this;
        }
    }
}
