import FlightDetails from "./FlightDetails";

function Guest() {

    return (

        <div>

            <h1>Welcome Guest</h1>

            <p>You can view available flights.</p>

            <FlightDetails />

            <h3>Please Login to Book Tickets.</h3>

        </div>

    );

}

export default Guest;