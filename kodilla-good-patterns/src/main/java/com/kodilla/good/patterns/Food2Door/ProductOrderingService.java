package com.kodilla.good.patterns.Food2Door;

public class ProductOrderingService {

    private OrderInformation orderInformation;
    private OrderingService orderingService;
    private OrderingRepository orderingRepository;

    public ProductOrderingService(OrderInformation orderInformation, OrderingService orderingService, OrderingRepository orderingRepository) {
        this.orderInformation = orderInformation;
        this.orderingService = orderingService;
        this.orderingRepository = orderingRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderingService.order(orderRequest.getProduct(), orderRequest.getOrderedTime(),
                orderRequest.getProducer());

        if(isOrdered) {
            orderInformation.inform(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getProducer());
            orderingRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),orderRequest.getProducer(),
                    orderRequest.getOrderedTime());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct());
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct());
        }
    }
}
