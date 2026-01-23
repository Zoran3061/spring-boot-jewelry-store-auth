package com.metropolitan.pz.service;

import com.metropolitan.pz.entities.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CartService {

    public Cart addToCart(Cart cart);

    public List<Cart> getCartItemsByUserId(Long userId);

    public Optional<Cart> getCartItemById(Long cartId);

    public Cart updateCartItem(Long cartId, Cart updatedCart);

    public void deleteCartItem(Long cartId);

    public void deleteCartItemByUserId(Long userId);


}

