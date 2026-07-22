import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (

      <div style={{padding:"20px"}}>

        <h1>Blogger App</h1>

        {/* Way 1 : if using && */}

        {showBooks && <BookDetails />}

        <hr />

        {/* Way 2 : Ternary */}

        {showBlogs ? <BlogDetails /> : <h2>No Blogs Available</h2>}

        <hr />

        {/* Way 3 : Element Variable */}

        {

          (() => {

            let component;

            if(showCourses){

              component = <CourseDetails />

            }else{

              component = <h2>No Courses</h2>

            }

            return component;

          })()

        }

      </div>

  );

}

export default App;