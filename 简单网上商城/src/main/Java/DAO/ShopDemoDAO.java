package DAO;

import Util.Address;
import Util.ShopInfo;
import Util.User;

import java.util.ArrayList;

public interface ShopDemoDAO {
    public User SearchByName(String username);
    public ArrayList<ShopInfo> SerchAll();
    public ShopInfo SerachShop(String shopname);
    public void AddAccountsInfo(ShopInfo shopinfo,String owner);
    public ArrayList<Address> SerchAddress();
    public void AddAddress(Address ads);
    public Address SearchAddress(String name);
    public void AddShopCar(ShopInfo shopinfo,String owner);
    public ArrayList<ShopInfo> SerachShopCar(String owner);
    public int AddUser(User user);
    public ArrayList<ShopInfo> SearchShopinfo(String message);
    public void CutShopInfoNumber(String shopname,int number);
    public void DeleteShopCar(String shopname,String owner);
    public int SearchShopcar(String shopname,String owner);
    public void UpdateShopCar(String shopname,String owner);
    public void UpdatePageShopCar(String shopname,String owner);
    public void ShopCarClear(String shopname,String owner);
    public int DeleteShop(String shopname);
    public int AddShop(ShopInfo shop);
    public int ModifyShopInfo(ShopInfo shop);
}
