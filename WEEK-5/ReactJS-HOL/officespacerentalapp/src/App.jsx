import officeImage from "./assets/office.jpg";

function App() {

  const office = {
    name: "Tech Park Office",
    rent: 55000,
    address: "Madhapur, Hyderabad"
  };

  const officeSpaces = [
    {
      id: 1,
      name: "Tech Park Office",
      rent: 55000,
      address: "Hyderabad"
    },
    {
      id: 2,
      name: "Cyber Towers",
      rent: 75000,
      address: "Bangalore"
    },
    {
      id: 3,
      name: "Business Hub",
      rent: 45000,
      address: "Chennai"
    }
  ];

  return (

      <div style={{ padding: "20px" }}>

        <h1>Office Space Rental App</h1>

        <img
            src={officeImage}
            alt="Office"
            width="400"
            height="250"
        />

        <hr />

        <h2>Single Office Details</h2>

        <h3>Name: {office.name}</h3>

        <h3
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
        >
          Rent: ₹{office.rent}
        </h3>

        <h3>Address: {office.address}</h3>

        <hr />

        <h2>Office Space List</h2>

        {
          officeSpaces.map((item) => (

              <div
                  key={item.id}
                  style={{
                    border: "1px solid gray",
                    padding: "15px",
                    marginBottom: "15px"
                  }}
              >

                <h3>Name: {item.name}</h3>

                <h3
                    style={{
                      color: item.rent < 60000 ? "red" : "green"
                    }}
                >
                  Rent: ₹{item.rent}
                </h3>

                <h3>Address: {item.address}</h3>

              </div>

          ))
        }

      </div>

  );

}

export default App;