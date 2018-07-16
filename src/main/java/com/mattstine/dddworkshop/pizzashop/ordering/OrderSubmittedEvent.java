package com.mattstine.dddworkshop.pizzashop.ordering;

import com.mattstine.dddworkshop.pizzashop.infrastructure.Event;
import lombok.Value;

/**
 * @author Matt Stine
 */
@Value
class OrderSubmittedEvent implements OrderEvent {
	OrderRef ref;
}
