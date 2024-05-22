import axios from "axios";

const Rest_API_BASE_URL = "http://localhost:8080:api/produits";


export const listProduit= () => {
    return axios.get(Rest_API_BASE_URL);
}

export const createProduit = (produits: any) => axios.post(Rest_API_BASE_URL, produits)

export const getProduit =(ProduitId: any) => axios.get(Rest_API_BASE_URL + '/' + ProduitId)

export const updateProduit = (ProduitId: any, vente: any) => axios.put(Rest_API_BASE_URL + '/' + ProduitId)

export const deleteProduit = (ProduitId: any) => axios.delete(Rest_API_BASE_URL + '/' + ProduitId)