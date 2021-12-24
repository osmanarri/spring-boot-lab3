import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component{

    constructor(props){
        super(props)

        this.state ={
            users:[]
        }
    }

    componentDidMount(){

        UserService.getUser().then((response) => {

            this.setState({users: response.data})

        });
    }

    render(){

        return(

        <div>
            <h1 className="text-center">Seekers List</h1>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <td> ID</td>
                        <td> First Name</td>
                        <td> Last Name</td>
                        <td> Age</td>
                        <td> Gender</td>
                        <td> City</td>
                        <td> Phone</td>
                        
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.users.map(

                            user=>
                            <tr key = {user.id}>
                                <td>{user.id}</td>
                                <td>{user.firstName}</td>
                                <td>{user.lastName}</td>
                                <td>{user.age}</td>
                                <td>{user.gender}</td>
                                <td>{user.city}</td>
                                <td>{user.phone}</td>
                              
                            </tr>
                        )
                    }

                    
                </tbody>
            </table>
        </div>
    )   
 }

}

export default UserComponent;