import React from "react";

class PersonalPageComponent extends React.Component {
    render() {
        return (
            <section className="PersonalPage">
                <div className="StudentCard">
                    <h1>Студенческий билет</h1>
                    <div className="StudentImage--container">
                        <img className="image studentImage"/>
                    </div>
                    <div className="StudentInfo">
                        <h2></h2>
                    </div>
                </div>
            </section>
        )
    }
}

export default PersonalPageComponent;