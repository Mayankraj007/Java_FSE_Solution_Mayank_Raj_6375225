import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [section, setSection] = useState('book');

  return (
    <div>
      <h1>Blogger App</h1>
      <button onClick={() => setSection('book')}>Book Details</button>
      <button onClick={() => setSection('blog')}>Blog Details</button>
      <button onClick={() => setSection('course')}>Course Details</button>

      {/* Conditional Rendering - Way 1: if-else style */}
      {section === 'book' && <BookDetails />}
      {section === 'blog' && <BlogDetails />}
      {section === 'course' && <CourseDetails />}
    </div>
  );
}

export default App;
