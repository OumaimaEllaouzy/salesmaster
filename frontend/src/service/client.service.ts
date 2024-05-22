
import axios from "axios";

const Rest_API_BASE_URL = "http://localhost:8080/api/client";


export const listclient = () => {
    return axios.get(Rest_API_BASE_URL);
}

export const createclient = (client: any) => axios.post(Rest_API_BASE_URL, client)

export const getclient = (clientid: any) => axios.get(Rest_API_BASE_URL+'/'+clientid)

export const updateclient = (clientId : any , client: any) => axios.put(Rest_API_BASE_URL+'/'+clientId, client)

export const deleteclient = (clientId: any) => axios.delete(Rest_API_BASE_URL + '/' + clientId)
