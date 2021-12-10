import React from "react";
import StudentCardComponent from "./StudentCard/StudentCardComponent";
import DocumentComponent from "../Document/DocumentComponent";
import "./PersonalPageComponent.css"

class PersonalPageComponent extends React.Component {
    render() {
        return (
            <section className="personalPage">
                <StudentCardComponent/>
                <DocumentComponent/>
            </section>
        )
    }
}

export default PersonalPageComponent;